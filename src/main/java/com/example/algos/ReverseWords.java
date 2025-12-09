package com.example.algos;
public class ReverseWords {
    public static String reverseWords(String s) {
        if(s==null) return null;
        StringBuilder res = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            if (i < 0) break;
            int j = i;
            while (i >= 0 && s.charAt(i) != ' ') i--;
            if (res.length() > 0) res.append(' ');
            res.append(s.substring(i + 1, j + 1));
        }
        return res.toString();
    }
}