package Questions.ArrayList;

import java.util.ArrayList;

public class ArrayListQuestins {
    public static void main(String[] args) {
//        MaxAndAvgInList();
        studentList();
    }

    // Create and Array ele to list
    public static void createAndAddEleToList()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Size of list: "+list.size());
        System.out.println("First Ele of list: "+list.get(0));
        System.out.println("First Ele of list(using getFirst Method): "+list.getFirst());
        System.out.println("Last ele of list: "+list.get(list.size()-1));
        System.out.println("Last ele of list(using getLast Method): "+list.getLast());
        System.out.println("List is: "+list);
    }

    // Find Max and Avg in list
    public static void MaxAndAvgInList()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int max = list.getFirst();
        int min = list.getFirst();
        int total = list.getFirst();
        for(int i=1;i<list.size();i++)
        {
            if(max < list.get(i)) max = list.get(i);
            if(min > list.get(i)) min = list.get(i);
            total += list.get(i);
        }
        System.out.println("Max Value is :"+max);
        System.out.println("Min Value is :"+min);
        System.out.println("Total of list :"+total);
        System.out.println("Avg of list :"+total/ list.size());
    }

    // Student Data in list
    public static void studentList()
    {
        ArrayList<String> student = new ArrayList<>();
        student.add("Satya");
        student.add("Vinay");
        student.add("Rahul");
        student.add("Mahesh");

        //Print list
        System.out.println("List values :"+student);

        // Add a student
        student.add("Virat");

        // Remove a student
        student.remove("Satya");   //-> By Value
        student.remove(1);      // -> By Index

        // Change student name
        student.set(2,"Ramesh");

        // Check if "Ramesh" is present
        System.out.println(student.contains("Ramesh"));

        // Final List
        System.out.println("Final Student List: "+student);
    }

}
