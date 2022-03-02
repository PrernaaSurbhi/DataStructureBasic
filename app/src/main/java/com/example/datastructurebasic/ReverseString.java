package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 02/03/22.
 * program to reverse a string without any inbuild operator
 *
 * output
 * enter sentence: go work
 * sentence before reverse is:go work
 * sentence after reverse is:krow og
 */
public class ReverseString {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter sentence: ");
        String str = s.nextLine();
        System.out.println("sentence before reverse is:"+str);
        System.out.print("sentence after reverse is:");
        int i = str.length();
        while(i>0){
             System.out.print(str.charAt(i-1)+"");
             i--;
        }
    }

}
