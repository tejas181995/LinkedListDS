package com.bridgelabz.linkedlist;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList(70);
        list.pushFront(30);
        list.pushFront(56);
        list.insert(2,10);
        list.printList();

    }
}
