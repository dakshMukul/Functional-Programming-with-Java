package Programming;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 12, 15);
        // printAllNumbersInList(numbers);
        printEvenNumbersInList(numbers);
    }

    private static void printAllNumbersInList(List<Integer> numbers) {
        //focusing on what to do and how to do?
        for (int i : numbers) {
            System.out.println(i);
        }
    }

    private static void printEvenNumbersInList(List<Integer> numbers) {
        // focusing on what to do and how to do?
        for (int i : numbers) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
}
