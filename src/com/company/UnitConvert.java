
package com.company;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class UnitConvert extends JFrame{
    
    private JButton clr, Uc;
    private Container c3;
    private JTextField U1, U2;
    private JComboBox Ucb1, Ucb2;
    
    UnitConvert(){
    components3();
    }
    
    public static void main(String[] args) {
         UnitConvert Uframe = new UnitConvert();
         Uframe.setVisible(true);
        Uframe.setLocation(500, 100);
        Uframe.setSize(381, 541);
        Uframe.setTitle("Unit Conversion");
    }

    public void components3(){
    c3 =this.getContentPane();
    c3.setLayout(null);
    c3.setBackground(Color.CYAN);


    clr = new JButton("Clear");
    clr.setBounds(20, 260, 80, 40);
    c3.add(clr);

    Uc = new JButton("Convert");
    Uc.setBounds(140, 260, 80, 40);
    c3.add(Uc);

     U1 = new JTextField();
     U1.setBounds(20, 90, 80, 40);
     c3.add(U1);

     U2 = new JTextField();
     U2.setBounds(20, 190, 80, 40);
     c3.add(U2);

     Ucb1 = new JComboBox();
    Ucb1.setBounds(140, 90, 89, 40);
    Ucb1.addItem("None");
    Ucb1.addItem("Metre");
    Ucb1.addItem("Centimetre");
    Ucb1.addItem("Kilometre");
    Ucb1.addItem("Millimetre");
    Ucb1.addItem("Decimetre");
    Ucb1.addItem("Feet");
    Ucb1.addItem("Inch");
    c3.add(Ucb1);

    Ucb2 = new JComboBox();
    Ucb2.setBounds(140, 190, 89, 40);
    Ucb2.addItem("None");
    Ucb2.addItem("Centimetre");
    Ucb2.addItem("Kilometre");
    Ucb2.addItem("Decimetre");
    Ucb2.addItem("Millimetre");
    Ucb2.addItem("Metre");
    Ucb2.addItem("Feet");
    Ucb2.addItem("Inch");
    c3.add(Ucb2);


    Uc.addActionListener(new ActionListener(){

        public void actionPerformed(ActionEvent e){

          String box1 = (String)Ucb1.getSelectedItem();
          String box2 = (String)Ucb2.getSelectedItem();

          if(box1.equals("Metre") && box2.equals("Kilometre")){

          double m = Double.parseDouble(U1.getText());

          double k = (double)(m/1000);
          U2.setText(String.valueOf(k));
          }

          if(box1.equals("Metre") && box2.equals("Centimetre")){

          double m = Double.parseDouble(U1.getText());

          double c = (double)(m/100);
          U2.setText(String.valueOf(c));
          }

          if(box1.equals("Metre") && box2.equals("Millimetre")){

          double m = Double.parseDouble(U1.getText());

          double mm = (double)(m*1000);

          U2.setText(String.valueOf(mm));
          }

           if(box1.equals("Metre") && box2.equals("Decimetre"))
       {
           double m = Double.parseDouble(U1.getText());

           double d = (double)(m*10);

           U2.setText(String.valueOf(d));
       }

           if(box1.equals("Metre") && box2.equals("Metre"))
       {
           double m = Double.parseDouble(U1.getText());

           U2.setText(String.valueOf(m));
       }

           if(box1.equals("Metre") && box2.equals("Feet"))
       {
           double m = Double.parseDouble(U1.getText());

           double f = (double)(m*3.28084);

           U2.setText(String.valueOf(f));
       }

           if(box1.equals("Metre") && box2.equals("Inch"))
       {
           double m = Double.parseDouble(U1.getText());

           double i = (double)(m*39.3701);

           U2.setText(String.valueOf(i));
       }

        if(box1.equals("Kilometre") && box2.equals("Metre")){

          double k = Double.parseDouble(U1.getText());

          double m = (double)(k*1000);
          U2.setText(String.valueOf(m));
          }

          if(box1.equals("Kilometre") && box2.equals("Centimetre")){

          double k = Double.parseDouble(U1.getText());

          double c = (double)(k*100);
          U2.setText(String.valueOf(c));
          }

          if(box1.equals("Kilometre") && box2.equals("Millimetre")){

          double k = Double.parseDouble(U1.getText());

          double mm = (double)(k*1000000);

          U2.setText(String.valueOf(mm));
          }

           if(box1.equals("Kilometre") && box2.equals("Decimetre"))
       {
           double k = Double.parseDouble(U1.getText());

           double d = (double)(k*10000);

           U2.setText(String.valueOf(d));
       }

           if(box1.equals("Kilometre") && box2.equals("Kilometre"))
       {
           double k = Double.parseDouble(U1.getText());

           U2.setText(String.valueOf(k));
       }

           if(box1.equals("Kilometre") && box2.equals("Feet"))
       {
           double k = Double.parseDouble(U1.getText());

           double f = (double)(k*3280.84);

           U2.setText(String.valueOf(f));
       }

           if(box1.equals("Kilometre") && box2.equals("Inch"))
       {
           double k = Double.parseDouble(U1.getText());

           double i = (double)(k*39370.1);

           U2.setText(String.valueOf(i));
       }

           if(box1.equals("Centimetre") && box2.equals("Kilometre")){

          double c = Double.parseDouble(U1.getText());

          double k = (double)(c*100000);
          U2.setText(String.valueOf(k));
          }

          if(box1.equals("Centimetre") && box2.equals("Centimetre")){

          double c = Double.parseDouble(U1.getText());

          U2.setText(String.valueOf(c));
          }

          if(box1.equals("Centimetre") && box2.equals("Millimetre")){

          double c = Double.parseDouble(U1.getText());

          double mm = (double)(c*10);

          U2.setText(String.valueOf(mm));
          }

           if(box1.equals("Centimetre") && box2.equals("Decimetre"))
       {
           double c = Double.parseDouble(U1.getText());

           double d = (double)(c*0.1);

           U2.setText(String.valueOf(d));
       }

           if(box1.equals("Centimetre") && box2.equals("Metre"))
       {
           double c = Double.parseDouble(U1.getText());

           double m = (double)(c*0.01);

           U2.setText(String.valueOf(m));
       }

           if(box1.equals("Centimetre") && box2.equals("Feet"))
       {
           double c = Double.parseDouble(U1.getText());

           double f = (double)(c*0.0328084);

           U2.setText(String.valueOf(f));
       }

           if(box1.equals("Centimetre") && box2.equals("Inch"))
       {
           double m = Double.parseDouble(U1.getText());

           double i = (double)(m*0.393701);

           U2.setText(String.valueOf(i));
       }

           if(box1.equals("Decimetre") && box2.equals("Kilometre")){

          double d = Double.parseDouble(U1.getText());

          double k = (double)(d*10000);
          U2.setText(String.valueOf(k));
          }

          if(box1.equals("Decimetre") && box2.equals("Centimetre")){

          double d = Double.parseDouble(U1.getText());

          double c = (double)(d*10);
          U2.setText(String.valueOf(c));
          }

          if(box1.equals("Decimetre") && box2.equals("Millimetre")){

          double d = Double.parseDouble(U1.getText());

          double mm = (double)(d*100);

          U2.setText(String.valueOf(mm));
          }

           if(box1.equals("Decimetre") && box2.equals("Decimetre"))
       {
           double d = Double.parseDouble(U1.getText());

           U2.setText(String.valueOf(d));
       }

           if(box1.equals("Decimetre") && box2.equals("Metre"))
       {
           double d = Double.parseDouble(U1.getText());

           double m = (double)(d*0.1);

           U2.setText(String.valueOf(m));
       }

           if(box1.equals("Decimetre") && box2.equals("Feet"))
       {
           double d = Double.parseDouble(U1.getText());

           double f = (double)(d*0.328084);

           U2.setText(String.valueOf(f));
       }

           if(box1.equals("Decimetre") && box2.equals("Inch"))
       {
           double d = Double.parseDouble(U1.getText());

           double i = (double)(d*3.93701);

           U2.setText(String.valueOf(i));
       }

         if(box1.equals("Millimetre") && box2.equals("Kilometre")){

          double mm = Double.parseDouble(U1.getText());

          double k = (double)(mm/1000000);
          U2.setText(String.valueOf(k));
          }

          if(box1.equals("Millimetre") && box2.equals("Centimetre")){

          double mm = Double.parseDouble(U1.getText());

          double c = (double)(mm*0.1);
          U2.setText(String.valueOf(c));
          }

          if(box1.equals("Millimetre") && box2.equals("Millimetre")){

          double mm = Double.parseDouble(U1.getText());

          U2.setText(String.valueOf(mm));
          }

           if(box1.equals("Millimetre") && box2.equals("Decimetre"))
       {
           double mm = Double.parseDouble(U1.getText());

           double d = (double)(mm*0.01);

           U2.setText(String.valueOf(d));
       }

           if(box1.equals("Millimetre") && box2.equals("Metre"))
       {
           double mm = Double.parseDouble(U1.getText());
           double m = (double)(mm*0.001);

           U2.setText(String.valueOf(m));
       }

           if(box1.equals("Millimetre") && box2.equals("Feet"))
       {
           double mm = Double.parseDouble(U1.getText());

           double f = (double)(mm*0.00328084);

           U2.setText(String.valueOf(f));
       }

           if(box1.equals("Millimetre") && box2.equals("Inch"))
       {
           double mm = Double.parseDouble(U1.getText());

           double i = (double)(mm*0.0393701);

           U2.setText(String.valueOf(i));
       }


        }

    });


     clr.addActionListener(new ActionListener(){

        public void actionPerformed(ActionEvent e){

         U1.setText("");
         U2.setText("");

          }



    });

    }
    
}
