package ardha.studio.test;

import ardha.studio.test.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
//@DisplayName("Test untuk calculator app")
public class CalculatorTest {

    private Calculator calculator = new Calculator();


    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before all");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all");
    }

    @BeforeEach
    public void testSetUp(){
        System.out.println("Before");
    }

    @AfterEach
    public void testTearDown(){
        System.out.println("After");
    }

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
    @Disabled
    //@DisplayName("Test skenario failed untuk method divide()")
    public void testDivideFailed() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    @Test
    public void testAborted(){
        var profile = System.getenv("PROFILE");
        if(!"DEV".equals(profile)){
            throw  new TestAbortedException();
        }
    }

    @Test
    public void testAssumption(){
        assumeTrue("DEV".equals(System.getenv("PROFILE")));

    }
}
