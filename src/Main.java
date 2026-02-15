package Lab4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer();

        // users run concurrently
        ExecutorService userExecutor = Executors.newFixedThreadPool(3);

        // printer runs jobs in submission order
        ExecutorService printExecutor = Executors.newSingleThreadExecutor();

        userExecutor.execute(new User("User A", printer, printExecutor));
        userExecutor.execute(new User("User B", printer, printExecutor));
        userExecutor.execute(new User("User C", printer, printExecutor));

        userExecutor.shutdown();

        // wait until users finish submitting jobs
        while (!userExecutor.isTerminated()) {
        }

        printExecutor.shutdown();
        
        // wait until all printing is finished
        while (!printExecutor.isTerminated()) {
        }

        System.out.println("\nAll print jobs have been completed successfully.");
    
    }
}
