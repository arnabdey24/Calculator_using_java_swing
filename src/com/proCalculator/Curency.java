package com.proCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Curency extends CommonFrame
    {
        Curency(){
        components4();
    }

    public void components4(){

        comboBox1.addItem("None");
        comboBox1.addItem("USD");
        comboBox1.addItem("Taka");
        comboBox1.addItem("Rupee");
        comboBox1.addItem("Pound");

        comboBox2.addItem("None");
        comboBox2.addItem("USD");
        comboBox2.addItem("Taka");
        comboBox2.addItem("Rupee");
        comboBox2.addItem("Pound");

        unitConvert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String square1 = (String) comboBox1.getSelectedItem();
                    String square2 = (String) comboBox2.getSelectedItem();
                    if (textField1.getText() == null && textField2.getText() == null) {
                        unitConvert.setToolTipText("Invalid");
                        textField2.setText("Invalid");
                    } else if (square1.equals("None") || square2.equals("None")) {
                        unitConvert.setToolTipText("Invalid");
                        textField2.setText("Invalid");
                    } else {
                        double result = Double.parseDouble(textField1.getText());
                        if (square1.equals("USD")) result = (result * 1);
                        else if (square1.equals("Taka")) result = (result * 0.012);
                        else if (square1.equals("Rupee")) result = (result * 0.014);
                        else if (square1.equals("Pound")) result = (result * 1.37);

                        if (square2.equals("USD")) result = (result * 1);
                        else if (square2.equals("Taka")) result = (result * 84.73);
                        else if (square2.equals("Rupee")) result = (result * 72.79);
                        else if (square2.equals("Pound")) result = (result * 0.73);
                        textField2.setText(String.valueOf(result));
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
