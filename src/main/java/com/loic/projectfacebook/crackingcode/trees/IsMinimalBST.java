package com.loic.projectfacebook.crackingcode.trees;



public class IsMinimalBST {

    TreeNode root;

    public boolean IsMinimalBST() {


        return IsMinimalBST(root,Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public boolean IsMinimalBST(TreeNode root,int min,int max) {

        if (root == null)
            return true;

        try {


            if ((root.value < root.left.value) || (root.value > root.right.value)) {


                return false;
            }


            if (!IsMinimalBST(root.left, min, root.value) && !IsMinimalBST(root.right, root.value, max)) {

                return false;
            }

        }catch (NullPointerException ex) {
            ex.printStackTrace();
        }

        return true;

    }


    public static void main(String args[])
    {
        IsMinimalBST tree = new IsMinimalBST();
        tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(4);

        if (tree.IsMinimalBST())
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }
}
