package Functions;

public class MethodOverloading {
    public static void main(String[] args) {

    }

    /*
        Method overloading means creating multiple methods with the
        same name but different parameter lists.

        Method overloading is compile-time polymorphism - Compiler decides which method to call

        This also allows constructor overloading

        Note: Varargs can be part of overloading methods
     */

    // Constructor
    public MethodOverloading() {
    }

    public MethodOverloading(int a) {
        System.out.println(a);
    }

    public MethodOverloading(String name) {
        System.out.println(name);
    }


    // Different no of parameter
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Type of parameter
    public static double add(int a, int b, double c) {
        return a + b + c;
    }

    // Order of parameters
    public static double add(int a, double b, int c) {
        return a + b + c;
    }
}
