package com.loic.projectfacebook.leetcode.easy;

public class ClosestBinarySearchTree {

    double minVal = Double.MAX_VALUE;
    TreeNode minNode;

    public double closestValue(TreeNode root, double target) {

        if (root == null) {
            return -1;
        }
        minVal = findClosest(root,target);
        return minVal;


    }

    private double findClosest(TreeNode node , double target){


            if (node == null) return -1;

            double difference = Math.abs(node.val - target);

            if (difference < minVal) {
                minVal = difference;
                minNode = node;
            }

        minVal = findClosest(node.left,  node.val );
        minVal = findClosest(node.right,node.val );

        return minVal;
    }

}
