package grade_track;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private Scanner scanner = new Scanner(System.in);
    private List<Student> students = new ArrayList<>();
    int nextId = 1;

    public void addStudent(){
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        Student student = new Student(name,nextId);
        nextId++;
        students.add(student);
        System.out.println("Student added with ID: " + student.getId());
    }
    public void addGradeToStudent(){
        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student found = findStudentById(id);
        if (found==null){
            System.out.println("No student found with ID: " + id);
        }
        System.out.print("Enter Grade: ");
        double grade = Double.parseDouble(scanner.nextLine());
        found.addGrade(grade);
    }



    public void viewStudentAverage(){
        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student found = findStudentById(id);
        if (found == null) {
            System.out.println("No student found with ID: " + id);
            return;
        }

        System.out.println(found.getName() + "'Student Average: " + found.getAverage());
    }

    public void viewAllStudents(){
        if (students.isEmpty()){
            System.out.println("No students added yet.");
        }
        System.out.println("---- All Students ----");
        for (Student s:students){
            System.out.println("ID: " + s.getId());
            System.out.println("Name: " + s.getName());
            System.out.println("Average: " + s.getAverage());
        }
    }
    private Student findStudentById(int id) {
        for (Student s :students){
            if (s.getId()==id){
                return s;
            }
        }
        return null;
    }

}

