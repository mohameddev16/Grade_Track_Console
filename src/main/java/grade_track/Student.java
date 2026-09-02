package grade_track;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int id;
    private List<Double> grades =new ArrayList<>();

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    double addGrade(double grade){
        if (grade>=0&&grade<=100){
            grades.add(grade);
        }else {
            System.out.println("Invalid grade,must be from 0 to 100");
        }
        return grade;
    }
    double getAverage(){
        if (grades.isEmpty()){
            return 0;
        }
        double sum = 0;
        for (double temp:grades){
            sum += temp;
        }
        return (double) sum / grades.size();
    }

}
