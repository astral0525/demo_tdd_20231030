package com.ll;

public class Calc {

    public static int run(String exp) {

        if (exp.isBlank()) {
            return 0;
        }
        String[] expBits = exp.split(" ");
        String sign = expBits[1];

        int num1 = Integer.parseInt(expBits[0]);
        int num2 = Integer.parseInt(expBits[1]);

        switch (sign) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("0으로 나누면 안됩니다");
                    return -1;
                }
            default:
                return 0;

        }


    }
}
