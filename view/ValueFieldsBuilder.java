package view;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class ValueFieldsBuilder extends UIBuilder {

    //Create JtextField collection
    private ArrayList<JTextField> txtFields = new ArrayList<JTextField>();

    private Integer intFieldCount;

    private JLabel lblField;

    public ValueFieldsBuilder(Integer intFieldCount) {
        this.intFieldCount = intFieldCount;
    }

    @Override
    public void addUIControls() {
        txtFields.clear();
        searchUI = new JPanel();
        searchUI.setLayout(new GridLayout(intFieldCount, 2));

        for (int i = 0; i < intFieldCount; i++) {
            lblField = new JLabel("Variable : " + (char) (97+i));
            txtFields.add(new JTextField(15));
            searchUI.add(lblField);
            searchUI.add(txtFields.get(i));
        }
    }

    @Override
    public void initialize() {}

    @Override
    public String[] getCalcValues() {
        String[] strValues = new String[intFieldCount];
        for (int i = 0; i < intFieldCount; i++) {
            strValues[i] = txtFields.get(i).getText();
        }
        return strValues;
    }

}
