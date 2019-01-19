package com.trx;

public class Transaction {
    String firstName;
    String surName;
    String mail;
    int amount;
    String trxId;



    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surName;
    }

    public String getMail() {
        return mail;
    }

    public int getAmount() {
        return amount;
    }

    public String getTransactionID() {
        return trxId;
    }

    public boolean isEnough(int myAmount) {

        if (myAmount<0)
        {
            return false;
        }
        else {
            return true;
        }
    }
}
