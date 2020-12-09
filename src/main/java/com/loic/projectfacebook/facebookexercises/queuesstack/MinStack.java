package com.loic.projectfacebook.facebookexercises.queuesstack;

import java.util.Stack;

public class MinStack extends Stack<Integer> {

    Stack<Integer> s2;
    public MinStack() { s2 = new Stack<Integer>();

    }

    public void push(int value){

        if(value <= min()) {
            s2.push(value);
        }

        super.push(value);

    }

    public Integer pop(){

        int value = super.pop();
        if(value == min()){
            s2.pop();
        }

        return value;
    }

    public int min(){
        if(s2.empty()){
            return Integer.MAX_VALUE;
        } else {
            return s2.peek();
        }
    }

    public static void main(String[] args) {


        MinStack minS = new MinStack();
        minS.push(5);
        minS.push(3);
        minS.push(7);
        minS.push(9);
        minS.push(2);
        minS.push(8);
        minS.push(1);
        minS.push(4);
        minS.push(7);
        minS.pop();
        minS.pop();
        minS.pop();


        System.out.println("---------"+ minS.min());
    }
}
