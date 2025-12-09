package com.example.algos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FirstNonRepeatTest {
    @Test void basic(){ assertEquals(Character.valueOf('c'), FirstNonRepeat.first("aabbcddee")); }
}