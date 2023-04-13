package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class PresenteFizzBuzzSequenceTest {

    private FizzBuzzPresenter presenter = new FizzBuzzPresenter();

    @Test
    public void shouldReturnAString() {
        assertEquals("", presenter.present(Arrays.asList()));
    }

    @Test
    public void givenListOfOneElementShouldReturnTheElement() {
        assertEquals("1", presenter.present(Arrays.asList("1")));
    }

    @Test
    public void givenListOfSeveralElementsShouldReturnElementsInOrderWithSeparator() {
        assertEquals("1, 2, 3", presenter.present(Arrays.asList("1", "2", "3")));
    }
}
