package com.loic.projectfacebook.crackingcode.linkedlists;



public class DeleteMiddleNode {

    public ListNode deleteNode(ListNode head, int d) {


        ListNode node = head;
        ListNode dnode = new ListNode(d);

        if (head != null) {


                if (node.value == dnode.value) {

                    node.next = node.next.next;
                    return head;
                }
                node = node.next;

        }

        return head;
    }


}
