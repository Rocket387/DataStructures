package org.example.LinkedLists;


//see README for further information on circular linked list info
public class CircularLLNode{
    public int data;
    public CircularLLNode next;

    public static CircularLLNode addToEmpty(CircularLLNode last, int data){

        if (last != null)
            return last;

        CircularLLNode temp = new CircularLLNode();

        temp.data = data;
        last = temp;
        last.next = last;

        return  last;
    }

    public static boolean containsNode(CircularLLNode last, int data) {
        if (last == null) {
            return false;
        }

        CircularLLNode first = last.next;
        if (first == null) {
            return false;
        }

        CircularLLNode temp = first;

        // Traverse the list
        do {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        } while (temp != first);

        return false;
    }

    public static CircularLLNode addBegin(CircularLLNode last, int data){

        if (last == null)
            return addToEmpty(last, data);

        CircularLLNode temp = new CircularLLNode();

        temp.data = data;

        temp.next = last.next;
        last.next = temp;

        return last;

    }

    public static CircularLLNode addEnd(CircularLLNode last, int data){
        if (last == null)
            return addToEmpty(last, data);

        CircularLLNode temp = new CircularLLNode();
        temp.data = data;
        temp.next = last.next;
        last.next = temp;
        return temp;
    }

    public static CircularLLNode addAfter(CircularLLNode last, int data, int item)
    {
        if (last == null)
            return null;

        CircularLLNode temp, p;
        p = last.next;
        do {
            if (p.data == item) {
                temp = new CircularLLNode();
                temp.data = data;
                temp.next = p.next;
                p.next = temp;
                if (p == last)
                    last = temp;
                return last;
            }
            p = p.next;
        } while (p != last.next);

        System.out.println(item
                + " not present in the list.");
        return last;
    }

    // Method to delete a node from the circular linked list
    public static CircularLLNode deleteNode(CircularLLNode last, int key) {
        // If the list is empty
        if (last == null)
            return null;

        CircularLLNode current = last.next, prev = last;
        boolean found = false;

        // Traverse the list to find the node to be deleted
        do {
            if (current.data == key) {
                found = true;
                break;
            }
            prev = current;
            current = current.next;
        } while (current != last.next);

        // If node to be deleted is found
        if (found) {
            // If the list contains only one node
            if (last.next == last && last.data == key) {
                last = null;
            } else if (current == last) { // If the node to be deleted is the last node
                prev.next = current.next;
                last = prev;
            } else if (current == last.next) { // If the node to be deleted is the first node
                last.next = current.next;
            } else { // For any other node
                prev.next = current.next;
            }
        }

        return last;
    }

    public static void traverse(CircularLLNode last){
        CircularLLNode p;

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

    public static void main(String[] args) {

        CircularLLNode last = null;
        last = addToEmpty(last, 6);
        traverse(last);
        last = addBegin(last, 4);
        last = addBegin(last, 2);
        traverse(last);
        last = addEnd(last, 8);
        last = addEnd(last, 12);
        traverse(last);
        last = addAfter(last, 10, 8);
        traverse(last);
        last = deleteNode(last, 4);
        traverse(last);
    }
}