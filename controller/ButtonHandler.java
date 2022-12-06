package controller;

import view.GraphicInterface;
import view.UIBuilder;
import view.ValueFieldsBuilder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {

    GraphicInterface graphicInterface;

    UIBuilder uiBuilder;

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
            uiBuilder.addUIControls();
            graphicInterface.displayNewUI(uiBuilder.getSearchUI());
        }
    }
}
