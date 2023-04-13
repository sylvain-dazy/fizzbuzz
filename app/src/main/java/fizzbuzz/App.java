package fizzbuzz;

public class App {

    public static void main(String[] args) {
        System.out.println(getTitle());
        int n = Integer.parseInt("50");
        System.out.println(fizzbuzzSequence(n));
    }

    public static String fizzbuzzSequence(int n) {
        return new FizzBuzzPresenter().present(new FizzBuzzGenerator().generate(n));
    }

    public static String getTitle() {
        return "Fizzbuzz";
    }
}
