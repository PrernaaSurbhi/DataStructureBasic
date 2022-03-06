package com.example.datastructurebasic.graph;



/**
 * Created by PrernaSurbhi on 06/03/22.
 * Program to  search node in Binary Search Tree
 *
 * output
 * YES
 */
public class SeringBSTNode {

    public static void inorderTraversal(Node node){
        if(node == null){
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data+"  ");
        inorderTraversal(node.right);
    }


    public static boolean searchNode(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }// then recur on left subtree /
        boolean res1 = searchNode(root.left, key);
        boolean res2 = searchNode(root.right, key);
        if(res1 || res2){
            return true;
        }

        return false;
    }

    public static Node insert(Node node , int key){
        //when tree is empty
        if(node == null){
            node = new Node(key);
        }
        //traverse  left and right subtree
        if(node.data > key){
            node.left = insert(node.left,key);
        }else if(node.data < key){
            node.right = insert(node.right, key);
        }
        return node;
    }


    public static Node constructBST(int[] keys){
        Node node = null;
        for(int key :keys){
            node = insert(node,key);
        }
        return node;

    }

    public static void main(String args[]){
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
        Node root = constructBST(keys);

        if(searchNode(root,16)){
            System.out.println("YES");
        }else{
            System.out.println("No");
        }

    }
}
