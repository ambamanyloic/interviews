package com.loic.projectfacebook.crackingcode.linkedlists;



import java.util.*;

public class KthToLast {
    public int kthToLast(ListNode list,int k) {


        ListNode head = list;
        ArrayList<ListNode> list1 = new ArrayList();

        int index = kthToLast(head.next,k) + 1;

        if(index == k) {

            list1.add(head);
        }

        return index;


    }

    public static void main(String[] args){

        KthToLast kth_value = new KthToLast();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        System.out.println(kth_value.kthToLast(head,1));



    }
}
