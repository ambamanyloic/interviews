package com.loic.projectfacebook.facebookexercises.treesgraphs;

import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    public  void dfsUsingStack(NodeTree node)
    {
        Stack<NodeTree> stack=new  Stack<NodeTree>();
        stack.add(node);
        while (!stack.isEmpty())
        {
            NodeTree element=stack.pop();
            if(!element.visited)
            {
                System.out.print(element.data + " ");
                element.visited=true;
            }

            List<NodeTree> neighbours=element.getNeighbours();
            for (int i = 0; i < neighbours.size(); i++) {
                NodeTree n=neighbours.get(i);
                if(n!=null && !n.visited)
                {
                    stack.add(n);
                }
            }
        }
    }



    public static void main(String arg[]) {

        NodeTree node40 = new NodeTree(40);
        NodeTree node10 = new NodeTree(10);
        NodeTree node20 = new NodeTree(20);
        NodeTree node30 = new NodeTree(30);
        NodeTree node60 = new NodeTree(60);
        NodeTree node50 = new NodeTree(50);
        NodeTree node70 = new NodeTree(70);

        node40.addneighbours(node10);
        node40.addneighbours(node20);
        node10.addneighbours(node30);
        node20.addneighbours(node10);
        node20.addneighbours(node30);
        node20.addneighbours(node60);
        node20.addneighbours(node50);
        node30.addneighbours(node60);
        node60.addneighbours(node70);
        node50.addneighbours(node70);
    }
}
