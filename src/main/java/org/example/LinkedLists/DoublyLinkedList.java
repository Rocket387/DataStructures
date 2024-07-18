package org.example.LinkedLists;

public class DoublyLinkedList {
    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        //next and prev intialized by default as null
        Node(int d) {
            data = d;
        }
    }
}
