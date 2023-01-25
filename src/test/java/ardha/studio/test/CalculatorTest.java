package ardha.studio.test;

import ardha.studio.test.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
//@DisplayName("Test untuk calculator app")
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    //@DisplayName("Test skenario sukses untuk method add()")
    public  void testAddSuccess(){
        var result = calculator.add(15,56);
        assertEquals(71, result);
    }

    @Test
    //@DisplayName("Test skenario suskes untuk method divide()")
    public void testDivideSuccess(){
        var result = calculator.divide(100, 10);
        assertEquals(10, result);
    }

    @Test
    //@DisplayName("Test skenario failed untuk method divide()")
    public void testDivideFailed() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}
