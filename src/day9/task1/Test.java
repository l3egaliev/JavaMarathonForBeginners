package day9.task1;

import day9.task1.Student;
import day9.task1.Teacher;

public class Test {

    public static void main(String [] args){
        Student student = new Student("rakhim", "ass");
        Teacher teacher = new Teacher("Artur", "c#");
        student.printInfo();
        teacher.printInfo();
    }
}
