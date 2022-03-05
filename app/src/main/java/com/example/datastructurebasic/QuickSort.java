package com.example.datastructurebasic;

import java.util.Arrays;

/**
 * Created by PrernaSurbhi on 04/03/22.
 * Program to Sort an Array using QuickSort
 *
 * output
 * array before sort : [8, 7, 2, 1, 0, 9, 6]
 * Sorted array[0, 1, 2, 6, 7, 8, 9]
 */
public class QuickSort {

    // Driver program
    public static void main(String args[]) {
        int[] data = {8, 7, 2, 1, 0, 9, 6 };
        int size = data.length;
        System.out.println("array before sort : "+Arrays.toString(data));
        QuickSort s = new QuickSort();
        s.sort(data,0,size-1);
        s.printSortedArray(data);
        System.out.println("Sorted array"+Arrays.toString(data));
    }

    public static int partition(int[] arr,int low , int j){
        int mid = (low+j)/2;
        int pivot = arr[mid];

        while(low<j){
            while(arr[low]<pivot){
                low++;
            }

            while(arr[j]>pivot){
                j--;
            }

            if(low<= j){
                 int temp = arr[low];
                arr[low] = arr[j];
                arr[j]= temp;
                low++;
                j--;
            }
        }

        return low;
    }

    public void  sort(int[] arr,int low , int high){
        if(low<high){
            int index = partition(arr,low,high);
            sort(arr,low,index-1);
            sort(arr,index,high);
        }
    }


    void printSortedArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}

