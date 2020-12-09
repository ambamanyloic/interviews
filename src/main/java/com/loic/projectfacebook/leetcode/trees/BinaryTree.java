package com.loic.projectfacebook.leetcode.trees;

public class BinaryTree {

    Node root ;

    /*public Node addRecursive(Node current,int value){

        if(current == null){
            return new Node(value);
        }

        if(value < current.value){
            return addRecursive(current.left,value);
        } else if(value > current.value) {
            return addRecursive(current.right,value);
        } else {
            return current;
        }
    }*/

    public Node printRecursive(Node current,int value){

        if(current == null){
            return new Node(value);
        }

        if(value < current.value){
            return printRecursive(current.left,value);
        } else if(value > current.value) {
            return printRecursive(current.right,value);
        } else {
            return current;
        }
    }

    /*public void add(int value) {
        root = addRecursive(root, value);
    }*/

    private boolean containsNodeRecursive(Node current, int value) {

        if(current == null) {
            return false;
        }

        if(value < current.value) {

            containsNodeRecursive(current.left,value);
            return true;
        } else if (value > current.value) {
            containsNodeRecursive(current.right,value);
        } else {
            current.value = value;
        }

        return true;
    }

    public Node deleteRecursive(Node current,int value){

        return current;

    }

}
