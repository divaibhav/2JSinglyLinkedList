package myinterfaces;

public interface MySinglyLinkedListADT {
    void addFirst(int element);
    void addLast(int element);
    boolean isEmpty();
    int size();
    void addLastWithoutUsingTail(int element);
    void traverse();
    int removeFirst();
    int removeLast();
    int first();
    int last();
    boolean search(int searchElement);
}
