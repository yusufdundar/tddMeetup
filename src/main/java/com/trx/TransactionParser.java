package com.trx;

import java.util.List;

public class TransactionParser {


    public Transaction parse(String s) {

       //"John,Doe,john@doe.com,30,TR000"
       String[] icindekiler =  s.split(",");
     Transaction trx = new Transaction();
     trx.firstName = icindekiler[0];
     trx.surName = icindekiler[1];
     trx.mail = icindekiler[2];
     trx.amount = Integer.parseInt(icindekiler[3]);
     trx.trxId = icindekiler[4];



        return trx;
    }
}
