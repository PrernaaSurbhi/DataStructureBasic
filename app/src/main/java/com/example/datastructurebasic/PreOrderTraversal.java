package com.example.datastructurebasic;

/**
 * Created by PrernaSurbhi on 05/03/22.
 * program to print PreOrderTraversal
 *
 * output
 * Pre order traversal :1 2 4 3 5 7 8 6
 */
public class PreOrderTraversal {
    public static void PreOrdertraversal(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        //traverse left tree
        PreOrdertraversal(node.left);
        PreOrdertraversal(node.right);
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
        System.out.print("Pre order traversal :");
        PreOrdertraversal(root);
    }
}
