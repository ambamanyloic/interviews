package com.loic.projectfacebook.leetcode.medium;
import java.util.*;


public class AddTwoNumbers {
    public List addTwoNumbers(ListNode l1, ListNode l2) {

        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        ArrayList<Integer> list_arr = new ArrayList<>();

        while (l1.next != null) {

            stack1.push(l1.next.val);
        }



        while(!stack1.isEmpty()) {

            list_arr.add((Integer)stack1.pop());
        }

        return list_arr;

    }

    public static void main(String[] args){

        AddTwoNumbers numbers = new AddTwoNumbers();
        ListNode l1 = new ListNode(3);
        ListNode l3 = new ListNode(7);
        ListNode l2 = new ListNode(6,l1);
        System.out.println(numbers.addTwoNumbers(l2,l3));
    }
}
