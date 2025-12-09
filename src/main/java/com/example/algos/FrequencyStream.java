package com.example.algos;
import java.util.*;
import java.util.stream.*;
public class FrequencyStream {
    public static Map<Integer, Long> freq(List<Integer> data){
        return data.stream().collect(Collectors.groupingBy(i->i, Collectors.counting()));
    }
}