package com.example.algos;
public class KthLargest {
    public static int quickSelect(int[] a, int k){
        if(k<1 || k>a.length) throw new IllegalArgumentException("k out of range");
        return quick(a,0,a.length-1,k-1);
    }
    private static int quick(int[] a,int l,int r,int k){
        int p = partition(a,l,r);
        if(p==k) return a[p];
        else if(p>k) return quick(a,l,p-1,k);
        else return quick(a,p+1,r,k);
    }
    private static int partition(int[] a,int l,int r){
        int pivot = a[r], i=l;
        for(int j=l;j<r;j++){
            if(a[j] > pivot){ swap(a,i,j); i++; }
        }
        swap(a,i,r);
        return i;
    }
    private static void swap(int[] a,int i,int j){ int t=a[i]; a[i]=a[j]; a[j]=t; }
}