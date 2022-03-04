package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 04/03/22.
 * Program to remove white spec from the Sentence
 *
 * output
 * enter sentence before removing white space: T    his is b  ett     er
 * sentense after removing space is: Thisisbetter
 */
public class WhiteSpaceString {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter sentence before removing white space: ");
        String str = s.nextLine();
        str= str.replaceAll("\\s","");
        System.out.println("sentense after removing space is: "+str);
    }
}
