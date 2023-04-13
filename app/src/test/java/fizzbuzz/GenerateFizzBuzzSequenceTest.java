package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class GenerateFizzBuzzSequenceTest {
    
    private FizzBuzzGenerator generator = new FizzBuzzGenerator();

    @Test
    public void numberShouldBeTransformedToString() {
        assertEquals(Arrays.asList("1"), generator.generate(1));
        assertEquals(Arrays.asList("2"), generator.generate(2));
    }

    @Test
    public void multipleOf3ShouldBeTransformedToFizz() {
        assertEquals(Arrays.asList("fizz"), generator.generate(3));
        assertEquals(Arrays.asList("fizz"), generator.generate(6));
    }

    @Test
    public void multipleOf5ShouldBeTransformedToBuzz() {
        assertEquals(Arrays.asList("buzz"), generator.generate(5));
        assertEquals(Arrays.asList("buzz"), generator.generate(10));
    }
}
