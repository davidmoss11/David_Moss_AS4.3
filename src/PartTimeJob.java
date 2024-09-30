public class PartTimeJob extends Job {
    private double hourlyWage;
    private int hoursPerWeek;

    public PartTimeJob(String companyName, String position, String startDate, String endDate, double hourlyWage, int hoursPerWeek) {
        super(companyName, position, startDate, endDate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Part-Time Job at " + companyName + " as " + position);
    }

    @Override
    public int calculateJobDuration() {
        return 180;
    }

    @Override
    public String assessJobSatisfaction() {
        return "Satisfied";
    }

    public double calculatePartTimeSalary() {
        return hourlyWage * hoursPerWeek * 4; // monthly salary
    }

    public String evaluateWorkHours() {
        return hoursPerWeek > 20 ? "Busy" : "Comfortable";
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
}
