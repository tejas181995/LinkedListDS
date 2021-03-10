package com.bridgelabz.linkedlist;

public class LinkedList<T> {

    public T data;
    private LinkedList<T> link;

    public LinkedList(T data) {
        this.data = data;
        this.link = null;
    }

    public void setData(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }
    public void pushBack(T next){
        LinkedList temp = this;
        while(temp.link != null)
            temp = temp.link;
        temp.link = new LinkedList(next);
    }
    public void printList(){
        LinkedList temp = this;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.link;
        }

    }

}
