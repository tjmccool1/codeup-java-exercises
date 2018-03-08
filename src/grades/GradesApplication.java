package grades;

import util.Input;

import java.util.HashMap;
// TODO: GO BACK AND REFACTOR TO USE METHODS
public class GradesApplication {
//initialize the input
    private static Input input = new Input();

    public static void main(String[] args) {
//  creating HashMap for students
        HashMap<String, Student> students = new HashMap<>();


//  adding new Student to HashMap and grades this uses the Student.java
        Student thomas = new Student("Thomas McCool");
        thomas.addGrade(100);
        thomas.addGrade(100);
        thomas.addGrade(70);

        Student john = new Student("John Doe");
        john.addGrade(90);
        john.addGrade(80);
        john.addGrade(70);

        Student jane = new Student("Jane Doe");
        jane.addGrade(70);
        jane.addGrade(100);
        jane.addGrade(100);

        Student cookie = new Student("Cookie Doe");
        cookie.addGrade(100);
        cookie.addGrade(100);
        cookie.addGrade(100);

//      adding students to HashMap key:value(value is not a string)
        students.put("tjmccool1", thomas);
        students.put("hedoe", john);
        students.put("shedoe", jane);
        students.put("yumyum", cookie);

//        test for output IT WORKS!
//        System.out.println(students.get("tjmccool1").getName().getGradeAverage());
//        System.out.println(students.get("tjmccool1").getGradeAverage());

//    asking for input about student
        do {
//    showing all students gitHub
            System.out.println("Here is the list of our students gitHub user names");
            for(String student : students.keySet())
                System.out.printf("| %s |  ", student);
//       All students?
            Boolean userChoice = input.yesNo("\nWould you like to see all students grades and averages?");
//       Show all Students, grades and averages
            if(userChoice){
                for(String student : students.keySet())
                    System.out.printf("Student: %s \nGrades: %s \nAverage: %s\n\n",students.get(student).getName(), students.get(student).getGrades(), students.get(student).getGradeAverage());
                break;
            }
//       getting specific student input
            String userSelection = input.getString("\nWhich student you would like to see more information about?\n");

//       invalid user input
            if(!students.containsKey(userSelection)){
                System.out.println("There is no student with that username.");
//       valid input
            }else {
                System.out.println(students.get(userSelection).getName());
                System.out.println(students.get(userSelection).getGradeAverage());
//       view grade for student
                userChoice = input.yesNo("\nWould you like to view all of " + students.get(userSelection).getName() + "'s grades?");
                if(!userChoice){
                    break;
                }else System.out.println(students.get(userSelection).getGrades());
                }


            } while (input.yesNo("Would you Like to Continue?"));

        System.out.println("Good Bye");
//
        }
    }