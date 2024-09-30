public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("David Moss");

        Job fullTimeJob = new FullTimeJob("Tech Corp", "Software Engineer", "2021-01-01", "2023-01-01", 50.0, 40);
        Job partTimeJob = new PartTimeJob("Retail Shop", "Cashier", "2020-06-01", "2020-12-01", 20.0, 15);
        Job contractJob = new ContractJob("Freelance Inc.", "Consultant", "2023-02-01", "2023-05-01", 75.0, 160);

        employee.addJob(fullTimeJob);
        employee.addJob(partTimeJob);
        employee.addJob(contractJob);

        employee.displayJobDetails();
        employee.displayJobDurations();
        employee.displayJobSatisfaction();
    }
}
