package com.ll;

public class Calc {

    public static int run(String exp) {
        if(exp.contains("-")){
            return 0;
        }
        if(exp.isBlank()) return 0;


        String[] exps = exp.split("\\+");
        int num1 = Integer.parseInt(exps[0].trim());
        int num2 = Integer.parseInt(exps[1].trim());
        return num1 + num2;




    }
}
