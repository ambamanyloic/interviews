package com.loic.projectfacebook.crackingcode.linkedlists;


import java.util.LinkedList;

public class IntersectLinkedLists {

    public boolean IsIntersectLL(LinkedList<ListNode> list1, LinkedList<ListNode> list2) {

        ListNode head = null;

        while (head != null) {

            ListNode node = head.next;

            if (node.value == node.ptr.value) {

                node = node.ptr;
                list1.add(node);
                break;
            } else {

                node = node.next;
            }

            for (int i = 0; i < list2.size(); i++) {


                if ((list2.get(i)) == node.ptr) {

                    return true;
                }

            }
        }

        return false;
    }
}


