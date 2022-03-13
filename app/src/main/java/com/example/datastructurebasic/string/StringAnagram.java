package com.example.datastructurebasic.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by PrernaSurbhi on 13/03/22.
 * Program to print Anagram of String.
 *
 * output
 * Enter string 1 : Silent
 * enter string 2: Listen
 * Anagram found
 */

public class StringAnagram {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string 1 : ");
        String str1 = reader.readLine();

        System.out.print("enter string 2: ");
        String str2 = reader.readLine();

        isAnanagram(str1,str2);
        if(isAnanagram(str1,str2)){
            System.out.print("Anagram found :");
        }else{
            System.out.print("Anagram not found: ");
        }
    }

    public static boolean isAnanagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }else{
            char[] ch1 = str1.toLowerCase().toCharArray();
            char[] ch2 = str2.toLowerCase().toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            return Arrays.equals(ch1,ch2);
        }
    }
}
