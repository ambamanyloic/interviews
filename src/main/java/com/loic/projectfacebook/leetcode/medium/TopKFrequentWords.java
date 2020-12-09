package com.loic.projectfacebook.leetcode.medium;

import java.util.*;

public class TopKFrequentWords {


    /*public List<String> topKFrequent(int[] words, int k) {

        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        PriorityQueue queue = new PriorityQueue();
        int max = Integer.MIN_VALUE;
        int count = 0;
        List<String> arr_list = new ArrayList<>();

            for (int i = 0; i < words.length; i++) {

                if (map.containsKey(words[i])) {

                    map.put(words[i], map.get(words[i] + 1));
                    count = Math.max(count, map.get(words[i]));
                } else {

                    map.put(words[i], 1);
                }

                for(Integer key : map.keySet()) {

                    int freq = map.get(key);
                    queue.add(map.get(key);

            }

            }

        return arr_list;

    }

    public static void main(String[] args) {


        TopKFrequentWords freq = new TopKFrequentWords();
        String[] arr = {"i", "love", "leetcode", "i", "love", "coding"};
        System.out.println(freq.topKFrequent(arr,2));



    }*/
}
