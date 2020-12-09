package com.loic.projectfacebook.leetcode.easy;

public class SubtreeAnotherTree {

    TreeNode root1,root2;

    boolean areIdentical(TreeNode root1, TreeNode root2)
    {

        /* base cases */
        if (root1 == null && root2 == null)
            return true;

        if (root1 == null || root2 == null)
            return false;

        /* Check if the data of both roots is same and data of left and right
           subtrees are also same */
        return (root1.val == root2.val
                && areIdentical(root1.left, root2.left)
                && areIdentical(root1.right, root2.right));
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {


        if(s == null ) {
            return true;
        }

        if (t == null)
            return false;

        if (areIdentical(s, t))
            return true;

        //if((s.left.left == t.left) && s.left.right == t.right){
        return isSubtree(s.left, t)
                || isSubtree(s.right, t);

    }

    public static void main(String[] args) {

        SubtreeAnotherTree tree = new SubtreeAnotherTree();


        tree.root1 = new TreeNode(26);
        tree.root1.right = new TreeNode(3);
        tree.root1.right.right = new TreeNode(3);
        tree.root1.left = new TreeNode(10);
        tree.root1.left.left = new TreeNode(4);
        tree.root1.left.left.right = new TreeNode(30);
        tree.root1.left.right = new TreeNode(6);


        tree.root2 = new TreeNode(10);
        tree.root2.right = new TreeNode(6);
        tree.root2.left = new TreeNode(4);
        tree.root2.left.right = new TreeNode(30);

        System.out.println(tree.isSubtree(tree.root1,tree.root2));
    }
}
