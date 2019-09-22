package com.github.mescalantea;

import java.util.Date;

public class BankAccountBuilder {

    private BankAccount bankAccount;

    public BankAccountBuilder() {
        bankAccount = new BankAccount();
    }

    public BankAccount build(){
        return bankAccount;
    }

    public BankAccountBuilder setAccountNumber(long accountNumber) {
        this.bankAccount.setAccountNumber(accountNumber);
        return this;
    }

    public BankAccountBuilder setOwner(String owner) {
        this.bankAccount.setOwner(owner);
        return this;
    }

    public BankAccountBuilder setType(String type) {
        this.bankAccount.setType(type);
        return this;
    }

    public BankAccountBuilder setBalance(double balance) {
        this.bankAccount.setBalance(balance);
        return this;
    }

    public BankAccountBuilder setInterestRate(double interestRate) {
        this.bankAccount.setInterestRate(interestRate);
        return this;
    }

    public BankAccountBuilder setCreationDate(Date creationDate) {
        this.bankAccount.setCreationDate(creationDate);
        return this;
    }

    public BankAccountBuilder setExpirationDate(Date expirationDate) {
        this.bankAccount.setExpirationDate(expirationDate);
        return this;
    }
}
