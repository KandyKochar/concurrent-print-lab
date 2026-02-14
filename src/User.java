package Lab4;

import java.util.concurrent.ExecutorService;

public class User implements Runnable {

    private String name;
    private Printer printer;
    private ExecutorService printExecutor;

    public User(String name, Printer printer, ExecutorService printExecutor) {
        this.name = name;
        this.printer = printer;
        this.printExecutor = printExecutor;
    }

    @Override
    public void run() {

        // each user submits multiple print jobs
        for (int i = 1; i <= 3; i++) {

            // RANDOM duration
            int duration = (int)(Math.random() * 3000) + 500;

            PrintJob job = new PrintJob(name + " :Job" + i, duration);

            printExecutor.execute(printer.createTask(job));
        }
    }
}
