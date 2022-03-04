package com.example.datastructurebasic;

/**
 * Created by PrernaSurbhi on 04/03/22.
 *program to Print OddNumberIncrementShape
 *
 * output
 *
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***************
 * *****************
 * *******************
 *
 */
public class OddNumberIncrementShape {
    public static void main(String[] args) {
        int r = 9 ;
        for (int i = 0; i <= r; i++) {

            int size = 2*i+1;

            for(int j= 0;j< size;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
