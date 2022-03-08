package com.example.datastructurebasic.tree;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by PrernaSurbhi on 08/03/22.
 * //Inorder traversal -- 8  10  12  15  16  20  25
 *
 *Program to find a pair with the given sum in a BST
 *
 * output
 * Two sum pair found is 12 , 15
 */
public class PairWithGivenSumBST {
    public static void main(String[] args){
        /* Construct the following BST
                  15
                /    \
               /      \
              10       20
             /  \     /  \
            /    \   /    \
           8     12 16    25
        */

        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);
        ArrayList<Integer> ar = new ArrayList<>();
        ar = getInoderArray(root,ar);
        getBSTPairSum(ar,27);
    }

    public static ArrayList<Integer> getInoderArray(Node node, ArrayList<Integer> arr){
        if(node == null){
            return arr;
        }
        //traverse left sub tree
        getInoderArray(node.left,arr);
        arr.add(node.data);
        getInoderArray(node.right,arr);
        return arr;
    }

    public static void getBSTPairSum(ArrayList<Integer> ar, int sum){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = ar.size();

        for(int i = 0 ;i<n ;i++){
            int compliment = sum -ar.get(i);
            if(map.containsKey(compliment)){
             int index =   map.get(compliment);
             int a3 = ar.get(index);
             int a2 = ar.get(i);

             System.out.print("Two sum pair found is "+a3+" , "+a2+" ");
            }else{
                map.put(ar.get(i),i);
            }
        }
    }

}
