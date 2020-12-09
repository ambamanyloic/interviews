package com.loic.projectfacebook.leetcode.medium;

import java.util.*;

public class GroupAnagramsII {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> list = new ArrayList<>();
        List<String> arrList = new ArrayList<>();

        for(String str  : strs) {



                char[] char_array = str.toCharArray();



                //arrList.add(char_array[]+"");



            list.add(arrList);



        }


        return list;


    }

    public static void main(String[] args) {

        GroupAnagramsII anagram = new GroupAnagramsII();
        String []  str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(anagram.groupAnagrams(str));
    }
}
