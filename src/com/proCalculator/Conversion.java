package com.proCalculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Conversion extends JFrame {
    private Container container;
    private JTextField field2, field3;
    private JComboBox comboBox, comboBox1;
    private JButton buttonConvert, clear;

    Conversion() {
        components();
    }

    public void components() {
        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.lightGray);

        field2 = new JTextField();
        field2.setBounds(20, 100, 200, 60);
        container.add(field2);

        field3 = new JTextField();
        field3.setBounds(20, 165, 200, 60);
        field3.setEditable(false);
        container.add(field3);

        comboBox = new JComboBox();
        comboBox.setBounds(230, 100, 89, 60);
        comboBox.addItem("None");
        comboBox.addItem("Fahrenheit");
        comboBox.addItem("Celsius");
        comboBox.addItem("Kelvin");
        container.add(comboBox);

        comboBox1 = new JComboBox();
        comboBox1.setBounds(230, 165, 89, 60);
        comboBox1.addItem("None");
        comboBox1.addItem("Celsius");
        comboBox1.addItem("Fahrenheit");
        comboBox1.addItem("Kelvin");
        container.add(comboBox1);

        buttonConvert = new JButton("Convert");
        buttonConvert.setBounds(20, 280, 89, 60);
        container.add(buttonConvert);

        clear = new JButton("Clear");
        clear.setBounds(140, 280, 89, 60);
        container.add(clear);


        buttonConvert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {

                    String selected1 = (String) comboBox.getSelectedItem();
                    String selected2 = (String) comboBox1.getSelectedItem();

                    if (field2.getText() == null && field3.getText() == null) {
                        buttonConvert.setToolTipText("Invalid");
                        field3.setText("Invalid");
                    } else if (selected1.equals("None") || selected2.equals("None")) {
                        buttonConvert.setToolTipText("Invalid");
                        field3.setText("Invalid");
                    } else {

                        double value = Double.parseDouble(field2.getText());
                        if (selected1.equals("Fahrenheit")) value = ((value - 32) * 5 / 9);
                        else if (selected1.equals("Kelvin")) value = (value * 1 - 273.15);

                        if (selected2.equals("Fahrenheit")) value = (value * 1.8 + 32);
                        else if (selected2.equals("Kelvin")) value = (value + 273.15);

                        field3.setText(String.valueOf(value));
                    }

                } catch (Exception ex) {
                    field3.setText("Invalid");
                }
            }

        });

        clear.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                field2.setText("");
                field3.setText("");
            }
        });
    }
}