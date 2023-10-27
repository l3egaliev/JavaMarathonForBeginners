package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
   static Scanner scanner;

    public static List<String> parseFileToStringList(File file) throws FileNotFoundException {
        scanner  = new Scanner(file);
        List<String> people = new ArrayList<>();
        while(scanner.hasNextLine()){
            String person = scanner.nextLine();
            String[] list = person.split(" ");

            if (Integer.parseInt(list[1])<0){
                throw new NumberFormatException();
            }
            people.add(person);
        }

        return people;

    }

    public static void main(String[] args) {
        File file = new File("people.txt");
        List<String> people = new ArrayList<>();
        try {
            people = parseFileToStringList(file);
            System.out.println(people);
        }catch(FileNotFoundException e){
            System.out.println("Файл не найден");
        }
    }

}
