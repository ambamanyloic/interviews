package com.loic.projectfacebook.leetcode.easy;


public class MinimumDepthBT {
    TreeNode root;
    int minDepth()
    {
        return minDepth(root);
    }

    public int minDepth(TreeNode root) {


        if(root == null) {

        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        if(root.left != null) {

            return minDepth(root.left) + 1;

            }
            else if(root.right != null) {

            return minDepth(root.right) + 1;

            }

        return 1+ Math.min(minDepth(root.right),minDepth(root.left));

        }

    public static void main(String args[])
    {
        MinimumDepthBT tree = new MinimumDepthBT();
        tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(9);
        tree.root.right = new TreeNode(20);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right = new TreeNode(7);

        System.out.println("The minimum depth of "+
                "binary tree is : " + tree.minDepth());
    }
}
