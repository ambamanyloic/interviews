package com.loic.projectfacebook.facebookexercises.trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeSolution {

        TreeNode current =null;

    public void flatten(TreeNode root) {

        if(root == null) {

            return;
        } else {

            current = root;
        }

        getFlatten(root);
    }


    public int getFlatten(TreeNode root) {

            if(root == null) { }


                TreeNode left = root.left;
                TreeNode right = root.right;

                root.left = null;
                root.right = null;

            if(current != null) {

                current.right = root;
                current = root;
            }
                getFlatten(left);
                getFlatten(right);

                return current.val;


        }

        public static void main(String[] args) {

            TreeSolution slt = new TreeSolution();

            TreeNode left = new TreeNode(5);
            TreeNode right = new TreeNode(4);
            TreeNode tree = new TreeNode(2,left,right);
            System.out.println(slt.getFlatten(tree));
        }
}
