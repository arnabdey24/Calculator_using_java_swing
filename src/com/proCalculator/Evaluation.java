package com.proCalculator;

import java.util.HashMap;

/**
 * This class is the implementation of in-fix expression evaluation.
 * We set precedent of operators in a way that it go with the "B.O.D.M.A.S" rule.
 */

class Evaluation {

    private HashMap<String, Integer> precedence;

    public Evaluation() {
        precedence = new HashMap<String, Integer>() {{
            put("-", 2);
            put("+", 3);
            put("*", 4);
            put("/", 5);
        }};
    }

    public String evaluate(String s) {
        while (true) {
            String[] w = s.split("\\s");
            int index = -1;
            int tmpPre = 1;
            for (int i = 0; i < w.length; i++) {
                if (precedence.containsKey(w[i]) && precedence.get(w[i]) > tmpPre) {
                    tmpPre = precedence.get(w[i]);
                    index = i;
                }
            }
            if (index == -1)
                break;
            float num1, num2;
            try {
                num1 = Float.parseFloat(w[index - 1]);
                num2 = Float.parseFloat(w[index + 1]);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                return "Invalid";
            }
            float result = 0;
            switch (w[index]) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            s = "";
            for (int i = 0; i < index - 1; i++) {
                s += w[i].toString() + " ";
            }
            s += result + " ";
            for (int i = index + 2; i < w.length; i++) {
                s += w[i].toString() + " ";
            }
        }
        return s;
    }

}
