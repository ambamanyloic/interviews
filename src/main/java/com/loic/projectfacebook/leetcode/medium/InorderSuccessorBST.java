package com.loic.projectfacebook.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class InorderSuccessorBST {

    int key ;

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {

     if(root != null) {
         return new TreeNode(key);
     }

     if(p.val < root.val) {

         root.left = inorderSuccessor(root.left,p);
     } else {

         root.right = inorderSuccessor(root.right,p);
     }

     return root;
    }
}
