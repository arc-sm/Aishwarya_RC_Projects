package com.example.algos;
import java.sql.Connection;
import java.util.concurrent.*;
public class SimpleConnectionPool {
    private final BlockingQueue<Connection> pool;
    public SimpleConnectionPool(int size) {
        pool = new ArrayBlockingQueue<>(size);
        for(int i=0;i<size;i++){
            pool.add(null); // placeholder for demo
        }
    }
    public Connection get() throws InterruptedException { return pool.take(); }
    public void release(Connection c){ pool.offer(c); }
}