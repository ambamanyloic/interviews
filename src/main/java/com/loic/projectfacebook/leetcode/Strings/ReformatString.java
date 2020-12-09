package com.loic.projectfacebook.leetcode.Strings;

import java.util.ArrayList;

public class ReformatString {

    public String reformat(String s) {
        String str = "";
        StringBuffer buffer = new StringBuffer();

        ArrayList<String> arrList = new ArrayList<String>();

        for(int i=0;i<s.length();i++){



                if (s.substring(i).getClass() ==  s.substring(i+1).getClass()) {

                    buffer.append(i);
                }

        }

        return buffer.toString();

    }

    public static void main(String[] args) {

        ReformatString ref = new ReformatString();
        System.out.println(ref.reformat("a0b1c2"));
    }
}
