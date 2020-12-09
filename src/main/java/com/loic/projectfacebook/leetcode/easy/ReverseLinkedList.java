package com.loic.projectfacebook.leetcode.easy;

import java.util.Stack;

public class ReverseLinkedList {

    static ListNode head;

        void printList(ListNode node) {
            while (node != null) {
                System.out.print(node.val + " ");
                node = node.next;
            }
        }

        public ListNode reverseList(ListNode head) {

            ListNode reversedPart = null;
            ListNode current = head;
            while (current != null) {
                ListNode next = current.next;
                current.next = reversedPart;
                reversedPart = current;
                current = next;
            }
            head = reversedPart;

            return head;

        }

    public static void main(String[] args)
    {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new ListNode(85);
        list.head.next = new ListNode(15);
        list.head.next.next = new ListNode(4);
        list.head.next.next.next = new ListNode(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverseList(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }

}
