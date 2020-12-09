package com.loic.projectfacebook.leetcode.Strings;
import java.util.*;


public class StringsMatching {
    public List<String> stringMatching(String[] words) {

        Arrays.sort(words, Comparator.comparingInt(String::length));
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            String str = words[i];
            int start = i + 1;
            while (start < words.length) {
                if (words[start].contains(str)) {
                    result.add(str);
                    break;
                }
                start++;
            }
        }
        return result;

    }

    public static void main(String[] args) {

        StringsMatching strMatch = new StringsMatching();
        String[] words = {"mass","as","hero","superhero"};
        System.out.println(strMatch.stringMatching(words));


    }

}
