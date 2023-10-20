package day9.task1;

public class Student extends Human{
    private String group;

    public Student(String name, String group) {
        super(name);
        this.group = group;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Это студент с именем "+super.getName()+" Его группа "+this.group);
    }
}
