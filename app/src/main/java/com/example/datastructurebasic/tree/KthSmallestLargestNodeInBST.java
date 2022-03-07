package com.example.datastructurebasic.tree;

import java.util.ArrayList;

/**
 * Created by PrernaSurbhi on 07/03/22.
 * program to find Largest and Smallest element in BST
 *
 * //Inorder traversal -- 8  10  12  15  16  20  25
 *
 * //kth smallest element is, smallest 6th element is  : 20
 *
 * kth largest element ,largest 3rd element in bst is : 16
 */
public class KthSmallestLargestNodeInBST {

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
        ar = inorder(root,ar);
        //function for finding the smallest element.
        getSmallestElement(ar,6);

        //function for finding the largest element
        getLargestElement(ar,3);
    }

    public static void getSmallestElement(ArrayList<Integer> ar,int k){
        int element = ar.get(k-1);
        System.out.println("kth smallest element is, smallest 6th element is  : "+element);
    }

    public static void getLargestElement(ArrayList<Integer> ar,int k){
        int n = ar.size();
        int element = ar.get(n-k);
        System.out.println("kth largest element ,largest 3rd element in bst is : "+element);
    }

    public static ArrayList<Integer> inorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return arr;
        }
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
        return arr;
    }

}
