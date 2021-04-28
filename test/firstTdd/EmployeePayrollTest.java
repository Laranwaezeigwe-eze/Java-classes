package firstTdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class EmployeePayrollTest {
    EmployeePayroll employeePayroll;
    @BeforeEach
    void startEachTestWithThis(){
         employeePayroll = new EmployeePayroll("Lara", "King", 1234);

    }
    @Test
    void employeePayrollCanBeCreated(){
        assertNotNull(employeePayroll);
    }
    @Test
    void employeePayrollCanHaveFirstName(){
    assertEquals("Lara", employeePayroll.getFirstName());
    }
    @Test
    void employeePayrollCanHaveLastName(){
        assertEquals("King", employeePayroll.getLastName());
    }
    @Test
    void setEmployeePayrollCanHaveSecurityNumber(){
        assertEquals(1234,employeePayroll.getSocialSecurityNumber());
    }
}

