package main;

import implementation.MySinglyLinkedList;

public class MyMain {
    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);

        list.traverse();
        System.out.println("reverse");
        list.traverseReverse(list.getHead());
        list.reverse(list.getHead(), null);
        list.traverse();


    }
}
