package fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void appTitleIsFizzbuzz() {
        assertEquals("Fizzbuzz", App.getTitle());
    }

    @Test
    void appPresentFizzbuzzSequence() {
        assertEquals("1, 2, fizz", App.fizzbuzzSequence(3));
    }

    @Test
    void appTestMain() {
        App.main(new String[] {"App"});
    }
}
