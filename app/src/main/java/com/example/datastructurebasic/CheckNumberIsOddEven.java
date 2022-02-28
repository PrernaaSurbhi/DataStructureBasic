package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 28/02/22.
 * this program is to get even odd number
 *
 * output
 * enter number: 45
 * number is odd
 *
 * enter number: 20
 * number is even
 */
public class CheckNumberIsOddEven {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = s.nextInt();

        if(num % 2 == 0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }

    }
}
