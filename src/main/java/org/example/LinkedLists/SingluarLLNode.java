package org.example.LinkedLists;

/* new node added
1) At the front of the linked list
2) After a given node.
3) At the end of the linked list.
 */

//see README for further information on singly linked list info
class SingularLLNode {
    int data;
    SingularLLNode next;
    SingularLLNode(int d)
    {
        data = d;
        next = null;
    }
}

// Class to insert element in LL
class LinkedList {

    SingularLLNode head;

    void insertAtFront(int new_data){

        SingularLLNode new_node = new SingularLLNode(new_data);

        new_node.data = new_data;

        new_node.next = head;

        head = new_node;
    }


    void removeFirstNode(){

        if (head == null)
            return;

        SingularLLNode temp = head;
        head = head.next;
    }

    // Inserts a new Node at front
    // of the list.
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        SingularLLNode new_node = new SingularLLNode(new_data);

        // 3. Make next of new Node as head
        new_node.next = head;

        // 4. Move the head to point to
        // new Node
        head = new_node;
    }

    // Inserts a new node after the
    // given prev_node.
    public void insertAfter(SingularLLNode prev_node,
                            int new_data)
    {
        // 1. Check if the given Node is null
        if (prev_node == null)
        {
            System.out.println(
                    "The given previous node cannot be null");
            return;
        }

        /* 2 & 3: Allocate the Node &
                  Put in the data*/
        SingularLLNode new_node = new SingularLLNode(new_data);

        // 4. Make next of new Node as next
        // of prev_node
        new_node.next = prev_node.next;

        // 5. make next of prev_node as
        // new_node
        prev_node.next = new_node;
    }

    /* Appends a new node at the end.
       This method is defined inside
       LinkedList class shown above */
    public void append(int new_data)
    {
        /* 1. Allocate the Node &
           2. Put in the data
           3. Set next as null */
        SingularLLNode new_node = new SingularLLNode(new_data);

        /* 4. If the Linked List is empty,
              then make the new node as head */
        if (head == null)
        {
            head = new SingularLLNode(new_data);
            return;
        }

        /* 4. This new node is going to be
              the last node, so make next
              of it as null */
        new_node.next = null;

        // 5. Else traverse till the last node
        SingularLLNode last = head;
        while (last.next != null)
            last = last.next;

        // 6. Change the next of last node
        last.next = new_node;
        return;
    }

    void printList(){

        SingularLLNode node = head;
        while (node != null){
            System.out.println(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args){

        LinkedList list = new LinkedList();

        list.insertAtFront(6);
        list.insertAtFront(5);
        list.insertAtFront(4);
        list.insertAtFront(3);
        list.insertAtFront(2);
        list.insertAtFront(1);

        System.out.println("After inserting nodes at the front: ");
        list.printList();
        list.removeFirstNode();
        System.out.println("After removing first node: ");
        list.printList();

        // Start with the empty list
        LinkedList llist = new LinkedList();

        // Insert 6. So linked list
        // becomes 6->NUllist
        llist.append(6);

        // Insert 7 at the beginning.
        // So linked list becomes
        // 7->6->NUllist
        llist.push(7);

        // Insert 1 at the beginning.
        // So linked list becomes
        // 1->7->6->NUllist
        llist.push(1);

        // Insert 4 at the end.
        // So linked list becomes
        // 1->7->6->4->NUllist
        llist.append(4);

        // Insert 8, after 7. So linked
        // list becomes
        // 1->7->8->6->4->NUllist
        llist.insertAfter(llist.head.next, 8);

        System.out.println(
                "Created Linked list is: ");
        llist.printList();
    }
}