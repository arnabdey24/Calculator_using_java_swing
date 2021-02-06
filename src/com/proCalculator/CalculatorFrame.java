package com.proCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame implements ActionListener {

     JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonUnit,buttonTemp,
            buttonPlus,buttonMinus,buttonDiv,buttonMultiple,buttonDot,buttonEqual,buttonClear,buttonTri,buttonCurrency;
     JPanel panel;
     JLabel label,label2;

     Minimization minimization;
     Evaluation evaluation;

    public CalculatorFrame(String title) {
        super(title);

        minimization=new Minimization();
        evaluation=new Evaluation();

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(950, 100);
        setSize(381, 580);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(381, 541);

        label = new JLabel();
        label.setBounds(10, 25, 350, 35);
        label.setFont(new Font("Calibri", Font.BOLD,20));
        panel.add(label);
        panel.setBackground(Color.lightGray);

        label2 = new JLabel();
        label2.setBounds(10, 100, 341, 35);
        label2.setFont(new Font("Calibri", Font.BOLD,30));
        label2.setHorizontalAlignment(JLabel.RIGHT);
        panel.add(label2);
        panel.setBackground(Color.lightGray);

        buttonClear = new JButton("C");
        buttonClear.setBounds(3, 480, 89, 60);
        buttonClear.addActionListener(this);
        panel.add(buttonClear);

        button0 = new JButton("0");
        button0.setBounds(93, 480, 89, 60);
        button0.addActionListener(this);
        panel.add(button0);

        buttonDot = new JButton(".");
        buttonDot.setBounds(183, 480, 89, 60);
        buttonDot.addActionListener(this);
        panel.add(buttonDot);

        buttonEqual = new JButton("=");
        buttonEqual.setBounds(273, 480, 89, 60);
        buttonEqual.addActionListener(this);
        panel.add(buttonEqual);

        button1 = new JButton("1");
        button1.setBounds(3, 399, 89, 80);
        button1.addActionListener(this);
        panel.add(button1);

        button2 = new JButton("2");
        button2.setBounds(93, 399, 89, 80);
        button2.addActionListener(this);
        panel.add(button2);

        button3 = new JButton("3");
        button3.setBounds(183, 399, 89, 80);
        button3.addActionListener(this);
        panel.add(button3);

        buttonPlus = new JButton("+");
        buttonPlus.setBounds(273, 419, 89, 60);
        buttonPlus.addActionListener(this);
        panel.add(buttonPlus);

        button4 = new JButton("4");
        button4.setBounds(3, 318, 89, 80);
        button4.addActionListener(this);
        panel.add(button4);

        button5 = new JButton("5");
        button5.setBounds(93, 318, 89, 80);
        button5.addActionListener(this);
        panel.add(button5);

        button6 = new JButton("6");
        button6.setBounds(183, 318, 89, 80);
        button6.addActionListener(this);
        panel.add(button6);

        buttonMinus = new JButton("-");
        buttonMinus.setBounds(273, 358, 89, 60);
        buttonMinus.addActionListener(this);
        panel.add(buttonMinus);

        button7 = new JButton("7");
        button7.setBounds(3, 237, 89, 80);
        button7.addActionListener(this);
        panel.add(button7);

        button8 = new JButton("8");
        button8.setBounds(93, 237, 89, 80);
        button8.addActionListener(this);
        panel.add(button8);

        button9 = new JButton("9");
        button9.setBounds(183, 237, 89, 80);
        button9.addActionListener(this);
        panel.add(button9);

        buttonTri = new JButton("<html>Triangle<br />Area</html>");
        buttonTri.setBounds(93, 176, 89, 60);
        panel.add(buttonTri);

        buttonMultiple = new JButton("x");
        buttonMultiple.setBounds(273, 297, 89, 60);
        buttonMultiple.addActionListener(this);
        panel.add(buttonMultiple);

        buttonDiv = new JButton("/");
        buttonDiv.setBounds(273,237,89,60);
        buttonDiv.addActionListener(this);
        panel.add(buttonDiv);

        buttonTemp = new JButton("<html>Temp.<br />Converter</html>");
        buttonTemp.setBounds(183,176,89,60);
        panel.add(buttonTemp);

        buttonUnit = new JButton("<html>Unit<br />Converter</html>");
        buttonUnit.setBounds(3,176,89,60);
        panel.add(buttonUnit);

        buttonCurrency = new JButton("<html>Currency<br />Converter</html>");
        buttonCurrency.setBounds(273,176,89,60);
        panel.add(buttonCurrency);

        buttonUnit.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
            {
                UnitConvert uFrame = new UnitConvert();
                uFrame.setVisible(true);
                uFrame.setLocation(950, 100);
                uFrame.setSize(381, 580);
                uFrame.setTitle("Unit Conversion");
            }
        });

        buttonTemp.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
            {
                Conversion frame1 = new Conversion();
                frame1.setVisible(true);
                frame1.setLocation(950, 100);
                frame1.setSize(381, 580);
                frame1.setTitle("Converter");
            }
        });

        buttonTri.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
            {
                Triangle tFrame = new Triangle();
                tFrame.setVisible(true);
                tFrame.setLocation(950, 100);
                tFrame.setSize(381, 580);
                tFrame.setTitle("Triangle Area");
            }
        });

        buttonCurrency.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Curency curencyFrame = new Curency();
                curencyFrame.setVisible(true);
                curencyFrame.setLocation(950, 100);
                curencyFrame.setSize(381, 580);
                curencyFrame.setTitle("Converter");
            }
        });
        this.add(panel);
        setResizable(false);
    }

    private int count=0;
    private String exp="";
    private boolean answered=false;
    public void actionPerformed(ActionEvent actionevent){
        if(answered){              //
            label.setText("");     //  if it already answered, we need to remove the old expression first which is displayed
            label2.setText("");    //
            answered=false;        //
        }
        String str = actionevent.getActionCommand();
        switch (str) {
            case "1":
                if(count<32) {
                    count++;      //the count will limit the expression , so the expression will not get too long to handle
                    label.setText(label.getText() + button1.getText());  //label text is what we see
                    exp = exp + button1.getText();                       //and the exp is what we going to calculate
                }
                break;
            case "2":
                if(count<32) {
                    count++;
                    label.setText(label.getText() + button2.getText());
                    exp = exp + button2.getText();
                }
                break;
            case "3":
                if(count<32) {
                    count++;
                    label.setText(label.getText() + button3.getText());
                    exp = exp + button3.getText();
                }
                break;
            case "4":
                if(count<32) {
                    count++;
                    label.setText(label.getText() + button4.getText());
                    exp = exp + button4.getText();
                }
                break;
            case "5":
                if(count<32) {
                    count++;
                    label.setText(label.getText() + button5.getText());
                    exp = exp + button5.getText();
                }
                break;
            case "6":
                if(count<32) {
                    count++;
                    label.setText(label.getText() + button6.getText());
                    exp = exp + button6.getText();
                }
                break;
            case "7":
                if(count<32) {
                    count++;
                    label.setText(label.getText() + button7.getText());
                    exp = exp + button7.getText();
                }
                break;
            case "8":
                if(count<32) {
                    count++;
                    label.setText(label.getText() + button8.getText());
                    exp = exp + button8.getText();
                }
                break;
            case "9":
                if(count<32) {
                    count++;
                    label.setText(label.getText() + button9.getText());
                    exp = exp + button9.getText();
                }
                break;
            case "0":
                if(count<32) {
                    count++;
                    label.setText(label.getText() + button0.getText());
                    exp = exp + button0.getText();
                }
                break;
            case ".":
                if(count<32) {
                    count++;
                    label.setText(label.getText() + buttonDot.getText());
                    exp = exp + buttonDot.getText();
                }
                break;
            case "+":
                if(count<31) {
                    count++;
                    label.setText(label.getText() + buttonPlus.getText());
                    if (exp.isBlank())
                        exp = "";
                    else if (exp.endsWith(" * ") || exp.endsWith(" / ") || exp.endsWith(" - ") || exp.endsWith(" + "))
                        exp = exp + buttonPlus.getText();       //e.g.,( 1 * -2 ) here -2 is a number (-) is not a operation here,so space gap is not needed
                    else
                        exp = exp + " " + buttonPlus.getText() + " ";  //we need to to take space gap both side here , so that we can split the expression in time of evaluation
                }
                break;
            case "-":
                if(count<31) {
                    count++;
                    label.setText(label.getText() + buttonMinus.getText());                                                    //
                    if (exp.isBlank())                                                                                        //
                        exp = buttonMinus.getText();                                                                         //  we did same thing as for (+)
                    else if (exp.endsWith(" * ") || exp.endsWith(" / ") || exp.endsWith(" + ") || exp.endsWith(" - ")) {    //
                        exp = exp + buttonMinus.getText();                                                                 //
                    } else
                        exp = exp + " " + buttonMinus.getText() + " ";
                }
                break;
            case "x":
                if(count<31) {
                    count++;
                    label.setText(label.getText() + buttonMultiple.getText());
                    exp = exp + " " + "*" + " ";
                }
                break;
            case "/":
                if(count<31) {
                    count++;
                    label.setText(label.getText() + buttonDiv.getText());
                    exp = exp + " " + buttonDiv.getText() + " ";
                }
                break;
            case "=":
                System.out.println(exp);
                String ans = evaluation.evaluate(exp);        // evaluate the expression

                ans=minimization.getMinimizedValue(ans);             // did minimization e.g., 2.000 will be now 2

                System.out.println(ans);
                label2.setText(ans);
                exp="";
                answered=true;
                count=0;
                break;
            case "C":
                label.setText("");
                label2.setText("");
                exp="";
                count=0;
                break;
        }

    }
}
