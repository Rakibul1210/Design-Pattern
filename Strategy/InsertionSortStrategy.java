public class InsertionSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] numbers) {
        for (int current = 1; current < numbers.length; current++) {
            int value = numbers[current];
            int position = current - 1;

            while (position >= 0 && numbers[position] > value) {
                numbers[position + 1] = numbers[position];
                position--;
            }

            numbers[position + 1] = value;
        }
    }

    @Override
    public String getName() {
        return "Insertion sort";
    }
}
