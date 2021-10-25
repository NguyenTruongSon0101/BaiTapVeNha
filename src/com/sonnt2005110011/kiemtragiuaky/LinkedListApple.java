package com.sonnt2005110011.kiemtragiuaky;

public class LinkedListApple {
    Node head = null;
    Node tail = null;

    void themDau(Apple data){
        Node newNode = new Node(data);
    
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    void print(){
        Node current = head;
    
        if(head == null){
            System.out.println("Danh sách rỗng");
            return;
        }
        System.out.println("các nút trong danh sách");
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    
}
