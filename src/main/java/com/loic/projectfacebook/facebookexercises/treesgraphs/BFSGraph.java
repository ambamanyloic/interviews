package com.loic.projectfacebook.facebookexercises.treesgraphs;

public class BFSGraph {

    void search(Node root) {

        QueueNode queue = new QueueNode();

    root.marked= true;

    queue.enqueue(root.val); // Add to the end of queue


       /* while (!queue.isEmpty()) {

            Node r = queue.dequeue(); // Remove from the front of the queue

            visit(r);

            foreach (Node n in r.adjacent) {

            if (n.marked== false) {

                n.marked= true;

                queue.enqueue(n);*/

            }

        }
