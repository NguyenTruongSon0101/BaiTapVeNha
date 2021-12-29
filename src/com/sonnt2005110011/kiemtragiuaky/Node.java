package com.sonnt2005110011.kiemtragiuaky;

public class Node {
    Apple data;
    Node next;

    public Node(){}

    public Node(Apple apple){
        data = apple;
        next = null;
    }

    public Node (Apple apple, Node node){
        data = apple;
        next = node;
    }
}
