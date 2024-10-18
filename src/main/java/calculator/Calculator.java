package calculator;

import java.util.List;

public class Calculator {
    public static int calculate(final String input) {
        if (input.isEmpty()) return 0;

        List<String> parsedNumbers = Parser.parseNumbers(input);

        return parsedNumbers.stream()
                .mapToInt(Validator::validate)
                .sum();
    }
}