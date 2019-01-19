package com.trx;


import org.junit.Assert;
import org.junit.Test;

public class TransactionParserTest {

    @Test
    public void should_parse_csv_format() {
        TransactionParser parser = new TransactionParser();
        Transaction trx = parser.parse("John,Doe,john@doe.com,30,TR000");

        Assert.assertEquals("John", trx.getFirstName());
        Assert.assertEquals("Doe", trx.getSurname());
        Assert.assertEquals("john@doe.com", trx.getMail());
        Assert.assertEquals(30, trx.getAmount());
        Assert.assertEquals("TR000", trx.getTransactionID());
    }

    @Test
    public void should_amount_bigger_than_zero() {
        TransactionParser parser = new TransactionParser();
        Transaction trx = parser.parse("John,Doe,john@doe.com,-30,TR000");
        int myAmount = trx.getAmount();

        boolean durum = trx.isEnough(myAmount);

        Assert.assertFalse(durum);

    }
}
