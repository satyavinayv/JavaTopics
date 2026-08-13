package LinearSearch;

public class LinearSearchIntro {
    public static void main(String[] args) {

    }

    // Linear Search
    // It's an algorithm to work for searching elements in arr/arrList...
    // Linear search checks elements one by one from the beginning until the target is found or the data ends.
    // its searches for target element one by one in linear fashion. Hence, it is called "linear search"

    public static boolean linearSearch(int[] arr, int target) {
        for (int value : arr) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }
}
