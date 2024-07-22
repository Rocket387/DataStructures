package org.example.LinkedLists;

/*
The data part stores the information and the next pointer points to the
next node of the linked list. The next pointer of the last node stores null as it is the last
node of the linked list and there is no next node.
Traversal of items can be done in the forward direction only
 */
public class SinglyLinkedList {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

}
