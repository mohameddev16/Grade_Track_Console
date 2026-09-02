package grade_track;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       boolean running = true;
       StudentManager studentManager =new StudentManager();
       Scanner scanner = new Scanner(System.in);
       while (running){
           System.out.println("=== Student Grade Manager ===");
           System.out.println("1) Add Student");
           System.out.println("2) Add Grade to Student");
           System.out.println("3) View Student Average");
           System.out.println("4) View All Students");
           System.out.println("5) Exit");
           System.out.print("Choose an option: ");
           String choice = scanner.nextLine();

           switch (choice){
               case "1":
                   studentManager.addStudent();
                   break;
               case "2":
                   studentManager.addGradeToStudent();
                   break;
               case "3":
                   studentManager.viewStudentAverage();
                   break;
               case "4":
                   studentManager.viewAllStudents();
                   break;
               case "5":
                   running = false;
                   System.out.println("Goodbye!");
                   break;
               default:
                   System.out.println("Invalid option, try again.");
           }
       }
    }
}
