package Functions;

public class FunctionsPracticeShadowing {
    static int x = 200; // Global Variable - Making it static to access in static method
    public static void main(String[] args) {
        System.out.println(x); // Global Variable Value will be printed

        int x;
//        System.out.println(x); - This will throw an error as the x value is not yet initialized/
//        But you can see we have a variable x in global scope.
//        Even though we have an x in global scope we again declared the same variable 'x' in this method scope and not intialized.
//        Causing the sout(x) to throw an error.
//        Now if we initialize it and then try to print we wont get an error
//        But try to think which value of x will be printed -> global or this method x value?
        x = 250;

        System.out.println(x); // If you say the local method value it is true.
//        Here the concept is the global value is shadowed by the local variable scope.
//        Hence the value will be printed with local scope.
    }
}
