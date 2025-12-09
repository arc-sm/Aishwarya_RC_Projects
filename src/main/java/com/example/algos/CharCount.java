package com.example.algos;
import java.util.*;
public class CharCount {
    public static Map<Character,Integer> count(String s){
        Map<Character,Integer> m = new LinkedHashMap<>();
        if(s==null) return m;
        for(char c: s.toCharArray()) m.put(c, m.getOrDefault(c,0)+1);
        return m;
    }
}