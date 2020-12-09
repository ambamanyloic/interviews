package com.loic.projectfacebook.leetcode.easy;

public class ClosestValue {

    public int closestValue(TreeNode root, double target) {


        if(root == null) {
            return -1;
        }

        traverse(root,target);
        return minNode.val;

    }

    double minVal = Double.MAX_VALUE;
    TreeNode minNode;

    public double traverse(TreeNode node,double target){

        if(node == null){
            return 1.00;
        }

        double difference = Math.abs(minNode.val - target);

        if(difference < minVal) {

            minVal =difference;
            minNode = node;


        }

        traverse(node.left,target);
        traverse(node.right,target);

        return minVal;


    }

    public static void main(String[] args) {

        ClosestValue close = new ClosestValue();
        TreeNode tree = new TreeNode(4);


        System.out.println(close.traverse(tree,3.714286));


    }
}
