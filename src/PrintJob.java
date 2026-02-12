package Lab4;

public class PrintJob {

    private String description;
    private int duration; 

    public PrintJob(String description, int duration) {
        this.description = description;
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }
}
