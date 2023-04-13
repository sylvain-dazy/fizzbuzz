package fizzbuzz;

import java.util.List;

public class FizzBuzzPresenter {

    private static final String SEPARATOR = ", ";

    public String present(List<String> sequence) {
        String s = "";
        for (int i = 0; i < sequence.size();) {
            s += sequence.get(i);
            if (++i < sequence.size()) {
                s += SEPARATOR;
            }
        }
        return s;
    }
}
