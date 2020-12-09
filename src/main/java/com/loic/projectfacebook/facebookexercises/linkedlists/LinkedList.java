package com.loic.projectfacebook.facebookexercises.linkedlists;

import java.util.HashSet;

public class LinkedList {
    ListNode head;

    public void addNode(int d){
        ListNode n = new ListNode(d);
        if(this.head==null){
            this.head = n;
        }else{
            n.next = head;
            head = n;
        }
    }

    public void print(){
        ListNode n = head;
        while(n!=null){
            System.out.print(n.data +" ");
            n = n.next;
        }
    }

    public ListNode deleteDuplicates(ListNode n) {

        HashSet<Integer> set = new HashSet<>();
        ListNode previous = null;

        while (n != null) {

            if (set.contains(n.data))

            {
                previous.next = n.next;
            }
            else
            {
                set.add(n.data);
                previous = n;
            }

            n = n.next;

        }

        return n;
    }

}
