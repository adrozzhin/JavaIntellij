package com.syntax.class27.EncapsulatiomDemo1;

public class BankAccount {
    private String name;
    private double balance;
    private String userName;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 20) {
            System.out.println("Name is too long");
        } else if (name.replaceAll("[^A-Za-z]","").length()!=name.length()) {
            System.out.println("You can not use special characters amd numbers in name");
        } else {
            this.name = name;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
