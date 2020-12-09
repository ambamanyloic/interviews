package com.loic.projectfacebook.leetcode.easy;

public class RemoveDuplicatesSortedLinkedList {

    public ListNode deleteDuplicates(ListNode head) {

        while (head == null) {

            return null;
        }

        ListNode curr = head;


            while(curr != null && curr.next != null) {
                if (curr.val == curr.next.val) {

                curr.next = curr.next.next;

                } else {
                    curr = curr.next;
                }
        }

        return head;

    }

    static void printList(ListNode ptr)
    {
        while (ptr != null) {
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args)
    {

        RemoveDuplicatesSortedLinkedList removeNode =  new RemoveDuplicatesSortedLinkedList();
        ListNode n = null;
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);

        System.out.println("Given Linked List");

        printList(head);

        head =  removeNode.deleteDuplicates(head);

        System.out.println("Linked List after deletion of middle");
        printList(head);
    }
}
