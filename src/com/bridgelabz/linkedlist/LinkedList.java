package com.bridgelabz.linkedlist;

public class LinkedList<T> {

    Node<T> head;

    public LinkedList(T data) {
        head = new Node(data);
    }
    public LinkedList(){
        this.head = null;
    }

    public void pushBack(T next){
        Node<T> temp = head;
        while(temp.hasNext())
            temp = temp.next();
        temp.link = new Node<>(next);
    }
    public void pushFront(T next){
        Node<T> newNode = new Node<>(next);
        newNode.link = head;
        head = newNode;
    }
    public void printList(){
        Node<T> temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next();
        }

    }
    public void insert(int postion, T data){
        Node<T> temp = head;
        if(postion == 0){
            pushFront(data);
        }else {
            for(int i=0; i<postion - 1; i++){
                temp = temp.next();

            }
            Node<T> newnode = new Node(data);
            newnode.link = temp.next();
            temp.link = newnode;
        }
    }
    public T pop(){
        T val = head.data;
        head = head.next() ;
        return val;
    }

}
