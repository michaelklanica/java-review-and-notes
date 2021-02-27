package com.michaelklanica;

public class JavaMath {

    public static void main(String[] args) {

//        see also: https://www.w3schools.com/java/java_ref_math.asp

        int x = 5;
        int y = 10;

//        RETURN HIGHEST VALUE
        System.out.println(Math.max(x,y));

//        RETURN LOWEST VALUE
        System.out.println(Math.min(x,y));

//        RETURN SQUARE ROOT
        System.out.println(Math.sqrt(y));

//        RETURN ABSOLUTE VALUE
        System.out.println(Math.abs(-5.7));

//        RETURN RANDOM NUMBER BETWEEN 0.0 AND 1.0 (INCLUSIVE)
        System.out.println(Math.random());
//        see also random number from 0 to 100:
        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);

    }
}
