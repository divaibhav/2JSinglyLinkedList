package implementation;

import myinterfaces.MySinglyLinkedListADT;

public class MySinglyLinkedList implements MySinglyLinkedListADT {
    private Node head;
    private Node tail;
    //no of elements in linked list
    private int size;
    //constructor
    public MySinglyLinkedList (){
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public void addFirst(int element){
        Node node = new Node(element);
        if(isEmpty()){
            head = node;
            tail = node;
            size++;
        }
        else{
            node.setNext(head);
            head = node;
            size++;
        }
    }
    @Override
    public void addLast(int element){
        Node node = new Node(element);
        if(isEmpty()){
            head = node;
            tail = node;
            size++;
        }
        else{
            tail.setNext(node);
            tail = node;
            size++;
        }
    }
    @Override
    public boolean isEmpty() {
        return head == null;
    }
    @Override
    public int size(){
        return size;
    }

    @Override
    public void addLastWithoutUsingTail(int element) {
        Node node = new Node(element);
        if(isEmpty()){
            head = node;
            tail = node;
        }
        else{
            //traverse till you find the last node
            Node temp = head;
            while(temp.getNext() != null){
                //update temp
                //this process is know as link hopping or pointer hopping
                temp = temp.getNext();
            }
            temp.setNext(node);
            tail = node;
        }
    }
}
