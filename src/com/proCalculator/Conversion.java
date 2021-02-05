package com.proCalculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Conversion extends CommonFrame {

    Conversion() {
        components();
    }

    public void components() {

        comboBox1.addItem("None");
        comboBox1.addItem("Fahrenheit");
        comboBox1.addItem("Celsius");
        comboBox1.addItem("Kelvin");

        comboBox2.addItem("None");
        comboBox2.addItem("Celsius");
        comboBox2.addItem("Fahrenheit");
        comboBox2.addItem("Kelvin");



        unitConvert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {

                    String selected1 = (String) comboBox1.getSelectedItem();
                    String selected2 = (String) comboBox2.getSelectedItem();

                    if (textField1.getText() == null && textField2.getText() == null) {
                        unitConvert.setToolTipText("Invalid");
                        textField2.setText("Invalid");
                    } else if (selected1.equals("None") || selected2.equals("None")) {
                        unitConvert.setToolTipText("Invalid");
                        textField2.setText("Invalid");
                    } else {

                        double value = Double.parseDouble(textField1.getText());
                        if (selected1.equals("Fahrenheit")) value = ((value - 32) * 5 / 9);
                        else if (selected1.equals("Kelvin")) value = (value * 1 - 273.15);

                        if (selected2.equals("Fahrenheit")) value = (value * 1.8 + 32);
                        else if (selected2.equals("Kelvin")) value = (value + 273.15);

                        textField2.setText(String.valueOf(value));
                    }

                } catch (Exception ex) {
                    textField2.setText("Invalid");
                }
            }

        });

        clear.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
            }
        });
    }
}