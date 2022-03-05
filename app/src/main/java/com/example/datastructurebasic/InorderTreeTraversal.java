package com.example.datastructurebasic;

/**
 * Created by PrernaSurbhi on 05/03/22.
 * program to print in order traversal of graph
 *
 * output
 * In order traversal :4 2 1 7 5 8 3 6
 */
public class InorderTreeTraversal {


    public static void inorder(Node root){
        if(root == null){
            return;
        }

        //traverse left substring
        inorder(root.left);

        // Display the data part of the root (or current node)
        System.out.print(root.data + " ");

        //traverse right substring
        inorder(root.right);

    }

    public static void main(String[] args)
    {
        /* Construct the following tree
                   1
                 /   \
                /     \
               2       3
              /      /   \
             /      /     \
            4      5       6
                  / \
                 /   \
                7     8
        */


        // create an object of Tree


        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
         System.out.print("In order traversal :");
        inorder(root);
    }
}
