package fizzbuzz;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzzGenerator {

    public List<String> generate(int n) {
        List<String> sequence = new LinkedList<>();
        sequence.add(transformToFizzBuzz(n));
        return sequence;
    }

    private String transformToFizzBuzz(int n) {
        if (isMultipleOf5(n)) {
            return "buzz";
        }
        if (isMultipleOf3(n)) {
            return "fizz";
        }
        return String.valueOf(n);
    }

    private boolean isMultipleOf5(int n) {
        return nIsMultipleOfM(n, 5);
    }

    private boolean isMultipleOf3(int n) {
        return nIsMultipleOfM(n, 3);
    }

    private boolean nIsMultipleOfM(int n, int m) {
        return n % m == 0;
    }
}
