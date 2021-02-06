package com.proCalculator;

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
    }
}
