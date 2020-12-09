package com.loic.projectfacebook.leetcode.medium;

public class LargestBSTSubtree {
    public int largestBSTSubtree(TreeNode root) {

        int count = 0;

        if(root != null) {

            if(IsMinimalBST(root,Integer.MIN_VALUE,root.left.val)) {

                count++;
            } else if(IsMinimalBST(root,root.right.val,Integer.MAX_VALUE));

            count++;


        }
        return count;

    }

    public boolean IsMinimalBST(TreeNode root,int min,int max) {

        int count = 0;

        if (root == null)
            return true;

        try {


            if ((root.val < root.left.val) || (root.val > root.right.val)) {


                return false;
            }


            if (!IsMinimalBST(root.left, min, root.val) && !IsMinimalBST(root.right, root.val, max)) {


                count+=2;
                return false;
            }

        }catch (NullPointerException ex) {
            ex.printStackTrace();
        }

        return true;

    }

}
