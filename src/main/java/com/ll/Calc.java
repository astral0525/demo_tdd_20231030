package com.ll;

public class Calc {

    public static int run(String exp) {

        if (exp.contains("-")) {
            String[] exps = exp.split("\\-");
            int num1 = Integer.parseInt(exps[0].trim());
            int num2 = Integer.parseInt(exps[1].trim());
            return num1 - num2;
        } else if (exp.contains("+")) {
            String[] exps = exp.split("\\+");
            int num1 = Integer.parseInt(exps[0].trim());
            int num2 = Integer.parseInt(exps[1].trim());
            return num1 + num2;
        } else if (exp.contains("*")){
            String[] exps = exp.split("\\*");
            int num1 = Integer.parseInt(exps[0].trim());
            int num2 = Integer.parseInt(exps[1].trim());
            return num1 * num2;
        } else if (exp.contains("/")){
            String[] exps = exp.split("/");
            int num1 = Integer.parseInt(exps[0].trim());
            int num2 = Integer.parseInt(exps[1].trim());
            return num1 / num2;
        }else return 0;


    }
}
