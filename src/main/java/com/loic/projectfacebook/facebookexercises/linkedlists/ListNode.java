package com.loic.projectfacebook.facebookexercises.linkedlists;

public class ListNode {
    ListNode next;
    int data;

    public ListNode(int d) {
        data = d;
        next = null;
    }
    public ListNode(int d, ListNode next)
    { data = d;
    this.next = next;
    }
}
