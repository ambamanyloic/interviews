package com.loic.projectfacebook.leetcode.easy;

import java.util.*;

public class BinaryTreePathII {


        public List<String> binaryTreePaths(TreeNode root) {

            List<String> arr_list = new ArrayList<>();
            TreeNode node = null;
            String s = "";

            if (root == null) {

                return arr_list;
            }

            if (node.left == null) {

                addToTree(node.right, s + "" + node.val);

            } else if (node.right == null) {

                addToTree(node.left, s + "" + node.val);

            }

            return arr_list;

        }

        public void addToTree(TreeNode node, String s) {

            addToTree(node.left, s + "" + node.val);
            addToTree(node.right, s + "" + node.val);

        }


        public static void main(String[] args) {

            BinaryTreePathII paths = new BinaryTreePathII();
            TreeNode node1 = new TreeNode(1);
            TreeNode node2 = new TreeNode(2);
            TreeNode node3 = new TreeNode(3);
            TreeNode node4 = new TreeNode(5);
            paths.binaryTreePaths(node1);
            paths.binaryTreePaths(node2);
            paths.binaryTreePaths(node3);
            System.out.println(paths.binaryTreePaths(node4));

        }

}
