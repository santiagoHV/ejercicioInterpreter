package view;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class GraphicInterface extends JFrame {
    private JPanel panel;
    private JLabel title;

    private JComboBox cmbQVariables;
    private JLabel lblResult;
    private String[] variablesQ = {"2", "3", "4","5", "6", "7", "8", "9", "10"};
    private JTextField txtOperation;
    private JButton btnCalculate;

    public GraphicInterface() {
        panel = new JPanel();
        panel.setSize(300, 300);

        cmbQVariables = new JComboBox();




        for (int i = 0; i < Array.getLength(variablesQ); i++) {
            cmbQVariables.addItem(variablesQ[i]);
        }

        //create labels
        title = new JLabel("Calculadora");
        lblResult = new JLabel("Resultado: ");

        //create text field
        txtOperation = new JTextField(20);

        //create button
        btnCalculate = new JButton("Calcular");

        GridBagLayout gridbag = new GridBagLayout();
        panel.setLayout(gridbag);
        GridBagConstraints gbc = new GridBagConstraints();

        //add components to the panel
        panel.add(title);
        panel.add(cmbQVariables);
        panel.add(txtOperation);
        panel.add(btnCalculate);
        panel.add(lblResult);

        gbc.insets.top = 5;
        gbc.insets.bottom = 5;
        gbc.insets.left = 5;
        gbc.insets.right = 5;

        gbc.gridx = 0;
        gbc.gridy = 0;
        gridbag.setConstraints(title, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gridbag.setConstraints(cmbQVariables, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gridbag.setConstraints(lblResult, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gridbag.setConstraints(btnCalculate, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;


        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);






    }
}
