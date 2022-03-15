 package com.example.datastructurebasic.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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


//        isAnagramUsingMap(str1,str2);
//        if(isAnagramUsingMap(str1,str2)){
//            System.out.print("Anagram found :");
//        }else{
//            System.out.print("Anagram not found: ");
//        }
    }

    public static boolean isAnanagram(String str1, String str2){
        //base condition
        if(str1 == null || str2 == null|| str1.length() != str2.length()){
            return false;
        }else{
            char[] ch1 = str1.toLowerCase().toCharArray();
            char[] ch2 = str2.toLowerCase().toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            return Arrays.equals(ch1,ch2);
        }
    }

    public static boolean isAnagramUsingMap(String str1, String str2){
        if(str1 == null || str2 == null|| str1.length() != str2.length()){
            return false;
        }

        Map<Character,Integer> map = new HashMap<>();

        //maintain count of each character of x on the map.
        //getOrDefault - java 8 concept , if value present , then it other wise resturn default value.

        for(char c:str1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        //do for each character of str2
        //if the str2 character not present , that means that character is not in str1, so not a anagram
        for(char c:str2.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }

            //decrease frequency of str2 on the map
            map.put(c,map.get(c)-1);

            //if the frequency become zero , eracse it form map

            if(map.get(c) == 0){
                map.remove(c);
            }
        }

        return map.isEmpty();
    }
}
