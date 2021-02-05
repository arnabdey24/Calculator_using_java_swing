package com.proCalculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Conversion extends JFrame{
    private Container container;
    private JTextField field2, field3;
    private JComboBox comboBox, comboBox1;
    private JButton buttonConvert, clear;

    
    Conversion(){
    components();
    }


    public void components(){
        container =this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.lightGray);


        field2 = new JTextField();
        field2.setBounds(20, 100, 200, 60);
        container.add(field2);

    field3 = new  JTextField();
    field3.setBounds(20, 165, 200, 60);
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


     buttonConvert.addActionListener(new ActionListener(){


        public void actionPerformed(ActionEvent e) {

            try {

                String str1 = (String) comboBox.getSelectedItem();
                String str2 = (String) comboBox1.getSelectedItem();

                if (field2.getText() == null && field3.getText() == null) {
                    buttonConvert.setToolTipText("Invalid");
                }

                if (str1.equals("Celsius") && str2.equals("Fahrenheit")) {

                    double c = Double.parseDouble(field2.getText());

                    double f = (c * 1.8 + 32);
                    field3.setText(String.valueOf(f));
                }

                if (str1.equals("Celsius") && str2.equals("Kelvin")) {

                    double c = Double.parseDouble(field2.getText());

                    double k = (c + 273.15);
                    field3.setText(String.valueOf(k));
                }

                if (str1.equals("Celsius") && str2.equals("Celsius")) {

                    double c = Double.parseDouble(field2.getText());
                    field3.setText(String.valueOf(c));
                }

                if (str1.equals("Fahrenheit") && str2.equals("Celsius")) {
                    double f = Double.parseDouble(field2.getText());

                    double c = ((f - 32) * 5 / 9);

                    field3.setText(String.valueOf(c));
                }

                if (str1.equals("Fahrenheit") && str2.equals("Kelvin")) {
                    double f = Double.parseDouble(field2.getText());

                    double k = (((f - 32) * 5 / 9) + 273.15);

                    field3.setText(String.valueOf(k));
                }

                if (str1.equals("Fahrenheit") && str2.equals("Fahrenheit")) {
                    double f = Double.parseDouble(field2.getText());

                    field3.setText(String.valueOf(f));
                }

                if (str1.equals("Kelvin") && str2.equals("Celsius")) {
                    double k = Double.parseDouble(field2.getText());

                    double c = (k * 1 - 273.15);

                    field3.setText(String.valueOf(c));
                }
                if (str1.equals("Kelvin") && str2.equals("Fahrenheit")) {
                    double k = Double.parseDouble(field2.getText());

                    double f = (k * 10 - 273.15) * 9 / 5 + 32;

                    field3.setText(String.valueOf(f));
                }
                if (str1.equals("Kelvin") && str2.equals("Kelvin")) {
                    double k = Double.parseDouble(field2.getText());

                    field3.setText(String.valueOf(k));
                }


            }catch (Exception ex)
            {
                field3.setText("Invalid");
            }
        }

    });

    clear.addActionListener(new ActionListener(){

        public void actionPerformed(ActionEvent e){

         field2.setText("");
         field3.setText("");

          }
    });
    }
    
}
