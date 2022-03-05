package com.example.datastructurebasic;

/**
 * Created by PrernaSurbhi on 05/03/22.
 * program to print Post order travesal of tree
 *
 * output
 * Post order traversal :4 2 7 8 5 6 3 1
 */
public class postOrderTraversal {
    public static void postOrderTraversal(Node node){
        if(node == null){
            return;
        }

        //Traverse left subTree
        postOrderTraversal(node.left);

        //traverse node subtree
        postOrderTraversal(node.right);

        System.out.print(node.data+" ");

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
        System.out.print("Post order traversal :");
        postOrderTraversal(root);
    }
}
