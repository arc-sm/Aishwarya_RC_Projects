package com.example.algos;
import java.util.*;
public class EmployeeSort {
    public static void sort(java.util.List<Employee> list){
        list.sort(Comparator.comparingDouble((Employee e)->e.salary).reversed().thenComparing(e->e.name));
    }
}