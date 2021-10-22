package com.sonnt2005110011.tuan07;

public class MyLinkedList {
    Node head = null;
    Node tail = null;

//thêm vào cuối danh sách
void add(int data){
    Node newNode = new Node(data);

    if(head == null){
        head = newNode;
        tail = newNode;
    }else{
        tail.next = newNode;
        tail = newNode;
    }
}
//in danh sách
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
//thêm vào đầu danh sách
void addHead(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        tail = newNode;
    }else{
        newNode.next = head;
        head = newNode;
    }
}
//thêm vào vị trí trước số cần tìm
void addAfter(int soCanTim,int soCanThem){
    int dem = 0;
    Node tam = head;
    Node truocTam = head;
    while(tam != null){
        if(tam.data == soCanTim)
            break;
        tam = tam.next;
        dem++;
        if(dem>1)
            truocTam = truocTam.next;
        
    }
    Node them = new Node();
    them.data = soCanThem;
    
            if(dem == 0){
                addHead(soCanThem);
            }else{
                 them.next = tam;
                 truocTam.next = them;
                 }
    
    
    }
    //xoá đầu danh sách
    void deleteHead(){
        head = head.next;
    }
    //xóa cuối danh sách
    void deleteTail(){
        Node tam = head;
        while(tam != null){
            if(tam.next == tail){
                tam.next = null;
                tail = tam;
                break;
            }
            tam = tam.next;
        }
    }
    //xóa số bất kỳ trong danh sách
    void delete(int soCanXoa){
        Node tam = head;
        
        
        while(tam != null){
            if(tam.next.data == soCanXoa)
                break;
            tam = tam.next;
        }
        tam.next = tam.next.next;
    }
    //sửa thông tin của 1 phần tử
    void fix(int soCanSua,int soDaSua){
        Node tam = head;
        while(tam != null){
            if(tam.data == soCanSua)
                break;
            tam = tam.next;
        }
        tam.data = soDaSua;
    }
}
