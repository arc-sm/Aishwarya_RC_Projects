package com.example.algos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ReverseWordsTest {
    @Test void basic(){ assertEquals("awesome is Java", ReverseWords.reverseWords("Java is awesome")); }
    @Test void leadingTrailing(){ assertEquals("hello world", ReverseWords.reverseWords("  hello   world  ")); }
}