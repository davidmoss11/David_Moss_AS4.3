public class ContractJob extends Job {
    private double hourlyRate;
    private int hoursWorked;

    public ContractJob(String companyName, String position, String startDate, String endDate, double hourlyRate, int hoursWorked) {
        super(companyName, position, startDate, endDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Contract Job at " + companyName + " as " + position);
    }

    @Override
    public int calculateJobDuration() {
        return 90;
    }

    @Override
    public String assessJobSatisfaction() {
        return "Neutral";
    }

    public double calculatePayment() {
        return hourlyRate * hoursWorked;
    }

    public String evaluateJobSecurity() {
        return "Low";
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
