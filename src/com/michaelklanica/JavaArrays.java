package com.michaelklanica;

public class JavaArrays {

    public static void main(String[] args) {

//        DECLARING, CHANGING ELEMENT OF, AND ACCESSING AN ARRAY:
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println(cars[0]);

//        ARRAY LENGTH
        System.out.println(cars.length);



//        LOOPING THROUGH ARRAYS
//        see also FOR EACH loop in JavaFor class
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

//        MULTIDIMENSIONAL ARRAYS
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[0][2];
        System.out.println(x); // Outputs 7

    }

}
