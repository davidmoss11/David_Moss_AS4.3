public class FullTimeJob extends Job {
    private double hourlyWage;
    private int hoursPerWeek;

    public FullTimeJob(String companyName, String position, String startDate, String endDate, double hourlyWage, int hoursPerWeek) {
        super(companyName, position, startDate, endDate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Full-Time Job at " + companyName + " as " + position);
    }

    @Override
    public int calculateJobDuration() {
        // Dummy implementation: calculate based on dates
        return 365; 
    }

    @Override
    public String assessJobSatisfaction() {
        return "Very Satisfied";
    }

    public double calculateSalary() {
        return hourlyWage * hoursPerWeek * 4; // monthly salary
    }

    public String evaluateWorkLifeBalance() {
        return hoursPerWeek > 40 ? "Poor" : "Moderate";
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
}
