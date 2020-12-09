package com.loic.projectfacebook.leetcode.easy;

public class SymmetricTree {

    TreeNode root1;

    public boolean isMirror(TreeNode p,TreeNode q){

        if(p==null && q==null)return true;
        if(p==null || q==null)return false;

        return (p.val == q.val)
                && isMirror(p.right,q.left)
                && isMirror(p.left,q.right);
    }

    public boolean isSymmetric(TreeNode root) {

        if(root == null) {
            return false;
        }

        return isMirror(root,root);


    }

    public static void main(String[] args) {

        SymmetricTree tree = new SymmetricTree();

        tree.root1 = new TreeNode(1);
        tree.root1.right = new TreeNode(2);
        tree.root1.left = new TreeNode(2);
        tree.root1.right.right = new TreeNode(3);
        tree.root1.left.left = new TreeNode(3);
        tree.root1.left.right = new TreeNode(4);
        tree.root1.right.left = new TreeNode(4);

        System.out.println(tree.isSymmetric(tree.root1));



    }
}
