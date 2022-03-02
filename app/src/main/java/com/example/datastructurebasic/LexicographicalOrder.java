package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 02/03/22.
 * program to write LexicographicalOrder with compareTo() function
 *
 * output
 * enter sentence 1: hello
 * enter sentence 2: hello
 * str1 is equal to str2
 *
 *enter sentence 1: hello
 * enter sentence 2: meklo
 * str1 is greater than str2
 *
 * enter sentence 1: hello
 * enter sentence 2: flag
 * str1 is less than str2
 */
public class LexicographicalOrder {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter sentence 1: ");
        String str1 = s.nextLine();

        System.out.print("enter sentence 2: ");
        String str2 = s.nextLine();

        int value= str1.compareTo(str2);


        if (value < 0) {
            System.out.println("str1 is greater than str2");
        } else if (value == 0) {
            System.out.println("str1 is equal to str2");
        } else {
            System.out.println("str1 is less than str2");
        }



    }
}
