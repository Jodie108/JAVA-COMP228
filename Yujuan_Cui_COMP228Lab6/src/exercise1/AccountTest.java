package exercise1;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1000.00);

        ArrayList<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(account, 200, true));
        transactions.add(new Transaction(account, 150, false));
        transactions.add(new Transaction(account, 300, true));
        transactions.add(new Transaction(account, 500, false));

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (Transaction transaction : transactions) {
            executorService.execute(transaction);
        }

        executorService.shutdown();
    }
}