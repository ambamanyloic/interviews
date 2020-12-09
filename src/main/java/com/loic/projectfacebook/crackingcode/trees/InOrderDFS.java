package com.loic.projectfacebook.crackingcode.trees;

public class InOrderDFS {

    public TreeNode traverseInOrder(TreeNode root){

        if(root != null) {

            traverseInOrder(root.left);
            visit(root.value);
            traverseInOrder(root.left);
        }

        return root;


    }

    public int visit(int value){

        TreeNode node = null;

        if(node != null) {

            value = node.value;

        }

        return value;
    }

    public static void main(String[] args) {

        InOrderDFS order = new InOrderDFS();
        TreeNode node = new TreeNode(5);
        System.out.println(order.traverseInOrder(node));

    }
}
