package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 02/03/22.
 * program to check palindrome number
 *
 * output
 * enter number: 123
 * number is not a palindrome
 *
 *
 */
public class PalindromeNumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = s.nextInt();

//        int num =121;
        int reverseNum = 0;

        while(num !=0){
            // getting the last digit from number

            int digit = num % 10;
            reverseNum = reverseNum * 10 +digit;
            // removing the last digit from the number ;
            num = num / 10;
        }

        System.out.println("reverse number is :"+reverseNum);

        if(num == reverseNum){
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not a palindrome");
        }


    }
}
