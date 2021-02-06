package com.proCalculator;

import javax.swing.*;
import java.awt.*;

public class CommonFrame extends JFrame {
    JButton clear, unitConvert;
    Container container;
    JTextField textField1, textField2;
    JComboBox comboBox1, comboBox2;

    CommonFrame() {
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
        textField1.setBounds(20, 90, 100, 40);
        container.add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(20, 190, 100, 40);
        textField2.setEditable(false);
        container.add(textField2);

        comboBox1 = new JComboBox();
        comboBox1.setBounds(140, 90, 89, 40);
        container.add(comboBox1);

        comboBox2 = new JComboBox();
        comboBox2.setBounds(140, 190, 89, 40);
        container.add(comboBox2);
    }
}
