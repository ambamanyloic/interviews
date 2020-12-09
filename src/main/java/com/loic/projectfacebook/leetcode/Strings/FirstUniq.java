package com.loic.projectfacebook.leetcode.Strings;

import java.util.*;

import java.io.FileNotFoundException;

public class FirstUniq {

    public int firstUniqChar(String s) {

        char[] uniq = s.toCharArray();
        int new_i = 0 ;
        Map<Character,Integer> uniqMap = new HashMap<>();
        int result = Integer.MAX_VALUE, j;

        for(int i=0;i<uniq.length;i++){

            if(uniqMap.containsKey(uniq[i])) {

            uniqMap.put(uniq[i],uniqMap.get(uniq[i])+1);

            } else {

                uniqMap.put(uniq[i],1);
            }


            if(uniqMap.get(uniq[i]) == 1 && result > uniqMap.get(uniq[i]))

                new_i = uniqMap.get(uniq[i]);


        }

        return new_i;

    }

    public static void main(String[] args) {

        FirstUniq first_uniq = new FirstUniq();
        System.out.println(first_uniq.firstUniqChar("lvolv"));
    }
}
