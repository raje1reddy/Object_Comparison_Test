package com.padmaja.objectcomparison;

import static org.junit.Assert.assertEquals;

class TestTest {

    @org.junit.jupiter.api.Test
    public void test() {
        BankAccount b1 = new BankAccount();
        b1.acctNumber = "0023490";
        b1.acctType = 5;
        BankAccount b2 = new BankAccount();
        b2.acctNumber = "11223344";
        b2.acctType = 3;
        BankAccount b3 = new BankAccount();
        b3.acctNumber = "11223344";
        b3.acctType = 3;
        boolean RESULT = (b1.equals(b2));
        System.out.println(RESULT);
        boolean expResult = false;
        assertEquals(expResult, RESULT);

        boolean Result2 = b2.equals(b3);
        System.out.println(b2.equals(b3));
        boolean expResults = true;
        assertEquals(expResults, Result2);

        boolean Result3 = b1.equals(new String("abc"));
        System.out.println(Result3);
        boolean expresult = false;
        assertEquals(expresult, Result3);;


    }
}