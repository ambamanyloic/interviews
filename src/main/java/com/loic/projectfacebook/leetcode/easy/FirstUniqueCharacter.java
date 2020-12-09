package com.loic.projectfacebook.leetcode.easy;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {

    char[] new_char = s.toCharArray();
    int index = -1;
    Map<Character,Integer> map = new HashMap<>();

    for(int i=0;i<s.length();i++) {

        if(map.containsKey(new_char[i])) {

            map.put(new_char[i],map.get(new_char[i])+1);
        } else {

            map.put(new_char[i],1);
        }
    }

        for (int i = 0; i <s.length() ; i++) {
            if(map.get(s.charAt(i))==1){
                index = i;
                break;
            }
        }

            return index;

    }

    public static void main(String[] args) {

        FirstUniqueCharacter uniq =new FirstUniqueCharacter();
        String s = "leetcode";
        System.out.println(uniq.firstUniqChar(s));

    }


}
