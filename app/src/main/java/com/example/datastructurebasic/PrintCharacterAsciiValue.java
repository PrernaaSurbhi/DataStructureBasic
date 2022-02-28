package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 28/02/22.character
 * this prog is to print ascii value of the character
 *
 * output :
 * enter charcter number: a
 * asci value is 97
 *
 * enter charcter number: d
 * asci value is 100
 */
public class PrintCharacterAsciiValue {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        System.out.print("enter charcter number: ");
        String str = s.nextLine();
        char[] chArray = str.toCharArray();
        for(Character c:chArray){
            System.out.println("asci value is "+(int)c);
        }

    }
}
