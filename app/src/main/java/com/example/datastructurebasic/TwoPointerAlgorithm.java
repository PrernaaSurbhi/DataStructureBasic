package com.example.datastructurebasic;

/**
 * Created by PrernaSurbhi on 22/03/22.
 *
 * Program to find two pointer algorithm in java
 *
 * output
 * sum found at index   3 , 4
 */
public class TwoPointerAlgorithm {
    public static void main(String[] args){
        int arr[] = { 2, 3, 5, 8, 9, 10, 11 };
        int target = 17;
        findSum(arr,target);

    }

    public static int findSum(int[] arr , int target){
      int i = 0;
      int j = arr.length -1;

      while(i<=j){
          if(arr[i]+arr[j] == target){

              System.out.print("sum found at index "+"  "+i+" , "+j+"  ");
              return 1;
          }
          else if(arr[i]+arr[j]>target){
              j--;
          }

          else {
              i++;
          }
      }

      return 0;
    }
}

