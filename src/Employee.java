import java.util.ArrayList;

public class Employee {
    private ArrayList<Job> jobHistory;

    public Employee(String name) {
        this.jobHistory = new ArrayList<>();
    }

    public void addJob(Job job) {
        jobHistory.add(job);
    }

    public void displayJobDetails() {
        for (Job job : jobHistory) {
            job.displayJobDetails();
        }
    }

    public void displayJobDurations() {
        for (Job job : jobHistory) {
            System.out.println(job.calculateJobDuration() + " days");
        }
    }

    public void displayJobSatisfaction() {
        for (Job job : jobHistory) {
            System.out.println(job.assessJobSatisfaction());
        }
    }

    public ArrayList<Job> getJobHistory() {
        return jobHistory;
    }

    public void setJobHistory(ArrayList<Job> jobHistory) {
        this.jobHistory = jobHistory;
    }
}
