package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GenerateFizzBuzzSequenceTest {
    
    private FizzBuzzGenerator generator = new FizzBuzzGenerator();

    @Test
    public void testNothing() {
        assertEquals(1, 1);
    }

    @Test
    public void testOneisOne() {
        assertEquals("1", generator.generate(1));
    }

    @Test
    public void test2is2() {
        assertEquals("2", generator.generate(2));
    }
}
