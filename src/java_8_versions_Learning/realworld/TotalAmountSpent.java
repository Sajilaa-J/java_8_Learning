package java_8_versions_Learning.realworld;

import java.util.*;
        import java.util.stream.*;

class Transaction {
    private int amount;

    public Transaction(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

public class TotalAmountSpent {
    public static void main(String[] args) {
        List<Transaction> trans = Arrays.asList(
                new Transaction(100),
                new Transaction(250),
                new Transaction(400),
                new Transaction(150)
        );


        int totalAmount = trans.stream()
                .mapToInt(Transaction::getAmount)
                .sum();

        System.out.println("Total Amount Spent: " + totalAmount);
    }
}
