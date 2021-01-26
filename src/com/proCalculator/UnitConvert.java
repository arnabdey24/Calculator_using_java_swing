package com.proCalculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class UnitConvert extends JFrame{
    
    private JButton clear, unitConvert;
    private Container container;
    private JTextField textField1, textField2;
    private JComboBox comboBox1, comboBox2;
    
    UnitConvert(){
    components3();
    }


    public void components3(){
    container =this.getContentPane();
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


    unitConvert.addActionListener(new ActionListener(){

        public void actionPerformed(ActionEvent e) {

            try {

                String box1 = (String) comboBox1.getSelectedItem();
                String box2 = (String) comboBox2.getSelectedItem();

                if (box1.equals("Metre") && box2.equals("Kilometre")) {

                    double m = Double.parseDouble(textField1.getText());

                    double k = (m / 1000);
                    textField2.setText(String.valueOf(k));
                }

                if (box1.equals("Metre") && box2.equals("Centimetre")) {

                    double m = Double.parseDouble(textField1.getText());

                    double c = (m / 100);
                    textField2.setText(String.valueOf(c));
                }

                if (box1.equals("Metre") && box2.equals("Millimetre")) {

                    double m = Double.parseDouble(textField1.getText());

                    double mm = (m * 1000);

                    textField2.setText(String.valueOf(mm));
                }

                if (box1.equals("Metre") && box2.equals("Decimetre")) {
                    double m = Double.parseDouble(textField1.getText());

                    double d = (m * 10);

                    textField2.setText(String.valueOf(d));
                }

                if (box1.equals("Metre") && box2.equals("Metre")) {
                    double m = Double.parseDouble(textField1.getText());

                    textField2.setText(String.valueOf(m));
                }

                if (box1.equals("Metre") && box2.equals("Feet")) {
                    double m = Double.parseDouble(textField1.getText());

                    double f = (m * 3.28084);

                    textField2.setText(String.valueOf(f));
                }

                if (box1.equals("Metre") && box2.equals("Inch")) {
                    double m = Double.parseDouble(textField1.getText());

                    double i = (m * 39.3701);

                    textField2.setText(String.valueOf(i));
                }

                if (box1.equals("Kilometre") && box2.equals("Metre")) {

                    double k = Double.parseDouble(textField1.getText());

                    double m = (k * 1000);
                    textField2.setText(String.valueOf(m));
                }

                if (box1.equals("Kilometre") && box2.equals("Centimetre")) {

                    double k = Double.parseDouble(textField1.getText());

                    double c = (k * 100000);
                    textField2.setText(String.valueOf(c));
                }

                if (box1.equals("Kilometre") && box2.equals("Millimetre")) {

                    double k = Double.parseDouble(textField1.getText());

                    double mm = (k * 1000000);

                    textField2.setText(String.valueOf(mm));
                }

                if (box1.equals("Kilometre") && box2.equals("Decimetre")) {
                    double k = Double.parseDouble(textField1.getText());

                    double d = (k * 10000);

                    textField2.setText(String.valueOf(d));
                }

                if (box1.equals("Kilometre") && box2.equals("Kilometre")) {
                    double k = Double.parseDouble(textField1.getText());

                    textField2.setText(String.valueOf(k));
                }

                if (box1.equals("Kilometre") && box2.equals("Feet")) {
                    double k = Double.parseDouble(textField1.getText());

                    double f = (k * 3280.84);

                    textField2.setText(String.valueOf(f));
                }

                if (box1.equals("Kilometre") && box2.equals("Inch")) {
                    double k = Double.parseDouble(textField1.getText());

                    double i = (k * 39370.1);

                    textField2.setText(String.valueOf(i));
                }

                if (box1.equals("Centimetre") && box2.equals("Kilometre")) {

                    double c = Double.parseDouble(textField1.getText());

                    double k = (c * 0.00001);
                    textField2.setText(String.valueOf(k));
                }

                if (box1.equals("Centimetre") && box2.equals("Centimetre")) {

                    double c = Double.parseDouble(textField1.getText());

                    textField2.setText(String.valueOf(c));
                }

                if (box1.equals("Centimetre") && box2.equals("Millimetre")) {

                    double c = Double.parseDouble(textField1.getText());

                    double mm = (double) (c * 10);

                    textField2.setText(String.valueOf(mm));
                }

                if (box1.equals("Centimetre") && box2.equals("Decimetre")) {
                    double c = Double.parseDouble(textField1.getText());

                    double d = (double) (c * 0.1);

                    textField2.setText(String.valueOf(d));
                }

                if (box1.equals("Centimetre") && box2.equals("Metre")) {
                    double c = Double.parseDouble(textField1.getText());

                    double m = (double) (c * 0.01);

                    textField2.setText(String.valueOf(m));
                }

                if (box1.equals("Centimetre") && box2.equals("Feet")) {
                    double c = Double.parseDouble(textField1.getText());

                    double f = (double) (c * 0.0328084);

                    textField2.setText(String.valueOf(f));
                }

                if (box1.equals("Centimetre") && box2.equals("Inch")) {
                    double m = Double.parseDouble(textField1.getText());

                    double i = (double) (m * 0.393701);

                    textField2.setText(String.valueOf(i));
                }

                if (box1.equals("Decimetre") && box2.equals("Kilometre")) {

                    double d = Double.parseDouble(textField1.getText());

                    double k = (double) (d * 0.0001);
                    textField2.setText(String.valueOf(k));
                }

                if (box1.equals("Decimetre") && box2.equals("Centimetre")) {

                    double d = Double.parseDouble(textField1.getText());

                    double c = (double) (d * 10);
                    textField2.setText(String.valueOf(c));
                }

                if (box1.equals("Decimetre") && box2.equals("Millimetre")) {

                    double d = Double.parseDouble(textField1.getText());

                    double mm = (double) (d * 100);

                    textField2.setText(String.valueOf(mm));
                }

                if (box1.equals("Decimetre") && box2.equals("Decimetre")) {
                    double d = Double.parseDouble(textField1.getText());

                    textField2.setText(String.valueOf(d));
                }

                if (box1.equals("Decimetre") && box2.equals("Metre")) {
                    double d = Double.parseDouble(textField1.getText());

                    double m = (double) (d * 0.1);

                    textField2.setText(String.valueOf(m));
                }

                if (box1.equals("Decimetre") && box2.equals("Feet")) {
                    double d = Double.parseDouble(textField1.getText());

                    double f = (double) (d * 0.328084);

                    textField2.setText(String.valueOf(f));
                }

                if (box1.equals("Decimetre") && box2.equals("Inch")) {
                    double d = Double.parseDouble(textField1.getText());

                    double i = (double) (d * 3.93701);

                    textField2.setText(String.valueOf(i));
                }

                if (box1.equals("Millimetre") && box2.equals("Kilometre")) {

                    double mm = Double.parseDouble(textField1.getText());

                    double k = (mm * 0.000001);
                    textField2.setText(String.valueOf(k));
                }

                if (box1.equals("Millimetre") && box2.equals("Centimetre")) {

                    double mm = Double.parseDouble(textField1.getText());

                    double c = (double) (mm * 0.1);
                    textField2.setText(String.valueOf(c));
                }

                if (box1.equals("Millimetre") && box2.equals("Millimetre")) {

                    double mm = Double.parseDouble(textField1.getText());

                    textField2.setText(String.valueOf(mm));
                }

                if (box1.equals("Millimetre") && box2.equals("Decimetre")) {
                    double mm = Double.parseDouble(textField1.getText());

                    double d = (double) (mm * 0.01);

                    textField2.setText(String.valueOf(d));
                }

                if (box1.equals("Millimetre") && box2.equals("Metre")) {
                    double mm = Double.parseDouble(textField1.getText());
                    double m = (double) (mm * 0.001);

                    textField2.setText(String.valueOf(m));
                }

                if (box1.equals("Millimetre") && box2.equals("Feet")) {
                    double mm = Double.parseDouble(textField1.getText());

                    double f = (double) (mm * 0.00328084);

                    textField2.setText(String.valueOf(f));
                }

                if (box1.equals("Millimetre") && box2.equals("Inch")) {
                    double mm = Double.parseDouble(textField1.getText());

                    double i = (double) (mm * 0.0393701);

                    textField2.setText(String.valueOf(i));
                }


            }catch (Exception ex)
            {
                textField2.setText("Invalid");
            }
        }

    });


     clear.addActionListener(new ActionListener(){

        public void actionPerformed(ActionEvent e){

         textField1.setText("");
         textField2.setText("");

          }



    });

    }
    
}
