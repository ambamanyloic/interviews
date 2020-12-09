package com.loic.projectfacebook.crackingcode.trees;

import com.loic.projectfacebook.leetcode.medium.InorderSuccessorBST;

import java.util.Stack;

public class InOrderDFSNoRecursion {

    public int traverseInOrder(TreeNode root){

        Stack<TreeNode> stack = new Stack<>();

        if(root != null) {

            TreeNode current = root;
            stack.push(root);

            while(!stack.isEmpty()) {


                while(current.left != null) {

                    current = current.left;
                    stack.push(current.left);
                }
                current = stack.pop();
                visit(current); // visit function implementation

                if(current.right != null) {

                    current = current.right;
                    stack.push(current.right);

                }
            }


        }

        return root.value;

    }

    public int visit(TreeNode node){

        int  new_value = 0;


        if(node != null) {

           new_value = node.value;
        }

        return  new_value;
    }


    public static void main(String [] args) {

        InOrderDFSNoRecursion order = new InOrderDFSNoRecursion();
        TreeNode node = new TreeNode(3);
        System.out.println(order.traverseInOrder(node));
    }

}
