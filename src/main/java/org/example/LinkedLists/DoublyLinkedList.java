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

    //insertion at the beginning of the DLL
    public void push(int new_data){

        //allocates new node and adds data
        Node new_Node = new Node(new_data);

        //next of new node as head and previous node null
        new_Node.next = head;
        new_Node.prev = null;

        //changes prev of head node to new node
        if (head != null)
            head.prev = new_Node;

        //moves the head to point ot the new node
        head = new_Node;
    }

    //Insertion after given node
    public void InsertAfter(Node prev_node, int new_data){

        //checks if previous node is NULL
        if(prev_node == null){
            System.out.println("Given previous node cannot be NULL");
            return;
        }

        //allocates new node and adds data
        Node new_Node = new Node(new_data);

        //point the next of new_node to the next of prev_node
        new_Node.next = prev_node.next;

        //point the next of prev_node to the new_node
        prev_node.next = new_Node;

        //point the prev of new_node to prev_node
        new_Node.prev = prev_node;

        //point the previous of next of new_node to new_node
        if (new_Node.next != null)
            new_Node.next.prev = new_Node;
    }

    //Insertion before give node
    public void InsertBefore(Node next_node, int new_data){

        //checks if next node is NULL
        if(next_node == null){
            System.out.println("Given previous node cannot be NULL");
            return;
        }

        //allocates new node and adds data
        Node new_Node = new Node(new_data);

        //set previous pointer of new_node as previous node of next_node
        new_Node.prev = next_node.prev;

        //set the previous pointer of next_node as new_node
        next_node.prev = new_Node;

        //set the next pointer of new_node as next_node
        new_Node.next = next_node;

        //set the next pointer of previous new_node to new_node
        if (new_Node.prev != null)
            new_Node.prev.next = new_Node;
        else head = new_Node;
    }

    //Insertion at the end of DLL
    void append(int new_data){

        //allocates new node and adds data
        Node new_Node = new Node(new_data);
        Node last = head; //need to travel to end of list

        //make the next pointer of new_node null
        new_Node.next = null;

        //if list is null, make new_node head
        if (head == null) {
            new_Node.prev = null;
            head = new_Node;
            return;
        }

        //travel to the end of the list
        while (last.next != null)
            last = last.next;

        //make next pointer of last node point to new_node
        last.next = new_Node;

        //change previous pointer of new_node to last node on list
        new_Node.prev = last;
    }

    public static void traverse(Node last){
        Node p;

        if (last == null) {
            System.out.println("List is empty");
            return;
        }

        p = last.next;

        do {
            System.out.println(p.data + " ");
            p = p.next;
        } while (p != last.next);
    }
}
