package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 28/02/22.
 * program to check character is aplhabet or not
 *
 * output
 * input a character: 122
 * 1 is not alphabet
 *
 * input a character: yioe
 * y is a alphabet
 *
 */
public class CharacterAlphabetOrNot {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("input a character: ");
        String str = s.next();
        Character c = str.charAt(0);

        String output = (c >= 'a'&& c<'z')||(c<'A' && c>'Z') ? c+" is a alphabet" : c+" is not alphabet";
        System.out.println(output);
    }
}
