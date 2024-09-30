public abstract class Job {
    protected String companyName;
    protected String position;
    protected String startDate;
    protected String endDate;

    public Job(String companyName, String position, String startDate, String endDate) {
        this.companyName = companyName;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public abstract void displayJobDetails();
    public abstract int calculateJobDuration(); // in days or months
    public abstract String assessJobSatisfaction();
}
