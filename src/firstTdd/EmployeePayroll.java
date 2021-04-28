package firstTdd;

public class EmployeePayroll {
    private String firstName;
    private String lastName;
    private int socialSecurityNumber;

    public EmployeePayroll(String firstName, String lastName, int socialSecurityNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return  lastName;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}
