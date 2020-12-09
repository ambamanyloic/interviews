package com.loic.projectfacebook.facebookexercises.treesgraphs;
import java.util.*;

class NodeTree
{
    int data;
    NodeTree left, right;
    boolean visited;
    boolean marked;
    List<NodeTree> neighbours;

    public List<NodeTree> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<NodeTree> neighbours) {
        this.neighbours = neighbours;
    }

    public NodeTree(int item)
    {
        data = item;
        left = right = null;
    }

    public void addneighbours(NodeTree neighbourNode)
    {
        this.neighbours.add(neighbourNode);
    }
}
