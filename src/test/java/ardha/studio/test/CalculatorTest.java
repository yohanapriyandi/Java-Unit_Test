package ardha.studio.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public  void testAddSuccess(){
        var result = calculator.add(15,56);
        assertEquals(71, result);
    }
}
