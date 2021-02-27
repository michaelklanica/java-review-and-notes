package com.michaelklanica;

public class JavaStrings {

    public static void main(String[] args) {


        //see also: https://www.w3schools.com/java/java_ref_string.asp

        //        JAVA STRINGS
        String txt = "abcdefghijklmNOPQRSTUVWXYZ";
        System.out.println(txt);

        //        RETURN STRING LENGTH
        System.out.println(txt.length());

        //        RETURN STRING ALL LOWER CASE OR UPPERCASE
        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());

        //        RETURN INDEX OF CHARACTER IN STRING
        System.out.println(txt.indexOf('d'));
        System.out.println(txt.indexOf("def"));
        System.out.println(txt.indexOf("efg"));
        //        NOTE returns -1 if not in string:
        System.out.println(txt.indexOf("qwerty"));

        //        STRING CONCATENATION
        String txt1 = "abcdefghijklm";
        String txt2 = "NOPQRSTUVWXYZ";

        System.out.println(txt1 + txt2);
        System.out.println(txt1.concat(txt2));

        //        SPECIAL CHARACTERS
        String txt3 = "A backslash can be added like this \\, followed by a new line.\n \"Double quotes\" or \'single" +
                " quotes\' can be added. This is a carriage return: \r  This is a tab: \t  This is a form feed: \f  " +
                "And this is a backspace: \b";
        System.out.println(txt3);
    }
}
