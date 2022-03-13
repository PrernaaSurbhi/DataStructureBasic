package com.example.datastructurebasic.string;

/**
 * Created by PrernaSurbhi on 08/03/22.
 * program to Check if strings can be derived from each other by circularly rotating them
 *
 * output
 * Given strings can be derived from each other
 */
public class StringDerviedByRotation {
     public static boolean check(String x, String y){
         if(x== null || y== null){
             return false;
         }
         //check if the string length are different they can't be derived from each otehr
         if(x.length() != y.length()){
             return false;
         }

         for(int i = 0;i<x.length();i++){

             //left rotation String X by 1 unit
             x= x.substring(1)+x.charAt(0);

             // return true if `X` becomes equal to `Y`
             if (x.compareTo(y) == 0) {
                 return true;
             }
         }

         return false ;
     }

    public static void main(String[] args)
    {
        String X = "ABCD";
        String Y = "DABC";

        if (check(X, Y)) {
            System.out.println("Given strings can be derived from each other");
        }
        else {
            System.out.println("Given strings cannot be derived from each other");
        }
    }
}
