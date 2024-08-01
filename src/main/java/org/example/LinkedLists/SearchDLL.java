package org.example.LinkedLists;
import java.util.*;
/*
https://www.geeksforgeeks.org/search-an-element-in-a-doubly-linked-list/?ref=next_article
 Given a Doubly linked list(DLL) containing N nodes and an integer X, the task is to find the position of the
 integer X in the doubly linked list. If no such position found then print -1.
 e.g Input: 15 <=> 16 <=> 8 <=> 7 <=> 13, X = 8
Output: 3
Explanation: X (= 8) is present at the 3rd node of the doubly linked list.
Therefore, the required output is 3
 */
public class SearchDLL {

    /*
    Initialize a variable, say pos, to store the position of the node containing data value X in the doubly linked list.
Initialize a pointer, say temp, to store the head node of the doubly linked list.
Iterate over the linked list and for every node, check if data value of that node is equal to X or not. If found to be true, then print pos.
Otherwise, print -1.

     */
    static class Node{

        //stores data value of node
        int data;

        //store pointer to next node
        Node next;

        //stores pointer to previous node
        Node prev;

    }

    //function inserts a node at the beginning of the DLL
    static Node push (Node head_ref, int new_data){

        //allocate memory for new node
        Node new_node = new Node();

        //Insert the data
        new_node.data = new_data;

        //when node added at the beginning
        //prev node is always null
        new_node.prev = null;

        //Link old list to the new node
        new_node.next = head_ref;

        //of pointer to head is not null
        if (head_ref != null){

            //change prev of head node to new node
            head_ref.prev = new_node;
        }

        //move head to point to new node
        head_ref = new_node;
        return head_ref;
    }

    //Function to find  position of an integer in DLL
    static int search(Node head_ref, int x){

        //stores head Node
        Node temp = head_ref;

        //stores position of integer in DLL
        int pos = 0;

        //Traverse DLL
        while (temp.data !=x && temp.next != null){
            //update pos
            pos++;
            //update temp
            temp = temp.next;
        }

        //if integer not in DLL
        if (temp.data != x)
            return -1;
        //if integer in DLL
        return (pos + 1);
    }

    public static void main(String[] args){

        Node head = null;
        int x = 8;

        //create DLL
        head = push(head, 14);
        head = push(head, 7);
        head = push(head, 8);
        head = push(head, 10);
        head = push(head, 21);
        System.out.println(search(head, x));
    }

}
