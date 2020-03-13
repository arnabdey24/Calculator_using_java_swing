
package com.company;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Triangle extends JFrame{
    
    private Container c2;
    private JTextField base, height, area;
    private JButton Tb, Tc;
    private JLabel l1, l2, l3;
    
    
    Triangle(){
    components2();
    }
    
    public void components2(){
    c2 =this.getContentPane();
        c2.setLayout(null);
        c2.setBackground(Color.CYAN);
        
        base = new JTextField();
        base.setBounds(20, 90, 80, 40);
        c2.add(base);
        
        height = new JTextField();
        height.setBounds(20, 190, 80, 40);
        c2.add(height);
        
        area = new JTextField();
        area.setBounds(170, 160, 80, 40);
        c2.add(area);
        
        Tb = new JButton("Area");
        Tb.setBounds(20, 260, 80, 40);
        c2.add(Tb);
        
        Tc = new JButton("Clear");
        Tc.setBounds(110, 260, 80, 40);
        c2.add(Tc);
        
        l1 = new JLabel("Base: ");
        l1.setBounds(20, 40, 80, 40);
        c2.add(l1);
        
        l2 = new JLabel("Height: ");
        l2.setBounds(20, 140, 80, 40);
        c2.add(l2);
        
        l3 = new JLabel("Area: ");
        l3.setBounds(170, 128, 80, 40);
        c2.add(l3);
        
         Tc.addActionListener(new ActionListener(){
    
        public void actionPerformed(ActionEvent e){
        
         base.setText("");
         height.setText("");
         area.setText("");
          
          }
        
        
    
    });
         
         Tb.addActionListener(new ActionListener(){
    
        public void actionPerformed(ActionEvent e){
        
         double n = Double.parseDouble(base.getText());
         
         double s = Double.parseDouble(height.getText());
           
         double a = (0.5*(n*s));
            
         
         area.setText(String.valueOf(a));
          
          }
        
        
    
    });
    
    }
}
