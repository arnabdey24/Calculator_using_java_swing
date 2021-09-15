package com.proCalculator;

public class Minimization {
    public String getMinimizedValue(String ans) {
        try {
            double n = Double.parseDouble(ans);
            int m = (int) n;
            if (n == m) {
                return String.valueOf(m);
            } else {
                return String.valueOf(n);
            }
        } catch (NumberFormatException e) {
            return "Invalid";
        }
    }
}
