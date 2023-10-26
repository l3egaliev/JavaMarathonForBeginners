package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    static Scanner scanner;


    public static void printSumDigits(File file) throws FileNotFoundException {
        scanner = new Scanner(file);
        int[] nums = new int[10];
        int sum = 0;
        while(scanner.hasNextLine()){
            String text = scanner.nextLine();
            try {
            String [] numbers = text.split(" ");

                for(int i = 0; i<numbers.length; i++){
                    nums[i] = Integer.parseInt(numbers[i]);
                    sum += nums[i];
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Некорректный входной файл");
                return;
            }
            System.out.println(sum);
        }


    }




    public static void main(String[] args) {
        File file = new File("test.txt");

       try {
           printSumDigits(file);
       }catch(FileNotFoundException e){
           System.out.println("Файл не найден");
       }
    }
}
