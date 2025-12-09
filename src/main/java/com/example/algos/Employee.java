package com.example.algos;
public class Employee {
    public final int id;
    public final String name;
    public final double salary;
    public Employee(int id, String name, double salary){ this.id=id; this.name=name; this.salary=salary; }
    public String toString(){ return id+":"+name+":"+salary; }
}