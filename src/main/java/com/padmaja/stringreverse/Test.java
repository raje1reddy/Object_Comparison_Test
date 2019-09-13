package com.padmaja.stringreverse;
//import static java.lang.System.out;
import java.lang.String;

public class Test {
    public static void main(String[] args){
        BankAccount b1 = new BankAccount();
        b1.acctNumber = "0023490";
        b1.acctType = 5;
        BankAccount b2 = new BankAccount();
        b2.acctNumber = "11223344";
        b2.acctType = 3;
        BankAccount b3 = new BankAccount();
        b3.acctNumber = "11223344";
        b3.acctType = 3;
        System.out.println(b1.equals(b2));
        System.out.println(b2.equals(b3));
        System.out.println(b1.equals(new String("abc")));


    }

}




