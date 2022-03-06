package com.example.datastructurebasic.graph;

/**
 * Created by PrernaSurbhi on 06/03/22.
 * Program to insert node in the binary search tree.
 *
 * output
 * inorder traversal is : 8  10  12  15  16  20  25
 *
 */
public class InsertBST {

    public static void inorderTraversal(Node node){
        if(node == null){
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data+"  ");
        inorderTraversal(node.right);
    }

    public static Node insertNode(Node node , int key){
        //when tree is empty
        if(node == null){
            node = new Node(key);
            return node;
        }
        //key is less than root node , traverse left of the tree
        //key is more than root node , traverse right of the tree
        if(key < node.data){
            node.left = insertNode(node.left,key);
        }
        else if(key > node.data){
            node.right = insertNode(node.right,key);
        }
        return node;
    }


    public static Node constructBST(int[] keys){
        Node node = null;
        for(int key:keys){
            node = insertNode(node,key);
        }
        return node;
    }

    public static void main(String[] args){
         /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */


        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
        //inserting node to the binary search tree
        Node root = constructBST(keys);
        //for printing the node of BST
        System.out.print("inorder traversal is : ");
        inorderTraversal(root);
    }
}

