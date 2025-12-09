package com.example.algos;
public class MergeWithoutExtra {
    public static void merge(int[] a, int[] b){
        int n=a.length, m=b.length;
        int gap = (n+m+1)/2;
        while(gap>0){
            int i=0,j=i+gap;
            while(j < n+m){
                int vi = (i<n)?a[i]:b[i-n];
                int vj = (j<n)?a[j]:b[j-n];
                if(vi>vj){
                    if(i<n && j<n) { int t = a[i]; a[i]=a[j]; a[j]=t; }
                    else if(i<n) { int t = a[i]; a[i]=b[j-n]; b[j-n]=t; }
                    else { int t = b[i-n]; b[i-n]=b[j-n]; b[j-n]=t; }
                }
                i++; j++;
            }
            if(gap==1) gap=0; else gap=(gap+1)/2;
        }
    }
}