package Lab4;

public class Printer {

    // only one job prints at a time
    public synchronized void print(PrintJob job) {

        System.out.println("Printer started : " + job.getDescription()
                 );

        try {
            Thread.sleep(job.getDuration()); // simulate printing time
        } catch (InterruptedException e) {
            System.out.println("Print interrupted.");
        }

        System.out.println("Printer finished: " + job.getDescription() + " | Duration: " + job.getDuration() + " ms");
    }

    // inner Runnable class
    private class PrintTask implements Runnable {

        private PrintJob job;

        public PrintTask(PrintJob job) {
            this.job = job;
        }

        @Override
        public void run() {
            print(job);
        }
    }

    // create task for executor
    public Runnable createTask(PrintJob job) {
        return new PrintTask(job);
    }
}
