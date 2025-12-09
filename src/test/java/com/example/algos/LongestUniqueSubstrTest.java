package com.example.algos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LongestUniqueSubstrTest {
    @Test void basic(){ assertEquals(3, LongestUniqueSubstr.length("abcabcbb")); }
}