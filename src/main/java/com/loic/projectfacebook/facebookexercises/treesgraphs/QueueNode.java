package com.loic.projectfacebook.facebookexercises.treesgraphs;

public class QueueNode {

    Node first, last;

    QueueNode() {
        first = null;
        last = null;

    }

    public void enqueue(int val){

        if( last == null ) {

            first = last = new Node(val);

        }

        Node newNode = new Node(val);

        if(last != null) {

            last.next = newNode;
        }

        last = newNode;

    }

    public int dequeue(){

            if (first == null) {  first = last;
            }


                int data = first.val;

                first = first.next;

        return data;

    }

    public int peek() {

        if(first == null) { }

        return first.val;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
