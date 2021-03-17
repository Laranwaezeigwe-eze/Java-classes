package firstTdd;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    void startAllTestsWith(){
        calculator = new Calculator();
    }

    @Test

    void addTwoNumbersTest() {
        calculator.add(3, 2);

        assertEquals(5, calculator.add(3,2));
        assertEquals(12, calculator.add(5,7));

    }

    @Test
    void multiplyTwoNumbersTest(){
        calculator.multiply(2, 2);

        assertEquals(4, calculator.multiply(2,2));
        assertEquals(15, calculator.multiply(3,5));
    }
    @Test
   void divideTwoNumbersTest(){
        calculator.divide(4, 2);

        assertEquals(2, calculator.divide(4,2));
        assertEquals(3, calculator.divide(6,2));
    }
    @Test
    @DisplayName("Testing for Float return")
    void divideTwoNumbersToYieldFloatTest(){
        assertEquals(2.5, calculator.divide(5,2));
    }

    @Test
    @DisplayName("Division by zero returns zero")
    void divisionByZeroTest(){

        assertEquals(0, calculator.divide(5,0));

    }
   @Test
    void difference_canBeCalculated(){
        assertEquals(5,calculator.subtract(10,5));
   }
   @Test
    void difference_willBeAbsolute(){
        assertEquals(5,calculator.subtract(5,10));
   }
}
