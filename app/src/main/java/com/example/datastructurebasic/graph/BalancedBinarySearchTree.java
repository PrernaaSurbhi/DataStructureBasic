package com.example.datastructurebasic.graph;

import java.util.Arrays;

/**
 * Created by PrernaSurbhi on 07/03/22.
 */
public class BalancedBinarySearchTree {
    public static void main(String[] args){
        int[] keys = {15, 10, 20, 8, 12, 16, 25};
        //construct a balance binary search tree
        Node root = convertBalancedBinarySearch(keys);
        // print the keys in an inorder fashion
        inorderTraversal(root);

    }

    public static Node convertBalancedBinarySearch(int[] keys){
        //sort the key first
        Arrays.sort(keys);
        int n = keys.length;
        return balancedBinarySearch(keys,0,n-1,null);
    }

    public static Node balancedBinarySearch(int[] keys , int low , int high , Node root){
        //base case
        if(low>high){
            return root;
        }

        //find middle element of current range
        int mid = (low+high)/2;
        //construct new node to middle element and assign it to the root
        root = new Node(keys[mid]);

        //left subtree
        root.left = balancedBinarySearch(keys,low,mid-1,root.left);

        //right subtree
        root.right = balancedBinarySearch(keys,mid+1,high,root.right);

        return root;
    }

    public static void inorderTraversal(Node node){
        if(node == null){
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data+" ");
        inorderTraversal(node.right);
    }

}
