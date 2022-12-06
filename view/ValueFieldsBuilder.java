package view;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.sun.java.swing.plaf.windows.*;
import java.util.*;

public class ValueFieldsBuilder extends UIBuilder {

    private Integer intFieldCount = 0;

    public ValueFieldsBuilder(Integer intFieldCount) {
        this.intFieldCount = intFieldCount;
    }

    @Override
    public void addUIControls() {
        searchUI = new JPanel();
        searchUI.setLayout(new GridLayout(intFieldCount, 2));

        for (int i = 0; i < intFieldCount; i++) {
            JLabel lblField = new JLabel("Variable : " + (char) (65+i));

            JTextField txtField = new JTextField(10);

            searchUI.add(lblField);
            searchUI.add(txtField);
        }

    }

    @Override
    public void initialize() {

    }
}
