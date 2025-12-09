package com.example.algos;
import java.util.*;
public final class Person {
    private final String name;
    private final java.util.List<String> tags;
    public Person(String name, java.util.List<String> tags){
        this.name = name;
        this.tags = tags == null ? java.util.Collections.emptyList() : java.util.Collections.unmodifiableList(new java.util.ArrayList<>(tags));
    }
    public String getName(){ return name; }
    public java.util.List<String> getTags(){ return tags; }
}