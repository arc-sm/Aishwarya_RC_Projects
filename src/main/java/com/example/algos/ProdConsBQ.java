package com.example.algos;
import java.util.concurrent.*;
public class ProdConsBQ {
    public static void produce(BlockingQueue<Integer> q, int max) throws InterruptedException {
        for(int i=1;i<=max;i++){ q.put(i); }
    }
    public static void consume(BlockingQueue<Integer> q, int max) throws InterruptedException {
        for(int i=1;i<=max;i++){ q.take(); }
    }
}