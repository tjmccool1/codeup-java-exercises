package grades;

import java.util.ArrayList;

public class Student {
//    private Properties
    private String name;
    private ArrayList<Integer> grades;

//constructor and initilize grades new empty array list
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for(int grade : this.grades)
            sum += grade;
        return sum / this.grades.size();
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    //main method test(proof of concept)
    public static void main(String[] args) {
        Student student = new Student("Thomas");
        student.addGrade(100);
        student.addGrade(95);
        student.addGrade(100);
        student.addGrade(80);


        System.out.println(student.getGradeAverage());
        System.out.println(student.getName());


    }
}
