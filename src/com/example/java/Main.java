package com.example.java;

/**
 * Created by mohamedbgassama on 7/13/16.
 */
public class Main {
    public static void  main(String[] args){
       String s1 = "This is a string";
        System.out.println(s1);

        String s2 = new String("This is another strings");
        System.out.println(s2);

        String s3 = "Short size";
        String s4 = " M";
        String s5 = s3 + s4 + " Qty: " + 5;
        System.out.println(s5);

        char[] cahr = {'h','e','l','l','o'};
        String my = new String(cahr);
        System.out.println(my);

        char[] my2 = my.toCharArray();
        for (char m : my2){
            System.out.println(m);
        }

    }

}
