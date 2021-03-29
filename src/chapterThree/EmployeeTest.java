package chapterThree;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee labour1;
        Employee labour2;
        labour1 = new Employee("FirstName: Ade", "LastName: Jones", 10000.00);
        labour2 = new Employee("FirstName: Femi", "LastName: Black", 20000.00);

        double percentage;


        double monthlySalary = 10000.00;
        double yearlySalary = monthlySalary * 12;
        percentage = (yearlySalary / 10);
        double newSalary = percentage + yearlySalary;


        System.out.printf("%s%n%s%nmonthlySalary: #%.2f%n", labour1.getFirstName(), labour1.getLastName(), labour1.getMonthlySalary());
        System.out.printf("Ade Jones yearlySalary is #%.2f%n", yearlySalary);
        System.out.println("Monthly Salary after 10% raise is #" + percentage);
        System.out.printf("The new Yearly Salary is: #%s%n%n", newSalary);


        monthlySalary = 20000.00;
        yearlySalary = monthlySalary * 12;
        percentage = (yearlySalary / 10);
        double newSalary2 = percentage + yearlySalary;


        System.out.printf("%s%n%s%nmonthlySalary: #%.2f%n", labour2.getFirstName(), labour2.getLastName(), labour2.getMonthlySalary());
        System.out.printf("Femi Black yearlySalary is #%.2f%n", yearlySalary);
        System.out.println("Monthly Salary after 10% raise is #" + percentage);
        System.out.println("The new Yearly Salary is: #" + newSalary2);

    }
}