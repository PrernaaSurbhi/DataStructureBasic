package com.example.datastructurebasic.graph;

/**
 * Created by PrernaSurbhi on 06/03/22.
 */
public class Node {
    int data;
    Node left,right;

    public Node(int key){
        data = key;
        left = right = null;
    }
}
