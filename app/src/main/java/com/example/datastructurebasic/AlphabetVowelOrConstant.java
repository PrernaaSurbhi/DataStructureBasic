package com.example.datastructurebasic;

import java.util.Scanner;

/**
 * Created by PrernaSurbhi on 28/02/22.
 * This program is to print constant or vowel value from character
 *
 * output
 * enter character string: wsgeyjapu
 * its constant
 * its constant
 * its constant
 * its vowel
 * its constant
 * its constant
 * its vowel
 * its constant
 * its vowel
 */

public class AlphabetVowelOrConstant {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("enter character string: ");

        String str = s.nextLine();
        char[] ch = str.toCharArray();

        for(Character c:ch){
            if(c =='a'||c == 'e'|| c=='i'||c== 'o'|| c=='u'){
                System.out.println("its vowel");
            }else{
                System.out.println("its constant");
            }
        }
    }
}
