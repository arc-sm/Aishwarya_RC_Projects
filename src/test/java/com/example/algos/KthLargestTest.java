package com.example.algos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class KthLargestTest {
    @Test void kth(){
        int[] a={3,2,1,5,6,4};
        assertEquals(5, KthLargest.quickSelect(a,2));
    }
}