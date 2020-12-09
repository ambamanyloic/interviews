package com.loic.projectfacebook.leetcode.medium;

public class LowestCommonAncestor {


    public TreeNode lowestCA(TreeNode node,TreeNode left,TreeNode right) {

        if(left.val == node.val || right.val == node.val) {

            return node;
        }

        left = lowestCA(node.left,left,right);
        right = lowestCA(node.right,left,right);

        return left == null ? right : right == null ? left : node;

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode searchNode = null;

        if(root != null){


                searchNode = lowestCA(root,p,q);


        }

        return searchNode;

    }
}
