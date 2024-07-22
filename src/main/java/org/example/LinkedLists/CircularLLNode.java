package org.example.LinkedLists;


//see README for further information on circular linked list info
public class CircularLLNode{
    int data;
    CircularLLNode next;


    static CircularLLNode addToEmpty(CircularLLNode last, int data){

        if (last != null)
            return last;

        CircularLLNode temp = new CircularLLNode();

        temp.data = data;
        last = temp;
        last.next = last;

        return  last;
    }

    static CircularLLNode addBegin(CircularLLNode last, int data){

        if (last == null)
            return addToEmpty(last, data);

        CircularLLNode temp = new CircularLLNode();

        temp.data = data;

        temp.next = last.next;
        last.next = temp;

        return last;

    }

    static CircularLLNode addEnd(CircularLLNode last, int data){
        if (last == null)
            return addToEmpty(last, data);

        CircularLLNode temp = new CircularLLNode();
        temp.data = data;
        temp.next = last.next;
        last.next = temp;
        return temp;
    }

    static CircularLLNode addAfter(CircularLLNode last, int data, int item)
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

    static void traverse(CircularLLNode last){
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
    }
}