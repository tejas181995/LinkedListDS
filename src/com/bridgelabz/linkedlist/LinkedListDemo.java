package com.bridgelabz.linkedlist;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList(30);
        list.pushFront(70);
        list.pushFront(56);
        //list.insert(2,10);
        //list.printList();
        Integer val = list.pop();
        System.out.println("val: " + val);
        list.printList();

    }
}
