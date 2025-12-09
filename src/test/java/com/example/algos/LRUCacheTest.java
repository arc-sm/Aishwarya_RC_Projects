package com.example.algos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LRUCacheTest {
    @Test void eviction(){
        LRUCache<Integer,String> c = new LRUCache<>(2);
        c.put(1,"one"); c.put(2,"two"); c.get(1); c.put(3,"three");
        assertTrue(c.containsKey(1));
        assertTrue(c.containsKey(3));
        assertFalse(c.containsKey(2));
    }
}