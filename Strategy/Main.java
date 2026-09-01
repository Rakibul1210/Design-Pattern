import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AdaptiveSorter sorter = new AdaptiveSorter(
                8,
                new InsertionSortStrategy(),
                new MergeSortStrategy()
        );

        int[] smallInput = {7, 2, 5, 1, 4};
        int[] largeInput = {42, 7, 19, 3, 88, 12, 1, 64, 23, 9, 55, 31};

        System.out.println("--- Small input ---");
        printResult(sorter, smallInput);

        System.out.println("\n--- Large input ---");
        printResult(sorter, largeInput);

        System.out.println("\nOriginal large input remains unchanged:");
        System.out.println(Arrays.toString(largeInput));
    }

    private static void printResult(AdaptiveSorter sorter, int[] numbers) {
        System.out.println("Before: " + Arrays.toString(numbers));
        int[] sorted = sorter.sort(numbers);
        System.out.println("After:  " + Arrays.toString(sorted));
    }
}
