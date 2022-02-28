package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 28/02/22.
 * this code is for printing the integer value enter by the user
 *
 * output ---
 * enter the number: 10
 * you enter the number as : 10
 */



public class PrintIntByUser {

    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number: ");

        int number = s.nextInt();
        System.out.println("you enter the number as : "+number);

    }
}
