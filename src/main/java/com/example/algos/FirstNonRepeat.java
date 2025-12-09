package com.example.algos;
import java.util.*;
public class FirstNonRepeat {
    public static Character first(String s){
        Map<Character,Integer> cnt = new LinkedHashMap<>();
        if(s==null) return null;
        for(char c: s.toCharArray()) cnt.put(c, cnt.getOrDefault(c,0)+1);
        for(Map.Entry<Character,Integer> e: cnt.entrySet()) if(e.getValue()==1) return e.getKey();
        return null;
    }
}