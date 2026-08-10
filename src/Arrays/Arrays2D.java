package Arrays;

public class Arrays2D {
    public static void main(String[] args) {

    }

    // Why 2D Array?
    // 2D array is useful when data naturally has two dimensions.
    // Representation -> int[][] arr;  -> 1st [] => rows and 2nd [] => columns
    /*
        int     → type of data
        [][]    → two-dimensional array
        arr     → variable name
     */

    /*
        Creating 2D Array:
        -> Creating with values:
        int[][] numbers = {{10, 20, 30},{40, 50, 60},{70, 80, 90}};
        -> Creating with only memory not values initialization
        int[][] numbers = new int[size1][size2];

        Here arr.length -> gives rows count
        arr[rowIndex].lenght -> gives column count in a particular row
     */

    /*
        What is a 2D Array?
        A 2D array is an array of arrays that stores data in rows and columns.
     */

    public static void createAndAccess2DArray()
    {
        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        // Access individual elements
        System.out.println(numbers[0][0]);
        System.out.println(numbers[1][2]);
        System.out.println(numbers[2][1]);
    }

    // Traversal with loops
    public static void createAndTraverse()
    {
        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        // Outer loop → rows
        for (int i = 0; i < numbers.length; i++) {
            // Inner loop → columns
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Modifying Values
    public static void modifyValues()
    {
        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        // Increase every value by 10
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = numbers[i][j] + 10;
            }
        }

        // Print modified array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
