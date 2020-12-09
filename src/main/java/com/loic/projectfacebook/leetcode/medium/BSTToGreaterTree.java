package com.loic.projectfacebook.leetcode.medium;

import java.util.ArrayList;

public class BSTToGreaterTree {


    public TreeNode convertBST(TreeNode root,int sum_ptr) {

        TreeNode right = null;
        TreeNode left;
        int sum = 0;
        ArrayList<TreeNode> list = new ArrayList<>();


        if(root != null) {

            sum_ptr = right.val + sum_ptr;

                right = convertBST(root.right,sum);
                left = convertBST(root.left,sum);


        }

       return right;
    }


}
