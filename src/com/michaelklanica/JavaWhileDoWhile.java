package com.michaelklanica;

public class JavaWhileDoWhile {

    public static void main(String[] args) {

//        WHILE loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

//        DO WHILE loop
        int x = 0;
        do {
            System.out.println(x);
            x++;
        }
        while (x < 5);

//        using BREAK
        int y = 0;
        while (y < 10) {
            System.out.println(y);
            y++;
            if (y == 4) {
                break;
            }
        }

//        using CONTINUE
        int z = 0;
        while (z < 10) {
            if (z == 4) {
                z++;
                continue;
            }
            System.out.println(z);
            z++;
        }

    }

}
