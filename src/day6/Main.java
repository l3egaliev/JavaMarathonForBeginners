package day6;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("������ ������", "����������");
        Student student = new Student("������ ����");
        System.out.println(teacher.evaluate(student));
    }

}
