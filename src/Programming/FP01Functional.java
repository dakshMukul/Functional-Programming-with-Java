package Programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 12, 15);

        // printAllNumbersInFunctionalApproch(numbers);
        printEvenNumbersInFunctionalApproch(numbers);
    }

    private static void printAllNumbersInFunctionalApproch(List<Integer> numbers) {
        // Focusing on what to do?
        numbers.stream().forEach(System.out::println);
    }

    private static void printEvenNumbersInFunctionalApproch(List<Integer> numbers) {
        // Focusing on what to do?
        numbers.stream()
               .filter(kuchbhi -> kuchbhi % 2 == 0) // lambda expression
               .forEach(System.out::println); // method referance
    }
}
