package fizzbuzz;

public class FizzBuzzGenerator {

    public String generate(int n) {
        if (isMultipleOf3(n)) {
            return "fizz";
        }
        return String.valueOf(n);
    }

    private boolean isMultipleOf3(int n) {
        return nIsMultipleOfM(n, 3);
    }

    private boolean nIsMultipleOfM(int n, int m) {
        return n % m == 0;
    }
}
