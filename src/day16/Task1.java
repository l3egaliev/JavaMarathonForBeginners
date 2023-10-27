/**
 * Реализовать программу, которая на вход принимает txt файл с целыми числами
 * (можно использовать файл из задания 1 дня 14) и в качестве ответа выводит в
 * консоль среднее арифметическое этих чисел.
 * Ответ будет являться вещественным числом. В консоль необходимо вывести полную
 * запись вещественного числа (со всеми знаками после запятой) и сокращенную запись
 * (с 3 знаками после запятой).
 */


package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double result = 0.0;
        while(scanner.hasNextLine()){
            String [] nums = scanner.nextLine().split(" ");
            double sum = 0.0;
            for (String s:nums){
                sum += Double.parseDouble(s);
            }
            result = sum / nums.length;
        }
        DecimalFormat df = new DecimalFormat(".###");
        System.out.println(result+"---->"+df.format(result));

    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        printResult(file);
    }
}
