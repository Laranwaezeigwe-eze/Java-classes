package firstTdd;

import chapterThree.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EmployeeTest {
    @Test
    void employeeHasAName() {
        Employee staff = new Employee("Lara", "King", 5000.00);
        assertNotNull(staff.getFirstName());
        assertNotNull(staff.getLastName());

    }

    @Test
    void employeeIsGivenAMonthlySalary() {
        Employee staff = new Employee("Lara", "King", 10000.00);
        staff.getMonthlySalary();
        assertEquals(10000, staff.getMonthlySalary());

    }
    @Test
    void employeeCanReceiveAYearlySalary(){
        Employee staff = new Employee("Lara", "King", 10000.00);
        staff.getYearlySalary();
        assertEquals(120000,staff.getYearlySalary());
    }
    @Test
    void employeeCanGetATenPercentRaiseInSalary(){
        Employee staff = new Employee("Ejika", "Umez", 5000.00);
        staff.getSalaryPercentage(staff.getYearlySalary());
        assertEquals(6000,staff.getSalaryPercentage(staff.getYearlySalary()));
   }
   @Test
    void employeeCanGetNewSalary(){
       Employee staff = new Employee("Real", "Umez", 5000.00);
       staff.getNewSalary(staff.getSalaryPercentage(staff.getYearlySalary()));
       assertEquals(66000, staff.getNewSalary(staff.getSalaryPercentage(staff.getYearlySalary())));
   }
}