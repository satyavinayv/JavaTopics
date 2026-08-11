package Questions.ArarysQuestions;

public class Arrays2DQuestions2 {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        rowWiseSum(arr);
    }

    // Row wise sum in 2D Array
    public static void rowWiseSum(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum is :" + sum);
        }
    }

    // Column wise sum in 2D Array
    public static void colWiseSum(int[][] arr) {
        int maxColumns = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length > maxColumns) {
                maxColumns = arr[i].length;
            }
        }

        for (int j = 0; j < maxColumns; j++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                // Safe check for jagged arrays
                if (j < arr[i].length) {
                    sum += arr[i][j];
                }
            }
            System.out.println("Column " + j + " total: " + sum);
        }
    }

    public static void searchEleArr(int[][] arr, int searchEle) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == searchEle) {
                    System.out.println("Found " + searchEle + " at row " + i + " column " + j);
                    return;
                }
            }
        }
        System.out.println("Element " + searchEle + " was not found in the array.");
    }

    public static void printMainDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }

}