package com.michaelklanica;

public class JavaIfElse {

    public static void main(String[] args) {

        int x = 5;
        int y = 1;

        // IF statement
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        }

        // ELSE statement
        if (x < y) {
            System.out.println(x + " is less than " + y);
        } else {
            System.out.println(x + " is greater than " + y);
        }

        // Ternary operator
        // variable = (condition) ? expressionTrue :  expressionFalse;

        String xIs = (x < y) ? x + " is less than " + y : x + " is greater than " + y;
        System.out.println(xIs);

        // ELSE IF statement
        if (x < y) {
            System.out.println(x + " is less than " + y);
        } else if (x > y){
            System.out.println(x + " is greater than " + y);
        } else {
            System.out.println(x + " equals " + y);
        }

    }

}
