package com.loic.projectfacebook.crackingcode.trees;

public class searchBST {

    public TreeNode searchBST(int[] array) {

        return searchBST(array, 0, array.length - 1);
    }


        TreeNode searchBST(int[] array,int start,int end){

        while( end < start) {
            return null;
        }

        int middle = (start + end) /2;

        TreeNode root = new TreeNode(array[middle]);

        root.left = searchBST(array,start,middle-1);
        root.right = searchBST(array,middle +1 ,end);

        return root;
    }

    public static void main(String[] args){

        int [] array = {1,3,4,6,7,8,9};
        searchBST tree = new searchBST();
        System.out.println(tree.searchBST(array));
    }
}
