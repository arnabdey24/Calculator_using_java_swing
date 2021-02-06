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
                        textField2.setText("Invalid");
                    } else if (selected1.equals("None") || selected2.equals("None")) {
                        textField2.setText("Invalid");
                    } else {

                        double value = Double.parseDouble(textField1.getText());
                        if (selected1.equals("Fahrenheit")) value = ((value - 32) * 5 / 9); //Converted into Celsius
                        else if (selected1.equals("Kelvin")) value = (value * 1 - 273.15);  //Converted into Celsius

                        if (selected2.equals("Fahrenheit")) value = (value * 1.8 + 32);   //Celsius to Fahrenheit
                        else if (selected2.equals("Kelvin")) value = (value + 273.15);    //Celsius to Kelvin

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