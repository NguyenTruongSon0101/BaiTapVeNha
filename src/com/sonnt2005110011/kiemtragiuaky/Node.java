package com.sonnt2005110011.kiemtragiuaky;

public class Node {
    Apple data;
    Node next;

    public Node(){}

    public Node(Apple d){
        data = d;
        next = null;
    }

    public Node (Apple d, Node n){
        data = d;
        next = n;
    }
}
