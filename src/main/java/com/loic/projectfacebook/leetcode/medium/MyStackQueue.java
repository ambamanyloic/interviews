package com.loic.projectfacebook.leetcode.medium;

import java.util.Stack;

public class MyStackQueue {

    Stack<Integer> oldStack ;
    Stack<Integer> newStack ;

    public MyStackQueue () {

        oldStack = new Stack<>();
        newStack =  new Stack<>();
    }

    public int dequeue(Stack<Integer> stack) {

        return oldStack.pop();

    }

    public void enqueue(int value) {

        newStack.push(value);


    }
}
