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
    public static void main(String[] args){
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        n1.next=n2; n2.next=n3; n3.next=n1; // creates a cycle
        System.out.println(hasCycle(n1)); // should print true
    }
}