package com.loic.projectfacebook.facebookexercises.treesgraphs;

import java.util.LinkedList;
import java.util.Queue;


public class BreadthFirstSearch {

    Queue<NodeTree> queue= new LinkedList<>();
    //Queue queue = new Queue();


    private void breadthWiseTraversal(NodeTree root) {
        if(root==null){
            return;
        }
        NodeTree temp = root;
        queue.clear();
        ((LinkedList<NodeTree>) queue).add(temp);
        while(!queue.isEmpty()){
            NodeTree ref= queue.remove();
            System.out.print(ref.data+" ");
            if(ref.left!=null) {
                ((LinkedList<NodeTree>) queue).add(ref.left);
            }
            if(ref.right!=null) {
                ((LinkedList<NodeTree>) queue).add(ref.right);
            }
        }
    }


    public static void main(String[] args) {
        //The tree:
        //   1
        //  / \
        // 7   9
        // \  / \
        //  8 2 3

        NodeTree node1 = new NodeTree(1);
        NodeTree node7 = new NodeTree(7);
        NodeTree node9 = new NodeTree(9);
        NodeTree node8 = new NodeTree(8);
        NodeTree node2 = new NodeTree(2);
        NodeTree node3 = new NodeTree(3);
        node1.left = node7;
        node1.right = node9;
        node7.right = node8;
        node9.right = node3;
        node9.left = node2;
        System.out.println("DFS-----: ");

        BreadthFirstSearch bfs = new BreadthFirstSearch();

        System.out.println("\nBFS: ");
        bfs.breadthWiseTraversal(node1);

    }
}
