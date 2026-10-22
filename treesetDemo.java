package sidharthsircorejava;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class treesetDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose sorting:");
        System.out.println("1. Sort by ID (Default)");
        System.out.println("2. Sort by Name");
        System.out.println("3. Sort by Marks");
        System.out.print("Enter your choice: ");

        String choice = sc.nextLine().trim();

        TreeSet<Student> ts;

        if (choice.isEmpty() || choice.equals("1")) {
            ts = new TreeSet<>(
                Comparator.comparingInt(s -> s.id)
            );
        } else if (choice.equals("2")) {
            ts = new TreeSet<>(
                Comparator.comparing(s -> s.name)
            );
        } else if (choice.equals("3")) {
            ts = new TreeSet<>(
                Comparator.comparingDouble(s -> s.marks)
            );
        } else {
            System.out.println("Invalid choice! Default sorting by ID.");
            ts = new TreeSet<>(
                Comparator.comparingInt(s -> s.id)
            );
        }

        ts.add(new Student(3, "Rahul", 80.5));
        ts.add(new Student(1, "Amit", 90.0));
        ts.add(new Student(4, "Priya", 85.5));
        ts.add(new Student(2, "Sneha", 95.0));

        System.out.println("\nStudent Details:");
        for (Student s : ts) {
            System.out.println(s);
        }

        sc.close();
    }
}

