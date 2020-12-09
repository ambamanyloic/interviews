package com.loic.projectfacebook.crackingcode.trees;

public class SearchBSTNode {

    public TreeNode addNode(TreeNode node,int value) {

        if(node == null){
            return null;
        }

        TreeNode current = node;
        if(value < current.value) {
           current =  addNode(current.left,current.value);
        } else if(value > current.value) {
            current = addNode(current.right,value);
        }

        return current;

    }

    public boolean containsNode(TreeNode node,int value) {

        if(node == null) {
            return false;
        }

        TreeNode current = node;

        if(value == current.value) {
            return true;
        }

        if(value < current.value) {
            containsNode(current.left,value);
        } else {
            containsNode(current.right,value);
        }

        return false;

    }

    public TreeNode deleteNode(TreeNode node,int value){

        if(node == null) {
            return new TreeNode(value);
        }

        TreeNode current = node;
        if(value < current.value) {

            deleteNode(node.left,value);

        } else if( value > current.value){

            deleteNode(node.right,value);
        } else if( value == current.value) {

            if(node.left != null && node.right != null){

                TreeNode temp = node;
                TreeNode minNodeForRight = minimumElement(temp.right);

                node.value =  minNodeForRight.value;
                node.right =  deleteNode(node.right,minNodeForRight.value);


            }

            else if (node.left != null) {
                node = node.left;
            }
            // if nodeToBeDeleted has only right child
            else if (node.right != null) {
                node = node.right;
            }
            // if nodeToBeDeleted do not have child (Leaf node)
            else
                node = null;
        }

        return node;

    }

    public static TreeNode minimumElement(TreeNode root) {
        if (root.left == null)
            return root;
        else {
            return minimumElement(root.left);
        }
    }

}
