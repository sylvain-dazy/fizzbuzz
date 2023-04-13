package fizzbuzz;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzzGenerator {

    /**
     * Generate the Fizzbuzz sequence of numbers ranging from 1 to n
     * @param n
     */
    public List<String> generate(int n) {
        List<String> sequence = new LinkedList<>();
        for (int i = 1; i <= n; i++)
            sequence.add(fizzbuzzValueOf(i));
        return sequence;
    }

    private String fizzbuzzValueOf(int number) {
        if (isMultipleOf3(number) && isMultipleOf5(number)) {
            return "fizzbuzz";
        }
        if (isMultipleOf5(number)) {
            return "buzz";
        }
        if (isMultipleOf3(number)) {
            return "fizz";
        }
        return String.valueOf(number);
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
