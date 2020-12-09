package com.loic.projectfacebook.leetcode.medium;

public class StringCompression {
    public String compress(char[] chars) {

        StringBuffer bf = new StringBuffer();
        int size = chars.length;

        for(int i =0;i<chars.length;i++) {

            if(size ==1) {

                bf.append(""+chars[i]);
            } else {

                bf.append(""+chars[i] + size);
            }


        }
        return bf.toString();

    }

    public static void main(String [] args){

        StringCompression compress =  new StringCompression();
        char[] new_char = {'a','a'};

        System.out.println(compress.compress(new_char));

    }
}
