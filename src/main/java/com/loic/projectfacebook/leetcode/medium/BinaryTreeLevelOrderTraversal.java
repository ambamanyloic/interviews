package com.loic.projectfacebook.leetcode.medium;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {

    public boolean isVisited(TreeNode root) {

        Map<TreeNode,TreeNode> mapNode = new HashMap<>();

        while (root != null) {

            if(mapNode.containsKey(root)) {

                return true;
            }
        }

        return false;
    }

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue = null;
        ArrayList<Integer> list_nodes = new ArrayList();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();


        while(root != null) {

            if(isVisited(root)) {

                queue.add(root);
            }

            if(!isVisited(root.left)) {

                queue.add(root.left);
                isVisited(root.left);
                list_nodes.add(root.left.val);

            } else if (!isVisited(root.right)) {

                queue.add(root.right);
                list_nodes.add(root.right.val);

            }

            list.add(list_nodes);

        }

        return list;

    }



}
