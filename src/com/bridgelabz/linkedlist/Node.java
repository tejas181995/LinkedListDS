package com.bridgelabz.linkedlist;

public class Node<T> {
    public T data;
    public Node<T> link;

    public Node(T data) {
        this.data = data;
        this.link=null;
    }
    public boolean hasNext(){
        return this.link == null;
    }
    public Node next(){
        return this.link;
    }
}
