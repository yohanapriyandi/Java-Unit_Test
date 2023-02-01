package ardha.studio.test;

import ardha.studio.test.resolver.RandkomParameterResolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

import java.util.Random;

public class RandomCalculatorTest extends ParentCalculatorTest{
    @Test
     void testRandom(Random random){
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a,b);
        var expected = a + b;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test random calculator")
    @RepeatedTest(
            value = 10,
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    void testRandomRepeat(Random random){
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a,b);
        var expected = a + b;

        Assertions.assertEquals(expected, result);
    }
}
