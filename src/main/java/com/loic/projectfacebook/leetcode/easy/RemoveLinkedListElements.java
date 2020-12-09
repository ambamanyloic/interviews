package com.loic.projectfacebook.leetcode.easy;

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {

        //ListNode node = new ListNode(val);

        if(head == null) {
            return null;
        }

        ListNode temp = new ListNode(val);

        while (temp != null && temp.next != null) {

            if (temp.next.val == temp.val) {

                temp.next = temp.next.next;

            } else {
                temp = temp.next;
            }
        }

        return head;

    }

    public static void main(String[] args){

        RemoveLinkedListElements rem = new RemoveLinkedListElements();
        ListNode node = new ListNode(8);
        //System.out.println(rem.removeElements(node));



    }
}
