package com.proCalculator;
/*
*
*
*       This class is the implementation of in-fix expression evaluation
*       We set precedence in a way that it go with the "B.O.D.M.A.S" rule
*
*
*/
public class Test {
    public static String evaluate(String s){
        boolean flag=true;
        while (flag){
            String[] w=s.split("\\s");
            int index=-1;
            int tmpPre=1;
            for (int i = 0; i < w.length; i++) {
                if (precedence(w[i])>tmpPre) {
                    tmpPre= precedence(w[i]);
                    index=i;
                }
            }
            if (index==-1)
                break;
            float num1,num2;
            try {
                 num1 = Float.parseFloat(w[index - 1]);
                 num2 = Float.parseFloat(w[index + 1]);
            }catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                return "Invalid";
            }
            float result=0;
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
            s="";
            for (int i = 0; i < index-1; i++) {
                s+=w[i].toString()+" ";
            }
            s+=result+" ";
            for (int i = index+2; i < w.length; i++) {
                s+=w[i].toString()+" ";
            }
        }
        return s;
    }
    private static int precedence(String s){
        switch (s) {
            case "-":
                return 2;
            case "+":
                return 3;
            case "*":
                return 4;
            case "/":
                return 5;
            default:
                return 0;
        }
    }

    public static String minimization(String ans) {
        try {
            double n = Double.parseDouble(ans);
            int m = (int) n;
            if (n == m) {
                return String.valueOf(m);
            } else {
                return String.valueOf(n);
            }
        }catch (NumberFormatException e){
            return "Invalid";
        }
    }
}
