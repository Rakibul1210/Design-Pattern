import java.util.Arrays;
import java.util.Objects;

public class AdaptiveSorter {
    private final int smallInputThreshold;
    private final SortingStrategy smallInputStrategy;
    private final SortingStrategy largeInputStrategy;

    public AdaptiveSorter(
            int smallInputThreshold,
            SortingStrategy smallInputStrategy,
            SortingStrategy largeInputStrategy
    ) {
        if (smallInputThreshold < 0) {
            throw new IllegalArgumentException("Threshold cannot be negative.");
        }

        this.smallInputThreshold = smallInputThreshold;
        this.smallInputStrategy = Objects.requireNonNull(smallInputStrategy);
        this.largeInputStrategy = Objects.requireNonNull(largeInputStrategy);
    }

    public int[] sort(int[] numbers) {
        int[] sortedNumbers = Arrays.copyOf(
                Objects.requireNonNull(numbers),
                numbers.length
        );
        SortingStrategy strategy = selectStrategy(sortedNumbers.length);

        System.out.println(
                "Using " + strategy.getName() + " for "
                        + sortedNumbers.length + " elements."
        );
        strategy.sort(sortedNumbers);
        return sortedNumbers;
    }

    private SortingStrategy selectStrategy(int elementCount) {
        if (elementCount <= smallInputThreshold) {
            return smallInputStrategy;
        }

        return largeInputStrategy;
    }
}
