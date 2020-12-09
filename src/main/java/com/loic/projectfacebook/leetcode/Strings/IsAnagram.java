package com.loic.projectfacebook.leetcode.Strings;

import java.util.*;

public class IsAnagram {

    public boolean isAnagram(String s, String t) {

        if(!s.isEmpty() && !t.isEmpty()) {

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(t1);

            for (int i = 0; i < s1.length; i++) {
                if (s1[i] != t1[i])
                    return false;

        }


        }

        return true;


    }

    public static void main(String[] args){

        IsAnagram ian = new IsAnagram();
        System.out.println(ian.isAnagram("rat", "car"));
    }
}
