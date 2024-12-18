package dz.benkadour.khaled.SRP.Solution;

public class EmployeeRepository {
    public void saveToDatabase(Employee employee) {
        System.out.println("Saving employee " + employee.getFirstName() + " to the database...");
        // Logic to save the employee in the database
    }
}
