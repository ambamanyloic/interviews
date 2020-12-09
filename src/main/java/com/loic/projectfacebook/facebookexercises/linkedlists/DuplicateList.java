package com.loic.projectfacebook.facebookexercises.linkedlists;

import java.util.HashSet;

public class DuplicateList {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(1);
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(2);

        list.deleteDuplicates(list.head);

        list.print();
    }


}
