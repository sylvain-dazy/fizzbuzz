package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GenerateFizzBuzzSequenceTest {
    
    private FizzBuzzGenerator generator = new FizzBuzzGenerator();

    @Test
    public void numberShouldBeTransformedToString() {
        assertEquals("1", generator.generate(1));
        assertEquals("2", generator.generate(2));
    }

    @Test
    public void multipleOf3ShouldBeTransformedToFizz() {
        assertEquals("fizz", generator.generate(3));
        assertEquals("fizz", generator.generate(6));
    }

    @Test
    public void multipleOf5ShouldBeTransformedToBuzz() {
        assertEquals("buzz", generator.generate(5));
        assertEquals("buzz", generator.generate(10));
    }
}
