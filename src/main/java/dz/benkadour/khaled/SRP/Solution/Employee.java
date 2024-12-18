package dz.benkadour.khaled.SRP.Solution;

public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private double salary;
    private double hourlyWork;
    private int hourlyRate;

    public Employee(Long id, String firstName, String lastName, String email, String phoneNumber, double salary, double hourlyWork, int hourlyRate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.hourlyWork = hourlyWork;
        this.hourlyRate = hourlyRate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getHourlyWork() {
        return hourlyWork;
    }

    public void setHourlyWork(double hourlyWork) {
        this.hourlyWork = hourlyWork;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
}
}