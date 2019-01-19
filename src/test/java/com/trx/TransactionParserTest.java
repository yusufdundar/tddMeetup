package com.trx;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransactionParserTest {

    @Test
    public void should_parse_csv_format() {
        TransactionParser parser = new TransactionParser();
        Transaction trx = parser.parse("John,Doe,john@doe.com,30,TR000");

        Assertions.assertEquals("John", trx.getFirstName());
        Assertions.assertEquals("Doe", trx.getSurname());
        Assertions.assertEquals("john@doe.com", trx.getMail());
        Assertions.assertEquals(30, trx.getAmount());
        Assertions.assertEquals("TR000", trx.getTransactionID());
    }

    @Test
    public void should_amount_bigger_than_zero() {
        TransactionParser parser = new TransactionParser();
        Transaction trx = parser.parse("John,Doe,john@doe.com,-30,TR000");
        int myAmount = trx.getAmount();

        boolean durum = trx.isEnough(myAmount);

        Assertions.assertFalse(durum);

    }
}
