package fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void appHasAGreeting() {
        assertEquals("Hello World!", new App().getGreeting(), "app should have a greeting");
    }
}
