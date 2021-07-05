import SelfPractice.KataArithmetic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class KataTest2 {
    @Test
    void sequenceCanGetNextNumber(){
        KataArithmetic kata = new KataArithmetic();
        assertEquals(8, KataArithmetic.apNumber(2,4,6));


    }


}
