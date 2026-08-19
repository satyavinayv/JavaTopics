package SelectionSortIntro;

public class SelectionSort {
    public static void main(String[] args) {

    }

    // Bubble Sort - A sorting algorithm to sort the given unsorted array.
    public static int[] selectionSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
