package com.github.mescalantea;

import java.util.Date;

public class BankAccount {

    private long accountNumber;
    private String owner;
    private String type;
    private double balance;
    private double interestRate;
    private Date creationDate;
    private Date expirationDate;

    public BankAccount(long accountNumber, String owner, String type, double balance, double interestRate, Date creationDate, Date expirationDate) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.type = type;
        this.balance = balance;
        this.interestRate = interestRate;
        this.creationDate = creationDate;
        this.expirationDate = expirationDate;
    }

    public BankAccount(){}

    //Getters and setters omitted for brevity.


    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}