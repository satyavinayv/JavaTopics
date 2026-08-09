package Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        arrayExample();
        int[] arr = {1,2,3,4,5};
        sumArr(arr);
        System.out.println(largestNoInArr(arr));
        int[] arr1 = {95,96,92,90,99};
        studentMarks(arr1);
    }

    // Why Arrays?
    // Arrays allow us to store and work with multiple values of the same type using a single variable.
    // What is an array? - An array is a fixed-size collection that stores multiple values of the same data type.
    // Fixed size sequence of values.
    // Index start at 0

    /*
        Declaration with size
        dataType[] arrName = new dataType[size];
        new dataType[size] - memory creation and initialization
        size = the max no of values that can be stored in that particular array
    */

    // Another declaration and initialization
    // dataType[] arrName = {}; {} -> stores the values of specified dataType.

    /*
        Data type → fixed
        Size      → fixed
        Index     → starts at 0
     */

    // Note: only one datatype values can be stored in one array. It cant accommodate more than one datatype values in a single array

    public static void arrayExample() {
        int arr[] = new int[6]; // Not yet initialized but will have memory allocated hence will have a default value of int  -> 0
        String[] strArr = new String[6]; // Not yet initialized but will have memory allocated hence will have a special value "null"
        System.out.println(Arrays.toString(strArr)); // [null, null, null, null, null, null]
        System.out.println(Arrays.toString(arr));

//        int val = arr[5]; // will throw array index out of bound error as the arr -> size is five and max index is 4 (which is array size - 1)
//        System.out.println(val);
    }

    // calculate sum of array
    public static void sumArr(int[] arr)
    {
        int sum = 0;
        for(int i :arr)
        {
            sum += i;
        }
        System.out.println(sum);
    }

    // Find largest number
    public static int largestNoInArr (int[] arr)
    {
        int largest = arr[0];
        for (int i:arr)
        {
            if(largest < i)
            {
                largest = i;
            }
        }
        return largest;
    }

    // Student Marks
    public static void studentMarks(int[] arr)
    {
        double avg = 0.0;
        int total = 0;
        int highest = arr[0];
        int lowest = arr[0];

        for(int i:arr)
        {
            total +=i;
            if ( highest < i)
            {
                highest = i;
            }
            if( lowest > i)
            {
                lowest = i;
            }
        }
        avg = (double) total /arr.length;
        System.out.println("Average : "+avg);
        System.out.println("Total : "+total);
        System.out.println("Highest : "+highest);
        System.out.println("Lowest : "+lowest);
    }
}
