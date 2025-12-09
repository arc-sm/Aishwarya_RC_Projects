package com.example.algos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BalancedParensTest {
    @Test void valid(){ assertTrue(BalancedParens.isValid("{[()]}") ); }
    @Test void invalid(){ assertFalse(BalancedParens.isValid("{[(])}") ); }
}