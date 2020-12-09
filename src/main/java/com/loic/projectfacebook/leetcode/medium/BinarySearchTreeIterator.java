package com.loic.projectfacebook.leetcode.medium;

import java.util.Stack;

public class BinarySearchTreeIterator {

    int min = 0;
    Stack<TreeNode> stack = new Stack<>();


    public BinarySearchTreeIterator(TreeNode root) {



    }

    /** @return the next smallest number */
    public int next() {

        TreeNode root = null;

        if (root.left != null) {

            min = root.left.val;
            stack.push(root.left);
        }


        return min;


    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {

        if(stack.empty()){
            return false;
        }return true;

    }

    public void pushToLeft(TreeNode node){
        if (node != null){
            stack.push(node);
            pushToLeft(node.left);
        }
    }

    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(2);

        BinarySearchTreeIterator tree = new BinarySearchTreeIterator(node1);

        if(tree.hasNext()) {

            System.out.println(tree.next());
        }
    }
}
