package com.bridgelabz.linkedlist;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList(56);
        list.pushBack(30);
        list.pushBack(70);
        list.printList();
        System.out.println("-----------------------------------");
        list.insert(2, 40);
        list.printList();
        System.out.println("-----------------------------------------");
        list.remove(40);
        list.printList();
        LinkedList<Integer> sortedList = new LinkedList<>(54);
        sortedList.insertInOrder(45);
        sortedList.insertInOrder(21);
        sortedList.insertInOrder(87);
        System.out.println("-----------------------------------------");
        sortedList.printList();


    }
}
