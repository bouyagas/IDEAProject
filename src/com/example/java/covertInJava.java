package com.example.java;


import java.text.NumberFormat;

/**
 * Created by mohamedbgassama on 7/18/16.
 */
public class covertInJava {
    public static void main(String[] args){

        int numValue = 42;
        String formInt = Integer.toString(numValue);
        System.out.println(formInt);

        Boolean boolValue = true;
        String formBool = Boolean.toString(boolValue);
        System.out.println(formBool);

        long longFormat = 10000000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longFormat);
        System.out.println(formatted);


        //Concatinating String using a String builder

        StringBuilder str = new StringBuilder()
                .append("Hello ")
                .append("World")
                .append("!");
        System.out.println(str);

    }
}
