package ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        // Create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Add elements
        names.add("Satya");
        names.add("Rahul");
        names.add("Priya");

        // Access elements
        /*
            System.out.println(names.get(0));
            System.out.println(names.get(1));
            System.out.println(names.get(2));

            // Get number of elements
            System.out.println("Size: " + names.size());
        */
    }

    // Why ArrayList?
    /*
        Using array we can do till a point we know the size of array we need to make.
        Let's take an example of students in a school or class
        The number of students at the start of admission can be 10. Once admission started it increases and it can go to n.
        The size of n is unknown as we cant estimate how many number of students gonna join. If we overestimate the array remaining size will be wasted.
        If we underestimate the students cant fit in the array.
        to avoid this problem we need dynamic size allocation.
        It is possible with ArrayList
     */
    // What is an ArrayList?
    /*
        ArrayList is a resizable collection that stores multiple objects in an ordered sequence.
     */
    // Declaration
    // ArrayList<String> users = new ArrayList<>(); -> Same as object creation for classes

    /*
        An ArrayList internally uses "Array".
        But if the size of array takes by ArrayList is completed. It creates a larger size array and copies the current values into it.
        When the internal array becomes full, and you add another element, Java creates a larger internal array and copies the existing elements into it.
        That's why it's called dynamic/resizable.
     */

    /*
        To use "ArrayList" we need to import arraylist -> import java.util.ArrayList
        ArrayList<dataTypeOfValueStoring> NameOfArrayList = new ArrayList<>();

        Important note -> ArrayList only stores objects/wrapper types not primary types. Hence, for "int" -> "integer",
        double  → Double,
        char    → Character,
        boolean → Boolean,
        long    → Long.
     */

    /*
        We have methods that are used in extraction of elements and performing actions on them.
        add() -> Used to add elements to the list
        get(index) -> used to get the value present at particular index provided.
        set(index, newValue) -> used to modify an existing value at given index.
        remove(index) -> used to remove value at given index.
        size() -> used to get the size of list.
        contains(inputValue) -> returns boolean value. Takes the input and check if the list contains it or not.
        isEmpty() -> used to check if the list is empty or not. Returns boolean.
        getFirst() -> used to get first index value.
        getlast() -> used to get last index value.
     */

}
