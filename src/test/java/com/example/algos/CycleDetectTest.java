package com.example.algos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CycleDetectTest {
    @Test void detect(){
        CycleDetect.Node a=new CycleDetect.Node(1), b=new CycleDetect.Node(2), c=new CycleDetect.Node(3);
        a.next=b; b.next=c; c.next=b;
        assertTrue(CycleDetect.hasCycle(a));
    }
}