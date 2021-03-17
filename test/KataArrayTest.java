import firstTdd.KataArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataArrayTest {
    @Test
    void sumOfFourNumbers() {
        int[] array = {1, 2, 3, 4};
        assertEquals(10, KataArray.sum(array));

    }

    @Test
    void averageOfFourNumbers() {
        int[] array = {1,2,3,4};
        assertEquals(2.5, KataArray.average(array));
    }

    @Test
    void getMaximumNumbers() {
        int[] Arrays = {1, 2, 3, 4};

        assertEquals(4, KataArray.getMaximum(Arrays));

    }

    @Test
    void getMinimumNumbers(){
        int []Arrays = {10,12,30,2};
        assertEquals(2, KataArray.getMinimum(Arrays));
    }
}
