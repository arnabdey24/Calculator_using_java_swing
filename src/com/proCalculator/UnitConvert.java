package com.proCalculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class UnitConvert extends CommonFrame {

    UnitConvert() {
        components3();
    }
    public void components3() {
        comboBox1.addItem("None");
        comboBox1.addItem("Metre");
        comboBox1.addItem("Centimetre");
        comboBox1.addItem("Kilometre");
        comboBox1.addItem("Millimetre");
        comboBox1.addItem("Decimetre");
        comboBox1.addItem("Feet");
        comboBox1.addItem("Inch");

        comboBox2.addItem("None");
        comboBox2.addItem("Centimetre");
        comboBox2.addItem("Kilometre");
        comboBox2.addItem("Decimetre");
        comboBox2.addItem("Millimetre");
        comboBox2.addItem("Metre");
        comboBox2.addItem("Feet");
        comboBox2.addItem("Inch");
        unitConvert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String box1 = (String) comboBox1.getSelectedItem();
                    String box2 = (String) comboBox2.getSelectedItem();
                    if (textField1.getText() == null && textField2.getText() == null) {
                        textField2.setText("Invalid");
                    } else if (box1.equals("None") || box2.equals("None")) {
                        textField2.setText("Invalid");
                    }
                    else {
                        double value = Double.parseDouble(textField1.getText());

                        if (box1.equals("Metre")) value = (value * 1);              //Converted to Metre
                        else if (box1.equals("Centimetre")) value = (value * 0.01); //Converted to Metre
                        else if (box1.equals("Kilometre")) value = (value * 1000);  //Converted to Metre
                        else if (box1.equals("Millimetre")) value = (value * 0.001);//Converted to Metre
                        else if (box1.equals("Decimetre")) value = (value * 0.1);   //Converted to Metre
                        else if (box1.equals("Feet")) value = (value * 0.3048);     //Converted to Metre
                        else if (box1.equals("Inch")) value = (value * 0.0254);     //Converted to Metre

                        if (box2.equals("Metre")) value = (value * 1);
                        else if (box2.equals("Centimetre")) value = (value * 100);  //Metre to Centimetre
                        else if (box2.equals("Kilometre")) value = (value / 1000);  //Metre to Kilometre
                        else if (box2.equals("Millimetre")) value = (value * 1000); //Metre to Millimetre
                        else if (box2.equals("Decimetre")) value = (value * 10);    //Metre to Decimetre
                        else if (box2.equals("Feet")) value = (value * 3.28084);    //Metre to Feet
                        else if (box2.equals("Inch")) value = (value * 39.3701);    //Metre to Inch
                        textField2.setText(String.valueOf(value));

                        if(value<0){
                            textField2.setText("Invalid");
                        }
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
