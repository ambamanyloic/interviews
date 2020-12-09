package com.loic.projectfacebook.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KthSmallestElementBST {

    public TreeNode kthSmallest(TreeNode root, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        TreeNode current = root;
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        while(root != null) {

            current = current.left;
            current = kthSmallest(current.left,k);
            count++;

            if (count == k)
                return root;

            if (current.left == null) {


                current = kthSmallest(current.right,k);
            }
        }

        return current;


    }

}
