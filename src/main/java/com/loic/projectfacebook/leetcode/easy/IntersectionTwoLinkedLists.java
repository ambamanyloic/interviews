package com.loic.projectfacebook.leetcode.easy;

public class IntersectionTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {


        ListNode n = headA;
        ListNode s = headB;

        if(headA == null && headB == null) {

            return null;
        }

        while(n != null && s != null ) {

            if(n.val == s.val) {

                return n;

            }

            n = n.next;
            s = s.next;
        }

        return n;

    }
}
