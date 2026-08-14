package BinarySearch;

public class BinarySearchIntro {
    public static void main(String[] args) {

    }
    // Binary search
    // Don't check every element. Eliminate half of the remaining elements after every comparison.
    // It's an algorithm to work for searching elements in arr/arrList...
    // But it is much faster than linear search. But it only works on sorted arrays. It is based on "divide and conquer" algo.
    /*
        Binary search repeatedly checks the middle element and eliminates half
        of the remaining search area until the target is found or there is nothing left to search.

        Every comparison tries to eliminate half the possibilities.

        1.Take middle of array
        2.Compare it with the target value
        3.If it is equal return as true and found.
        4.If it is less than target value, then we eliminate the left half as all will be less than target as it is a sorted array.
        5.Hence, we will search in right half of the array.
        4.If it is greater than target value, then we eliminate the right half as all will be greater than target as it is a sorted array.
        7.Hence, we will search in left half of the array.
        8.We will do this process till we get the target element or the array we search is empty.
     */

    // Start only after array is sorted. if not first sort the array and use this method.
    public static int binarySearch(int[] arr, int target)
    {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
            {
                return mid;
            }
            else if (arr[mid] < target)
            {
                // Target is on the right
                left = mid + 1;
            }
            else
            {
                // Target is on the left
                right = mid - 1;
            }
        }
        return -1;
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) { // If array is ascending order then we check this
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // If array is in descending order then we check this
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
