package dz.benkadour.khaled.SRP.Solution;

public class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        return employee.getHourlyRate() * employee.getHourlyWork();
    }
}
