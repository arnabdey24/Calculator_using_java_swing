package com.proCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Curency extends CommonFrame
    {
        double currency1[] = {0,1,0.86,0.012,0.0086,1.24,0.0098};
        double currency2[] = {0,1,0.86,0.012,0.0086,1.24,0.0098};

        public Curency()
        {
        components4();
        }

    public void components4(){

        comboBox1.addItem("None");
        comboBox1.addItem("Taka");
        comboBox1.addItem("Rupee");
        comboBox1.addItem("Dollar");
        comboBox1.addItem("Pound");
        comboBox1.addItem("Yen");
        comboBox1.addItem("Euro");

        comboBox2.addItem("None");
        comboBox2.addItem("Taka");
        comboBox2.addItem("Rupee");
        comboBox2.addItem("Dollar");
        comboBox2.addItem("Pound");
        comboBox2.addItem("Yen");
        comboBox2.addItem("Euro");


        unitConvert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double Value = Double.parseDouble(textField1.getText());

                    int obj1 = comboBox1.getSelectedIndex();
                    int obj2 = comboBox2.getSelectedIndex();

                        if (obj1 == obj2) {
                            String sameCurrency = "Same Currency";
                            textField2.setText(sameCurrency);
                        } else {
                            double result = (Value / currency1[obj1]) * currency2[obj2];
                            String convert = String.format("%.3f", result);
                            textField2.setText(convert);
                        }
                }
                catch (Exception ex) {
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

