package com.loic.projectfacebook.crackingcode.trees;


public class BinaryTree {

    TreeNode root;

    public TreeNode insert(TreeNode node, int data) {

        if (node == null) {
            return (new TreeNode(data));
        }

        TreeNode current = node;

        while (current != null) {


            if (data <= current.value) {

                insert(node.left, data);

            } else {
                insert(current.right, data);
            }
        }

        return current;
    }

    int minValue(TreeNode node) {
        TreeNode current = node;

        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return (current.value);
    }

    public TreeNode findValue(TreeNode node,int data) {

        TreeNode current = node;

        while(current != null) {

            if(data == current.value) {
                return current;
            }

            if(data <= current.value) {
                return findValue(current.left,data);
            } else {
                return findValue(current.right,data);
            }
        }

        return current;
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        TreeNode root = null;
        root = tree.insert(root, 4);
        tree.insert(root, 2);
        tree.insert(root, 1);
        tree.insert(root, 3);
        tree.insert(root, 6);
        tree.insert(root, 5);
        System.out.println("Minimum value of BST is " + tree.minValue(root));

    }
}
