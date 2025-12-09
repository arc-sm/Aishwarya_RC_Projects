package com.example.algos;
import java.util.*;
public class Permutations {
    public static List<String> permute(String s){
        List<String> res = new ArrayList<>();
        permute(s.toCharArray(),0,res);
        return res;
    }
    private static void permute(char[] arr, int l, List<String> res){
        if(l==arr.length-1){ res.add(new String(arr)); return; }
        for(int i=l;i<arr.length;i++){
            swap(arr,l,i);
            permute(arr,l+1,res);
            swap(arr,l,i);
        }
    }
    private static void swap(char[] a,int i,int j){ char t=a[i]; a[i]=a[j]; a[j]=t; }
}