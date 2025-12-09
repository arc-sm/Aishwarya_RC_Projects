package com.example.algos;
public class CycleDetect {
    public static class Node { public int val; public Node next; public Node(int v){val=v;} }
    public static boolean hasCycle(Node head){
        Node slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next; fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}