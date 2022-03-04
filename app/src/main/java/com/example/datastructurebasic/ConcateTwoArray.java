package com.example.datastructurebasic;

import java.util.Arrays;

/**
 * Created by PrernaSurbhi on 04/03/22.
 * Program to concate two array with and without arraycopy function
 *
 * output
 * [1, 2, 3, 4, 5, 6]
 * concatWithoutFunction: [1, 2, 3, 4, 5, 6]
 */
public class ConcateTwoArray {
    public static void main(String args[]) {
        int[] a = {1,2,3};
        int[] b = {4,5,6};

        int alen = a.length;
        int blen = b.length;

        int[] result =  new int[alen + blen];

        concateUsingArraycopy( a ,b, alen, blen,result);
        concatWithoutFunction( a ,b, alen, blen,result);
    }

    public static void concateUsingArraycopy(int[] a ,int[] b, int alen, int blen,int[] result){
        System.arraycopy(a, 0, result, 0, alen);
        System.arraycopy(b, 0, result, alen, blen);

        System.out.println(Arrays.toString(result));
    }

    public static void concatWithoutFunction(int[] a ,int[] b, int alen, int blen,int[] result){
       int pos = 0;

       //result[pos] = element;
        //            pos++;
       for(int element:a){
           result[pos] = element;
           pos++;
       }

       for(int i:b){
           result[pos] = i;
           pos++;
       }
       System.out.println("concatWithoutFunction: "+Arrays.toString(result));
    }
}
