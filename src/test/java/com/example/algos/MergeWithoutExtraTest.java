package com.example.algos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
public class MergeWithoutExtraTest {
    @Test void merge(){
        int[] a={1,3,5,7}; int[] b={2,4,6,8};
        MergeWithoutExtra.merge(a,b);
        assertArrayEquals(new int[]{1,2,3,4}, a);
        assertArrayEquals(new int[]{5,6,7,8}, b);
    }
}