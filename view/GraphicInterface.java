package view;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;

public class GraphicInterface extends JFrame {

    public static final String EXIT = "Exit";

    public static final String CALCULATE = "Calculate";
    private final JPanel panel;
    private final JLabel title;

    private final JComboBox<String> cmbQVariables;
    private final JLabel lblResult;
    private final String[] variablesQ = {"2", "3", "4","5", "6", "7", "8", "9", "10"};
    private final JTextField txtOperation;
    private final JButton btnCalculate;

    private final JButton btnExit;

    public GraphicInterface() {
        panel = new JPanel();
        panel.setSize(300, 900);

        cmbQVariables = new JComboBox<String>();

        for (int i = 0; i < Array.getLength(variablesQ); i++) {
            cmbQVariables.addItem(variablesQ[i]);
        }

        //create labels
        title = new JLabel("Calculadora: ");
        lblResult = new JLabel("Resultado: ");

        //create text field
        txtOperation = new JTextField(20);

        //create button
        btnCalculate = new JButton(CALCULATE);

        btnExit = new JButton(EXIT);

        //add components to the panel
        title.setBounds(25, 25, 100, 30);
        panel.add(title);

        cmbQVariables.setBounds(115, 30, 100, 20);
        panel.add(cmbQVariables);

        txtOperation.setBounds(25, 85, 100, 20);
        panel.add(txtOperation);

        btnCalculate.setBounds(135, 85, 100, 20);
        panel.add(btnCalculate);

        lblResult.setBounds(25, 125, 100, 20);
        panel.add(lblResult);

        btnExit.setBounds(25, 165, 100, 20);
        panel.add(btnExit);

        panel.setLayout(null);

        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 400);
        frame.setVisible(true);
    }
}
