package com.example.datastructurebasic;

/**
 * Created by PrernaSurbhi on 04/03/22.
 *
 * program to Print reverse Triangle
 *
 * output
 *      *  *  *  * *
 *      *  *  *  *
 *      *  *  *
 *      *  *
 *      *
 *
 */


public class InvertTriangle {
    public static void main(String[] args) {

        for(int i = 1; i<= 5 ;i++){
            for(int j = i;j<=5 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
