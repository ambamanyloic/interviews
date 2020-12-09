package com.loic.projectfacebook.leetcode.easy;

import java.util.Stack;

public class PalindromeLinkedList {


    boolean isPalindrome(ListNode head) {

        ListNode fast= head;
        ListNode slow= head;

        Stack<Integer> stack = new Stack<>();

        /* Push elements from first half of linked list onto stack. When fast runner * (which is moving at 2x speed) reaches the end of the linked list, then we * know we're at the middle*/ while (fast != null && fast.next != null) {

            stack.push(slow.val);

            slow = slow.next;

            fast = fast.next.next; }

        /* Has odd number of elements, so skip the middle element*/

        if (fast!= null) {

            slow= slow.next;

        }

        while (slow != null) {

            int top = stack.pop();

            /* If values are different, then it's not a palindrome*/

            if (top != slow.val) {

                return false;

            }

            slow = slow.next;

        } return true;

    }

    public static void main(String[] args) {

        PalindromeLinkedList pal = new PalindromeLinkedList();
        ListNode listN = new ListNode(5);
        ListNode listN1 = new ListNode(7);
        System.out.println(pal.isPalindrome(listN1));

    }
}
