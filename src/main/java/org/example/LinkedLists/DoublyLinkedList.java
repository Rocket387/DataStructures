package org.example.LinkedLists;

/*
The data part stores the information, the next pointer points to the next node of the linked list
and the previous pointer points to the previous node of the linked list. The next pointer of the last node
and the previous pointer of the first node stores null.
Traversal of items can be done in the forward direction as well as backward direction
 */
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
