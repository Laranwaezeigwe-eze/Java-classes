package chapterThree;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        if(monthlySalary > 0.0)
            this.monthlySalary = monthlySalary;
    }

    public void setFirstName(String name){
        firstName = name;
    }

    public void setLastName(String name){
        lastName = name;
    }

    public void setMonthlySalary(double salary){
        monthlySalary = salary;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public double getMonthlySalary(){
        return monthlySalary;
    }


}
