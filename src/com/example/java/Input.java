package com.example.java;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.Scanner;

/**
 * Created by mohamedbgassama on 7/19/16.
 */

public class Input {
    public static void main(String[] args){
        String name;
        double height;

        Scanner sc = new Scanner(System.in);


        System.out.println("What is your name ?");
             name = sc.nextLine();
        System.out.println("What is your height ? " + name);
             height = sc.nextDouble();
        System.out.println(name + " you're " + height + " inch tall");

        if(height <= 5.0){
            System.out.println("You're a short man !!!");
        }else{
            System.out.println("you're a tell man");
        }



    }
}
