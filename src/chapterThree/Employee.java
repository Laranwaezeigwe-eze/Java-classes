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


    public double getYearlySalary() {
        return monthlySalary * 12;
    }
        double yearlySalary;
    public double getSalaryPercentage(double percentage) {
        percentage =  (monthlySalary*12)/10;
        return percentage;
    }

    public double getNewSalary(double newSalary) {
      newSalary = ((monthlySalary*12)/10) + (monthlySalary*12);
        return newSalary;
    }


}
