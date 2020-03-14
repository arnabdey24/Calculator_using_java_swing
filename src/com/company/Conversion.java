
package com.company;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Conversion extends JFrame{
    private Container c;
    private JTextField f2, f3, base, height, area;
    private JComboBox cb, cb1;
    private double num1, convert;
    private JButton bcon, clear;

    
    Conversion(){
    components();
    }

    public static void main(String[] args) {
        Conversion frame1 = new Conversion();
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLocation(950, 100);
        frame1.setSize(381, 541);

    }
    
    public void components(){
        c =this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.lightGray);




        f2 = new JTextField();
    f2.setBounds(20, 100, 200, 60);
    c.add(f2);

    f3 = new  JTextField();
    f3.setBounds(20, 165, 200, 60);
    c.add(f3);



    cb = new JComboBox();
    cb.setBounds(230, 100, 89, 60);
    cb.addItem("None");
    cb.addItem("Fahrenheit");
    cb.addItem("Celcius");
    cb.addItem("Kelvin");
    c.add(cb);

    cb1 = new JComboBox();
    cb1.setBounds(230, 165, 89, 60);
    cb1.addItem("None");
    cb1.addItem("Celcius");
    cb1.addItem("Fahrenheit");
    cb1.addItem("Kelvin");
    c.add(cb1);

    bcon = new JButton("Convert");
    bcon.setBounds(20, 280, 89, 60);
    c.add(bcon);

    clear = new JButton("Clear");
    clear.setBounds(140, 280, 89, 60);
    c.add(clear);


     bcon.addActionListener(new ActionListener(){

        public void actionPerformed(ActionEvent e){

        String str1 = (String)cb.getSelectedItem();
          String str2 = (String)cb1.getSelectedItem();

            if(f2.getText()==null && f3.getText()==null){
                bcon.setToolTipText("Invalid");
            }

          if(str1.equals("Celcius") && str2.equals("Fahrenheit")){

          double c = Double.parseDouble(f2.getText());

          double f = (double)(c*1.8+32);
          f3.setText(String.valueOf(f));
          }

          if(str1.equals("Celcius") && str2.equals("Kelvin")){

          double c = Double.parseDouble(f2.getText());

          double k = (double)(c+273.15);
          f3.setText(String.valueOf(k));
          }

          if(str1.equals("Celcius") && str2.equals("Celcius")){

          double c = Double.parseDouble(f2.getText());
          f3.setText(String.valueOf(c));
          }

          if(str1.equals("Fahrenheit") && str2.equals("Celcius"))
       {
           double f = Double.parseDouble(f2.getText());

           double c = (double)((f - 32)*5/9);

           f3.setText(String.valueOf(c));
       }

          if(str1.equals("Fahrenheit") && str2.equals("Kelvin"))
       {
           double f = Double.parseDouble(f2.getText());

           double k = (double)(((f - 32)*5/9)+273.15);

           f3.setText(String.valueOf(k));
       }

           if(str1.equals("Fahrenheit") && str2.equals("Fahrenheit"))
       {
           double f = Double.parseDouble(f2.getText());

           f3.setText(String.valueOf(f));
       }

           if(str1.equals("Kelvin") && str2.equals("Celcius"))
       {
           double k = Double.parseDouble(f2.getText());

           double c = (double)(0 - 273.15);

           f3.setText(String.valueOf(c));
       }
           if(str1.equals("Kelvin") && str2.equals("Fahrenheit"))
       {
           double k = Double.parseDouble(f2.getText());

           double f = (double)(0 - 273.15) * 9/5 +32;

           f3.setText(String.valueOf(f));
       }
           if(str1.equals("Kelvin") && str2.equals("Kelvin"))
       {
           double k = Double.parseDouble(f2.getText());

           f3.setText(String.valueOf(k));
       }


        }

    });

    clear.addActionListener(new ActionListener(){

        public void actionPerformed(ActionEvent e){

         f2.setText("");
         f3.setText("");

          }



    });





    }
    
}
