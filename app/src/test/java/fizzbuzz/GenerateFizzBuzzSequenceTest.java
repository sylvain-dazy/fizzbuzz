package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class GenerateFizzBuzzSequenceTest {
    
    private FizzBuzzGenerator generator = new FizzBuzzGenerator();

    @Test
    public void numberShouldBeTransformedToString() {
        assertEquals(Arrays.asList("1"), generator.generate(1));
    }

    @Test
    public void shouldReturnASequence() {
        assertEquals(Arrays.asList("1", "2"), generator.generate(2));
    }

    @Test
    public void multipleOf3ShouldBeTransformedToFizz() {
        assertEquals(Arrays.asList("1", "2", "fizz", "4", "buzz", "fizz"), generator.generate(6));
    }

    @Test
    public void multipleOf5ShouldBeTransformedToBuzz() {
        assertEquals(Arrays.asList("1", "2", "fizz", "4", "buzz",
                                   "fizz", "7", "8", "fizz", "buzz"), generator.generate(10));
    }

    @Test
    public void multipleOfBoth3And5ShouldBeTransformedToFizzbuzz() {
        assertEquals(Arrays.asList("1",    "2",    "fizz", "4",    "buzz",
                                   "fizz", "7",    "8",    "fizz", "buzz",
                                   "11",   "fizz", "13",   "14",   "fizzbuzz",
                                   "16",   "17",   "fizz", "19",   "buzz",
                                   "fizz", "22",   "23",   "fizz", "buzz",
                                   "26",   "fizz", "28",   "29",   "fizzbuzz"), generator.generate(30));
    }
}
