package com.zuizui.model;

public class Account {
    // 空的Account类
    private String accountId;
    private double balance;
    public Account(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount <= 0){
            System.out.println("输入金额有误");
            return;
        }
        balance += amount;
    }
    public void withdraw(double amount) {
        if(amount <= 0){
            System.out.println("输入金额有误");
            return;
        }
        if(amount > balance){
            System.out.println("余额不足");
            return;
        }
        this.balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
}