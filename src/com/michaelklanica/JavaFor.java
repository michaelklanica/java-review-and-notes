package com.michaelklanica;

public class JavaFor {

    public static void main(String[] args) {

//        FOR loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

//        using BREAK
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

//        using CONTINUE
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

//        FOR EACH loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

    }

}
