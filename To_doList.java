/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package to_dolist;
import java.util.*;
/**
 *
 * @author tumuk
 */
public class To_doList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }

            System.out.println("\nOptions:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Quit");

            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    System.out.print("Enter a task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    break;
                case 2:
                    System.out.print("Enter the task number to remove: ");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                        tasks.remove(taskNumber - 1);
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    }
