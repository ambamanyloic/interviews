package com.loic.projectfacebook.facebookexercises.linkedlists;

import com.sun.scenario.effect.Merge;

public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        LinkedList list = new LinkedList();

        if (l1 == null) {
            list.addNode(l2.data);
            return l2;
            //return list;
        }
        if (l2 == null) {

            list.addNode(l1.data);

            //return list;
            return l1;
        }

        if (l2.data < l1.data) {

            ListNode returnNode = mergeTwoLists(l1, l2.next);
            //ListNode returnNode = mergeTwoLists(l1, l2.next);
            l2.next = returnNode;

            list.addNode(returnNode.data);

            return l1;
        } else {
            ListNode returnNode = mergeTwoLists(l1.next, l2);

            l1.next = returnNode;
            list.addNode(returnNode.data);

            return l1;

        }
    }

    public static void main(String[] args){

        ListNode li1 = new ListNode(8);
        ListNode li2 = new ListNode(2);

        MergeTwoLists mTwo = new MergeTwoLists();
        System.out.println(mTwo.mergeTwoLists(li1,li2));
    }
}
