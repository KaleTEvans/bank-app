import java.util.Scanner;

public class Account {
    // class variables
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    // class constructor
    Account(String cname, String cid) {
        customerName = cname;
        customerID = cid;
    }

    // function for depositing money
    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    // function for withdrawing money
    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    
}