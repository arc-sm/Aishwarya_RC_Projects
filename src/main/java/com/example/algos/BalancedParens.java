package com.example.algos;
import java.util.*;
public class BalancedParens {
    public static boolean isValid(String s){
        Map<Character,Character> m = new HashMap<>();
        m.put(')','('); m.put(']','['); m.put('}','{');
        Deque<Character> st = new ArrayDeque<>();
        for(char c: s.toCharArray()){
            if(m.containsKey(c)){
                if(st.isEmpty() || st.pop()!=m.get(c)) return false;
            } else st.push(c);
        }
        return st.isEmpty();
    }
}