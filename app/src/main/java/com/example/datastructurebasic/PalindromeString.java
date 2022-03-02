package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 02/03/22.
 * program to check String is palindrome or not .
 *
 * output
 * enter string: abc
 * not a palindrome
 *
 * enter string: aba
 * Palindrome string
 */

public class PalindromeString {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter string: ");
        String str = s.nextLine();
        String reverse = "";
        int len = str.length();

        for(int i = len-1; i>= 0 ; i--){
          reverse = reverse + str.charAt(i);
        }

        if(str.equalsIgnoreCase(reverse)){
            System.out.println("Palindrome string");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
