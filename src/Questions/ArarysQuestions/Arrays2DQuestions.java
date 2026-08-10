package Questions.ArarysQuestions;

public class Arrays2DQuestions {
    public static void main(String[] args) {

        int[][] arr = {{96, 95, 92}, {89, 99, 91}, {100, 95, 90}};
        studentResults(arr);
    }

    // Print all values of 2d Array
    public static void printValues(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Sum of all the values of 2D Array
    public static int sumOfValues(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    // Print avg, highest of student marks
    public static void studentResults(int[][] arr) {
        double[][] studentResults = new double[arr.length][2];
        int sum = 0;
        int highestTotal = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            studentResults[i][0] = (double) sum / arr[i].length;
            studentResults[i][1] = sum;
            if (sum > highestTotal) highestTotal = sum;
            sum = 0;
        }
        for (int i = 0; i < studentResults.length; i++) {
            System.out.print("Avg of student" + (i + 1) + " is : " + studentResults[i][0]+"\n");
            System.out.print("Total of student" + (i + 1) + " is : " + studentResults[i][1]+"\n\n");
        }
        System.out.println("Highest Total :" + highestTotal);
    }
}
