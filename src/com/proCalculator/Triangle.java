package com.proCalculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Triangle extends JFrame{
    
    private Container container2;
    private JTextField base, height, area;
    private JButton areaButton, clearButton;
    private JLabel label1, label2, label3;
    
    
    Triangle(){
    components2();
    }
    
    public void components2(){
        container2 =this.getContentPane();
        container2.setLayout(null);
        container2.setBackground(Color.lightGray);
        
        base = new JTextField();
        base.setBounds(20, 90, 80, 40);
        container2.add(base);
        
        height = new JTextField();
        height.setBounds(20, 190, 80, 40);
        container2.add(height);
        
        area = new JTextField();
        area.setBounds(170, 160, 80, 40);
        area.setEditable(false);
        container2.add(area);
        
        areaButton = new JButton("Area");
        areaButton.setBounds(20, 260, 80, 40);
        container2.add(areaButton);
        
        clearButton = new JButton("Clear");
        clearButton.setBounds(110, 260, 80, 40);
        container2.add(clearButton);
        
        label1 = new JLabel("Base: ");
        label1.setBounds(20, 50, 80, 40);
        container2.add(label1);
        
        label2 = new JLabel("Height: ");
        label2.setBounds(20, 150, 80, 40);
        container2.add(label2);
        
        label3 = new JLabel("Area: ");
        label3.setBounds(170, 128, 80, 40);
        container2.add(label3);
        
         clearButton.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e)
         {
            base.setText("");
            height.setText("");
            area.setText("");
         }
    });

         areaButton.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){

            try {
                double n = Double.parseDouble(base.getText());
                double s = Double.parseDouble(height.getText());
                double a = (0.5 * (n * s));
                area.setText(String.valueOf(a));
            }
            catch (Exception ex)
            {
                area.setText("Invalid");
            }
          }
    });
    }
}
