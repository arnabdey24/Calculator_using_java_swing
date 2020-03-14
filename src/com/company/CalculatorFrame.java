package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame implements ActionListener {


    private JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonUnit,buttonTemp,
            buttonPlus,buttonMinus,buttonDiv,buttonPro,buttonDot,buttonEqual ,buttonClear, buttonTri;
    private JPanel panel;
    private JLabel label,label2;

    public CalculatorFrame(String title) {
        super(title);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(950, 100);
        setSize(381, 541);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(381, 541);

        label = new JLabel();

        label.setBounds(10, 30, 350, 35);
        label.setFont(new Font("Calibri", Font.BOLD,20));
        panel.add(label);
        panel.setBackground(Color.lightGray);

        //label two
        label2 = new JLabel();

        label2.setBounds(10, 85, 341, 35);
        label2.setFont(new Font("Calibri", Font.BOLD,30));
        label2.setHorizontalAlignment(JLabel.RIGHT);
        panel.add(label2);
        panel.setBackground(Color.lightGray);



        buttonClear = new JButton("C");
        buttonClear.setBounds(3, 440, 89, 60);
        buttonClear.addActionListener(this);
        panel.add(buttonClear);

        button0 = new JButton("0");
        button0.setBounds(93, 440, 89, 60);
        button0.addActionListener(this);
        panel.add(button0);

        buttonDot = new JButton(".");
        buttonDot.setBounds(183, 440, 89, 60);
        buttonDot.addActionListener(this);
        panel.add(buttonDot);

        buttonEqual = new JButton("=");
        buttonEqual.setBounds(273, 440, 89, 60);
        buttonEqual.addActionListener(this);
        panel.add(buttonEqual);

        button1 = new JButton("1");
        button1.setBounds(3, 379, 89, 60);
        button1.addActionListener(this);
        panel.add(button1);

        button2 = new JButton("2");
        button2.setBounds(93, 379, 89, 60);
        button2.addActionListener(this);
        panel.add(button2);

        button3 = new JButton("3");
        button3.setBounds(183, 379, 89, 60);
        button3.addActionListener(this);
        panel.add(button3);

        buttonPlus = new JButton("+");
        buttonPlus.setBounds(273, 379, 89, 60);
        buttonPlus.addActionListener(this);
        panel.add(buttonPlus);

        button4 = new JButton("4");
        button4.setBounds(3, 318, 89, 60);
        button4.addActionListener(this);
        panel.add(button4);

        button5 = new JButton("5");
        button5.setBounds(93, 318, 89, 60);
        button5.addActionListener(this);
        panel.add(button5);

        button6 = new JButton("6");
        button6.setBounds(183, 318, 89, 60);
        button6.addActionListener(this);
        panel.add(button6);

        buttonMinus = new JButton("-");
        buttonMinus.setBounds(273, 318, 89, 60);
        buttonMinus.addActionListener(this);
        panel.add(buttonMinus);

        button7 = new JButton("7");
        button7.setBounds(3, 257, 89, 60);
        button7.addActionListener(this);
        panel.add(button7);

        button8 = new JButton("8");
        button8.setBounds(93, 257, 89, 60);
        button8.addActionListener(this);
        panel.add(button8);

        button9 = new JButton("9");
        button9.setBounds(183, 257, 89, 60);
        button9.addActionListener(this);
        panel.add(button9);

        buttonTri = new JButton("<html>Triangle<br />Area</html>");
        buttonTri.setBounds(93, 196, 89, 60);
        buttonTri.addActionListener(this);
        panel.add(buttonTri);

        buttonPro = new JButton("x");
        buttonPro.setBounds(273, 257, 89, 60);
        buttonPro.addActionListener(this);
        panel.add(buttonPro);

        buttonDiv = new JButton("/");
        buttonDiv.setBounds(273,196,89,60);
        buttonDiv.addActionListener(this);
        panel.add(buttonDiv);

        buttonTemp = new JButton("<html>Temp.<br />Converter</html>");
        buttonTemp.setBounds(183,196,89,60);
        buttonTemp.addActionListener(this);
        panel.add(buttonTemp);

        buttonUnit = new JButton("<html>Unit<br />Converter</html>");
        buttonUnit.setBounds(3,196,89,60);
        buttonUnit.addActionListener(this);
        panel.add(buttonUnit);

        buttonUnit.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                UnitConvert Uframe = new UnitConvert();
                Uframe.setVisible(true);
                Uframe.setLocation(950, 100);
                Uframe.setSize(381, 541);
                Uframe.setTitle("Unit Conversion");
            }
        });

        buttonTemp.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                Conversion frame1 = new Conversion();
                frame1.setVisible(true);
                frame1.setLocation(950, 100);
                frame1.setSize(381, 541);
                frame1.setTitle("Converter");
            }
        });

        buttonTri.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                Triangle Tframe = new Triangle();
                Tframe.setVisible(true);
                Tframe.setLocation(950, 100);
                Tframe.setSize(381, 541);
                Tframe.setTitle("Triangle Area");
            }
        });

        this.add(panel);
        //pack();
        setResizable(false);

    }
    private String exp="";
    boolean answered=false;
        public void actionPerformed(ActionEvent actionevent){
            if(answered){
                label.setText("");
                label2.setText("");
                answered=false;
            }
            String str = actionevent.getActionCommand();
            switch (str) {
                case "1":
                    label.setText(label.getText() + button1.getText());
                    exp = exp + button1.getText();
                    break;
                case "2":
                    label.setText(label.getText() + button2.getText());
                    exp = exp + button2.getText();
                    break;
                case "3":
                    label.setText(label.getText() + button3.getText());
                    exp = exp + button3.getText();
                    break;
                case "4":
                    label.setText(label.getText() + button4.getText());
                    exp = exp + button4.getText();
                    break;
                case "5":
                    label.setText(label.getText() + button5.getText());
                    exp = exp + button5.getText();
                    break;
                case "6":
                    label.setText(label.getText() + button6.getText());
                    exp = exp + button6.getText();
                    break;
                case "7":
                    label.setText(label.getText() + button7.getText());
                    exp = exp + button7.getText();
                    break;
                case "8":
                    label.setText(label.getText() + button8.getText());
                    exp =exp + button8.getText();
                    break;
                case "9":
                    label.setText(label.getText() + button9.getText());
                    exp = exp + button9.getText();
                    break;
                case "0":
                    label.setText(label.getText() + button0.getText());
                    exp = exp + button0.getText();
                    break;
                case ".":
                    label.setText(label.getText() + buttonDot.getText());
                    exp = exp + buttonDot.getText();
                    break;
                case "+":
                    label.setText(label.getText() + buttonPlus.getText());
                    if(exp.isBlank())
                        exp="";
                    else if (exp.endsWith(" * ") || exp.endsWith(" / "))
                        exp=exp+buttonPlus.getText();
                    else
                        exp = exp + " " + buttonPlus.getText() + " ";
                    break;
                case "-":
                    label.setText(label.getText() + buttonMinus.getText());
                    if(exp.isBlank())
                        exp=buttonMinus.getText();
                    else if (exp.endsWith(" * ") || exp.endsWith(" / ")) {
                        exp = exp + buttonMinus.getText();
                    }
                    else
                        exp = exp + " " + buttonMinus.getText() + " ";
                    break;
                case "x":
                    label.setText(label.getText() + buttonPro.getText());
                    exp = exp + " " + "*" + " ";
                    break;
                case "/":
                    label.setText(label.getText() + buttonDiv.getText());
                    exp = exp + " " + buttonDiv.getText() + " ";
                    break;
                case "=":
                    System.out.println(exp);
                    String ans = Test.evaluate(exp);
                    System.out.println(ans);
                    label2.setText(ans);
                    exp="";
                    answered=true;
                    break;
                case "C":
                    label.setText("");
                    exp="";
                    break;
            }

        }
    }
