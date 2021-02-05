package com.proCalculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class UnitConvert extends JFrame {

    private JButton clear, unitConvert;
    private Container container;
    private JTextField textField1, textField2;
    private JComboBox comboBox1, comboBox2;

    UnitConvert() {
        components3();
    }


    public void components3() {
        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.lightGray);


        clear = new JButton("Clear");
        clear.setBounds(20, 260, 80, 40);
        container.add(clear);

        unitConvert = new JButton("Convert");
        unitConvert.setBounds(140, 260, 80, 40);
        container.add(unitConvert);

        textField1 = new JTextField();
        textField1.setBounds(20, 90, 80, 40);
        container.add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(20, 190, 80, 40);
        textField2.setEditable(false);
        container.add(textField2);

        comboBox1 = new JComboBox();
        comboBox1.setBounds(140, 90, 89, 40);
        comboBox1.addItem("None");
        comboBox1.addItem("Metre");
        comboBox1.addItem("Centimetre");
        comboBox1.addItem("Kilometre");
        comboBox1.addItem("Millimetre");
        comboBox1.addItem("Decimetre");
        comboBox1.addItem("Feet");
        comboBox1.addItem("Inch");
        container.add(comboBox1);

        comboBox2 = new JComboBox();
        comboBox2.setBounds(140, 190, 89, 40);
        comboBox2.addItem("None");
        comboBox2.addItem("Centimetre");
        comboBox2.addItem("Kilometre");
        comboBox2.addItem("Decimetre");
        comboBox2.addItem("Millimetre");
        comboBox2.addItem("Metre");
        comboBox2.addItem("Feet");
        comboBox2.addItem("Inch");
        container.add(comboBox2);


        unitConvert.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {

                    String box1 = (String) comboBox1.getSelectedItem();
                    String box2 = (String) comboBox2.getSelectedItem();

                    if (textField1.getText() == null && textField2.getText() == null) {
                        unitConvert.setToolTipText("Invalid");
                        textField2.setText("Invalid");
                    } else if (box1.equals("None") || box2.equals("None")) {
                        unitConvert.setToolTipText("Invalid");
                        textField2.setText("Invalid");
                    } else {

                        double value = Double.parseDouble(textField1.getText());
                        if (box1.equals("Metre")) value = (value * 1);
                        else if (box1.equals("Centimetre")) value = (value * 0.01);
                        else if (box1.equals("Kilometre")) value = (value * 1000);
                        else if (box1.equals("Millimetre")) value = (value * 0.001);
                        else if (box1.equals("Decimetre")) value = (value * 0.1);
                        else if (box1.equals("Feet")) value = (value * 0.3048);
                        else if (box1.equals("Inch")) value = (value * 0.0254);

                        if (box2.equals("Metre")) value = (value * 1);
                        else if (box2.equals("Centimetre")) value = (value * 100);
                        else if (box2.equals("Kilometre")) value = (value / 1000);
                        else if (box2.equals("Millimetre")) value = (value * 1000);
                        else if (box2.equals("Decimetre")) value = (value * 10);
                        else if (box2.equals("Feet")) value = (value * 3.28084);
                        else if (box2.equals("Inch")) value = (value * 39.3701);

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
