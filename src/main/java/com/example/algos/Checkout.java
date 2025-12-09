package com.example.algos;
public class Checkout {
    private Payment strategy;
    public Checkout(Payment p){ this.strategy = p; }
    public void setStrategy(Payment p){ this.strategy = p;}
    public void doPay(int amt){ strategy.pay(amt); }
}