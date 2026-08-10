package Questions.ArarysQuestions;

import java.util.Arrays;

public class ArraysQuestions {
    public static void main(String[] args) {

    }

    // Searching in array: If a particular values is present in given array
    public static boolean searchArr (int[] arr, int searchVal)
    {
        for (int i : arr)
        {
            if (i==searchVal)
            {
                return true;
            }
        }
        return false;
    }

    //Counting elements : Count how many numbers are even or any other
    // For now let's do search for even values in array
    public static int countValArr (int[] arr)
    {
        int count = 0;
        for (int i : arr)
        {
            if(i%2==0) count++;
        }
        return count;
    }

    // How many times does a particular value occur
    public static void freqCalArr(int[] arr, int searchFreqVal)
    {
        int count = 0;
        for (int i: arr)
        {
            if(i==searchFreqVal) count++;
        }
        System.out.println(count);
    }

    // Reversing : reverse a given array
    // Copying an array
    public static void revArr(int[] arr)
    {
        // way - 1
        int[] arrCopy = new int[arr.length];

        // Copying an array is done here in reverse fashion
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arrCopy[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arrCopy));

        // way - 2 -> swap ele
        int left = 0;
        int right = arr.length - 1;
        while (left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }

}
