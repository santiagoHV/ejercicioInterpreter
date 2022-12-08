package view;

import controller.ButtonHandler;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;

public class GraphicInterface extends JFrame {

    public static final String EXIT = "Exit";

    public static final String CALCULATE = "Calculate";
    private final JPanel panel;

    private final JPanel buildPanel;
    private final JLabel title;

    private final JComboBox<String> cmbQVariables;
    private final JLabel lblResult;

    private final JLabel lblExpression;
    private final String[] variablesQ = {"2", "3", "4","5", "6", "7", "8", "9", "10"};
    private final JTextField txtOperation;
    private final JButton btnCalculate;

    private final JButton btnExit;

    public GraphicInterface() {
        panel = new JPanel();
        panel.setBackground(Color.lightGray);

        cmbQVariables = new JComboBox<String>();

        for (int i = 0; i < Array.getLength(variablesQ); i++) {
            cmbQVariables.addItem(variablesQ[i]);
        }

        //create labels
        title = new JLabel("Calculadora: ");
        lblResult = new JLabel("Resultado: ");
        lblExpression = new JLabel("Expresión: ");

        //create text field
        txtOperation = new JTextField(20);

        //create button
        btnCalculate = new JButton(CALCULATE);
        btnExit = new JButton(EXIT);

        //add action listener
        ButtonHandler handler = new ButtonHandler(this);
        btnCalculate.addActionListener(handler);
        btnExit.addActionListener(handler);
        cmbQVariables.addActionListener(handler);

        //add components to the panel
        title.setBounds(25, 25, 100, 30);
        panel.add(title);

        cmbQVariables.setBounds(115, 30, 100, 20);
        panel.add(cmbQVariables);

        lblExpression.setBounds(250, 25, 100, 30);
        panel.add(lblExpression);

        txtOperation.setBounds(325, 30, 100, 20);
        panel.add(txtOperation);

        buildPanel = new JPanel();
        buildPanel.setBounds(25, 60, 400, 225);

        lblResult.setBounds(25, 300, 100, 20);
        panel.add(lblResult);

        btnCalculate.setBounds(135, 335, 100, 20);
        panel.add(btnCalculate);

        btnExit.setBounds(25, 335, 100, 20);
        panel.add(btnExit);

        panel.add(buildPanel);

        panel.setLayout(null);

        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600, 500);
        frame.setVisible(true);
    }

    public void displayNewUI(JPanel builderPanel) {
        buildPanel.removeAll();
        buildPanel.add(builderPanel);
        buildPanel.validate();
        validate();
    }

    public JComboBox<String> getValuesAmountCtrl() {
        return cmbQVariables;
    }

    public Integer getValuesAmount() {
        return Integer.parseInt(cmbQVariables.getSelectedItem().toString());
    }

    public JTextField getTxtOperation() {
        return txtOperation;
    }

    public JLabel getLblResult() {
        return lblResult;
    }
}
