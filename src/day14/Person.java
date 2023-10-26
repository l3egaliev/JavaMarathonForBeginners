package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  name +" "+ age;
    }

    static List<Person> parseFileToObjList() throws FileNotFoundException {
        List<Person> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("people.txt"));

            while (scanner.hasNextLine()) {
                String[] peopleString = scanner.nextLine().split("\n");
                for (String s : peopleString) {
                    String[] p = s.split(" ");
                    String name = p[0];
                    int age = Integer.parseInt(p[1]);
                    if (age < 0){
                        throw new NumberFormatException();
                    }
                    people.add(new Person(name, age));

                }
            }
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
            throw new FileNotFoundException();
        }catch (NumberFormatException ex){
            System.out.println("Некорректный входной файл");
            throw new NumberFormatException();
        }
        return people;

    }


    public static void main(String[] args) throws FileNotFoundException, NumberFormatException {
        Person person = parseFileToObjList().get(0);
        System.out.println(person.getAge());
    }
}
