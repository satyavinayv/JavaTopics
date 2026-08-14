package Questions.BinarySearchQues;

public class BinarySearchQuestion {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,10,21,32,48};
        System.out.println(ceilingOfANumber(arr, 33));
        System.out.println(floorNumber(arr, 33));
    }

    // Q: Ceiling of a Number
    // Given an array of numbers sorted in ascending order, find the ceiling of a given number
    // The ceiling of a number is the smallest number in the given array greater than or equal to that number.
    // Write a function to return the index of the ceiling of the target number
    // If there is no ceiling return -1

     public static int ceilingOfANumber(int[] arr, int target) {
         int start = 0;
         int end = arr.length - 1;

         if (target > arr[end]) {
             return -1; // No ceiling exists
         }

         while (start <= end) {
             int mid = start + (end - start) / 2;

             if (arr[mid] == target) {
                 return mid; // Target found
             } else if (arr[mid] < target) {
                 start = mid + 1; // Search in the right half
             } else {
                 end = mid - 1; // Search in the left half
             }
         }

         return start; // Start will be the index of the smallest number greater than target
     }

     public static int floorNumber (int[] arr, int target) {
         int start = 0;
         int end = arr.length-1;
         if (target < arr[start]) {
             return -1; // No floor value exists
         }

         while (start <= end) {
             int mid = start + (end - start) / 2;

             if (arr[mid] == target) {
                 return mid;
             } else if (arr[mid] < target) {
                 start = mid + 1;
             } else {
                 end = mid - 1;
             }
         }
         return end;
     }
}
