package Functions;

import java.util.Scanner;

public class FunctionsPractice1 {
    public static void main(String[] args) {
        // Think of print a two user input values sum.
        // It can be done with declaring two int values and asking input from user and print
        // Pretty simple but if we are asked to do 50 or 100 times?
        // Copy paste is in efficient - So we use functions so that we can call the function n number of times we want.

        // Function declaration
        /* access_modifier static_nonstatic return_type functionName (args - optional) {
            Body
            return type with value
        }
         */

        // Function call
//        myFunction();

        // Doing it 100 times - yes possible - but for practicality lets do it for 5 times
        for (int i=0; i<5; i++)
        {
            System.out.println("Call No : "+(i+1));
            myFunction();
        }
    }

    // Function Declaration
    public static void myFunction () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1 value : ");
        int a = sc.nextInt();
        System.out.print("Input 2 value : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is : "+sum);
    }
}
