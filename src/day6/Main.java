package day6;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Максим Иванов", "математика");
        Student student = new Student("Петров Петр");
        System.out.println(teacher.evaluate(student));
    }

}
