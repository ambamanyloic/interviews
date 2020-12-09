package com.loic.projectfacebook.crackingcode.linkedlists;

import java.util.Stack;

public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {

        Stack<Integer> list = new Stack<>();

        while (head != null){

            list.push(head.value);
            head = head.next;

        }

        while(head != null) {
            int top = list.pop().intValue();

            if(top != head.value) {
                return false;
            }

            head = head.next;
        }

        return true;
    }

    public static void main(String[] args) {


        ListNode node = new ListNode(3);
        IsPalindrome pal = new IsPalindrome();

        System.out.println(pal.isPalindrome(node));
    }
}
