package Functions;

import java.util.Arrays;

public class FunctionsPracticeVarArgs {
    public static void main(String[] args) {

        // method declaration with args
        varArgsMethod(1,2,3,4,5);
        varArgsMethod(1,2,3);
        varArgsMethod();
        test("Satya",99, 98, 95);
    }

    // VarArgs Method - If no of arguments is unknown then we can use varargs
    // Declaration is as below
    // One more important point is "varargs parameter can also accept zero arguments or multiple args"
    // Only one varargs parameter is allowed
    // Varargs must be the last parameter
    public static void varArgsMethod (int ...varArgs)
    {
        System.out.println(Arrays.toString(varArgs)); // printing the unknown number of values
    }

    // Valid
    public static void test(String name, int... marks) {
        System.out.println("Name : "+name +" , Marks : "+ Arrays.toString(marks));
    }

    // InValid and throw's error
    // Because Java wouldn't know where the variable-length arguments end and where name begins.
    // public static void test(int... marks, String name)

    /*
        Be careful with overloaded methods

        Varargs can sometimes create confusing method overloads.

        For example:

        test(int... numbers)
        test(boolean... values)

        Calling:

        test();

        can cause ambiguity because both methods can accept zero arguments.
     */

    /*
        public static void print(int... numbers) {
            System.out.println(numbers);
        }
        This doesn't print the individual numbers
        This does print a type@hashvalue -> [I@6d06d69c]
     */
}
