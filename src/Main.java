import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        System.out.println("1. Add a Task");
        System.out.println("2. Remove a Task");
        System.out.println("3. Update a Task");
        System.out.println("4. List all Tasks");
        System.out.println("0. Exit");
        System.out.println("What would you like to do? ");
        int userInput = input.nextInt();
        input.nextLine();
        while (userInput > 0) {
            if (userInput == 1)
                addTask(tasks);
            else if (userInput == 0)
                System.exit(0);
            else if (userInput == 2) {
                removeTask(tasks);
            } else if (userInput == 4) {
                System.out.println("Here are your current Tasks");
                System.out.println(tasks);
            } else if (userInput == 5) {

                updateTask(tasks);
                System.out.println(tasks);
            }


            System.out.println("What would you like to do? ");
            userInput = input.nextInt();
            input.nextLine();
        }
    }


    static void addTask(ArrayList<String> a) {
        System.out.println("What task would you like to add...");

        String userin = input.nextLine();

        a.add(userin);
        System.out.println(a);


    }


    static void removeTask(ArrayList<String> a) {
        System.out.println("What task would you like to remove?");
        String userin = input.nextLine();

        a.remove(userin);
        System.out.println(a);


    }

    static void listTask(ArrayList<String> a) {
        System.out.println("Here are the tasks you already have!");
        String userin = input.next();
    }




    static ArrayList<String> updateTask(ArrayList<String> a) {
        System.out.println("What index would you like to replace?");
        int ind = input.nextInt();
        input.nextLine();

        System.out.println("What would you like to update it to?");
        String update = input.nextLine();
        a.set(ind, update);


        return a;
    }




}


