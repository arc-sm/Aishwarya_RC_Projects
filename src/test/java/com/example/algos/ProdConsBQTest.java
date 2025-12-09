package com.example.algos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.*;
public class ProdConsBQTest {
    @Test void produceConsume() throws Exception {
        BlockingQueue<Integer> q = new ArrayBlockingQueue<>(5);
        ProdConsBQ.produce(q, 5);
        assertEquals(5, q.size());
        ProdConsBQ.consume(q,5);
        assertEquals(0, q.size());
    }
}