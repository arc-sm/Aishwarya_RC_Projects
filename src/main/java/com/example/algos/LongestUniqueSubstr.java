package com.example.algos;
import java.util.*;
public class LongestUniqueSubstr {
    public static int length(String s){
        if(s==null) return 0;
        Map<Character,Integer> last = new HashMap<>();
        int start=0,max=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(last.containsKey(c)) start = Math.max(start, last.get(c)+1);
            last.put(c, i);
            max = Math.max(max, i-start+1);
        }
        return max;
    }
}