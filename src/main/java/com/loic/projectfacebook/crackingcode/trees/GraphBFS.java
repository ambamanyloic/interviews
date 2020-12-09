package com.loic.projectfacebook.crackingcode.trees;

import java.util.*;


public class GraphBFS {

    static class Node {
        int val;
        List<Node> children; // Edges in the graph to other vertices

        public Node() {
            children = new ArrayList<>();
        }
    }

    public boolean isBFS(Node startNode,Node endNode) {

        if(startNode == null && endNode == null){

        }

        Queue<Node> queue = new LinkedList<>();
        HashSet<Node> visited = new HashSet<Node>();
        queue.add(startNode);


        while(!queue.isEmpty()) {

            Node current = queue.remove();

            if(current.val == endNode.val ) {

                return true;
            }

                for(int i=0;i<current.children.size();i++){

                    Node neighbours = current.children.get(i);

                    if(!visited.contains(neighbours.children.get(i)))    {

                        queue.add(neighbours.children.get(i));
                    }

                }

                visited.add(current);

        }

        return false;

    }


}
