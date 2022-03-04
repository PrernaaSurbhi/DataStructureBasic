package com.example.datastructurebasic;

/**
 * Created by PrernaSurbhi on 03/03/22.
 * program to Print Triangle
 *
 * output
 * *
 * **
 * ***
 * ****
 * *****
 */

public class TrianglePattern {
    public static void main(String[] args){
        int r = 5;

        for(int i = 1; i<= r ;i++){
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
