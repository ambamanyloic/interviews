package com.loic.projectfacebook.leetcode.medium;

public class FlattenBinaryTreeLinkedList {

    public TreeNode flatten(TreeNode root) {

        TreeNode node = null;

        if(root != null) {

            if(root.val > root.left.val) {

                node =  flatten(root.left);

            } else if (root.val < root.right.val) {

                node = flatten(root.right);
            }


        }

        return node;

    }
}
