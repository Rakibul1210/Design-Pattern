public class MergeSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] numbers) {
        if (numbers.length < 2) {
            return;
        }

        int[] temporary = new int[numbers.length];
        mergeSort(numbers, temporary, 0, numbers.length - 1);
    }

    private void mergeSort(int[] numbers, int[] temporary, int left, int right) {
        if (left >= right) {
            return;
        }

        int middle = left + (right - left) / 2;
        mergeSort(numbers, temporary, left, middle);
        mergeSort(numbers, temporary, middle + 1, right);
        merge(numbers, temporary, left, middle, right);
    }

    private void merge(
            int[] numbers,
            int[] temporary,
            int left,
            int middle,
            int right
    ) {
        int leftIndex = left;
        int rightIndex = middle + 1;
        int targetIndex = left;

        while (leftIndex <= middle && rightIndex <= right) {
            if (numbers[leftIndex] <= numbers[rightIndex]) {
                temporary[targetIndex++] = numbers[leftIndex++];
            } else {
                temporary[targetIndex++] = numbers[rightIndex++];
            }
        }

        while (leftIndex <= middle) {
            temporary[targetIndex++] = numbers[leftIndex++];
        }

        while (rightIndex <= right) {
            temporary[targetIndex++] = numbers[rightIndex++];
        }

        for (int index = left; index <= right; index++) {
            numbers[index] = temporary[index];
        }
    }

    @Override
    public String getName() {
        return "Merge sort";
    }
}
