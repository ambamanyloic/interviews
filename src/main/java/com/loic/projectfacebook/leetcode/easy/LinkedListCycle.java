package com.loic.projectfacebook.leetcode.easy;

import java.util.HashSet;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();

        while(head != null) {


            if (set.contains(head)) {

                return true;

            } else {

                set.add(head);
            }

            head = head.next;

        }

        return false;

    }

    public static void main(String[] args) {

        LinkedListCycle cycle = new LinkedListCycle();

        ListNode node = new ListNode(20);
        ListNode node1 = new ListNode(4);

        System.out.println(cycle.hasCycle(node));

    }
}
