package com.github.mescalantea;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try {


            // Using constructor
            BankAccount bankAccount = new BankAccount(1, "John Doe", "Business", 1000.0, 0.1, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2029"));


            // Same example using Builder Pattern
            BankAccountBuilder builder = new BankAccountBuilder();

            BankAccount bankAccount1 = builder
                    .setOwner("John Doe")
                    .setAccountNumber(10000)
                    .setExpirationDate(new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2029"))
                    .build();

            BankAccount bankAccount2 = builder.setType("Personal").setAccountNumber(1).build();



            System.out.println("");

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}


