package com.padmaja.stringreverse;
import java.lang.String;

public class BankAccount {
        String acctNumber;
        int acctType;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof BankAccount) {
            BankAccount b = (BankAccount) obj;
            return (acctNumber.equals(b.acctNumber) && acctType == b.acctType);
        }
        else
        return false;
    }
}



