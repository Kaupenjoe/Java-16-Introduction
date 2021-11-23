package net.kaupenjoe;

import net.kaupenjoe.banking.Bank;
import net.kaupenjoe.banking.Person;

public class Main {
    public static void main(String[] args) {
        /* ASSIGNMENT 4 */

        /*
         * ASSIGNMENT 4:
         * Bank Management System:
         * Create a Bank Management System which has the following components:
         * Person (which saves first, middle and last name, age and maybe a "social security number")
         * Bank (which saves a List of customers and their Checking Accounts, maximum overdraw amount)
         * Checking Account (should have a current value, methods for taking and depositing money)
         * Opening a Checking Account should only work via a Bank and must require a certain amount of initial deposit.
         *
         *
         */

        Person nano = new Person("Nano", "Attack", 8);
        Person daniel = new Person("Daniel", "Smith", 24);
        Person marie = new Person("Marie", "Susan", "Jones", 28);

        Bank kb = new Bank("KaupenBank");
        kb.openBankAccount(nano, 200); // Not old Enough

        kb.openBankAccount(marie, 2000);
        kb.openBankAccount(daniel, 10); // Deposit is not enough

        System.out.println(kb.getAccountByPerson(marie).getBalance()); // 2000
        kb.withdrawAmount(3000, marie); // Cannot withdraw over the limit!
    }
}
