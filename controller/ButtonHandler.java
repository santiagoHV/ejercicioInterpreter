package controller;

import model.Calculator;
import view.GraphicInterface;
import view.UIBuilder;
import view.UIDirector;
import view.ValueFieldsBuilder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {

    private Context context;

    private final GraphicInterface graphicInterface;

    private UIBuilder uiBuilder;

    private UIDirector uiDirector;

    public ButtonHandler(GraphicInterface graphicInterface) {
        this.graphicInterface = graphicInterface;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(GraphicInterface.EXIT)) {
            System.exit(1);
        }
        if (e.getSource() == graphicInterface.getValuesAmountCtrl()) {
            Integer amount = graphicInterface.getValuesAmount();
            uiBuilder = new ValueFieldsBuilder(amount);
            uiDirector = new UIDirector(uiBuilder);
            uiDirector.build();
            graphicInterface.displayNewUI(uiBuilder.getSearchUI());
        }
        if (e.getActionCommand().equals(GraphicInterface.CALCULATE)) {

            Calculator calc = new Calculator();
            //instantiate the context
            Context ctx = new Context();

            String planeExpression = graphicInterface.getTxtOperation().getText();

            //set the expression to evaluate
            calc.setExpression(planeExpression);

            //configure the calculator with the
            // Context
            calc.setContext(ctx);

            //Get values from fields
            String [] calcValues = uiBuilder.getCalcValues();
            for (int i=0; i<calcValues.length; i++) {
                ctx.assign((char) (97+i)+"", new Integer(calcValues[i]));
            }

            graphicInterface.getLblResult().setText("Resultado: " + calc.evaluate());
        }
    }

}
