package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1.txt");
        PrintWriter pw = new PrintWriter(file1);
        Random random = new Random();
        for (int i = 0; i < 1000; i++){
            pw.println(random.nextInt(0, 100));
        }

        pw.close();
        Scanner scanner = new Scanner(file1);
        File file2 = new File("file2.txt");
        PrintWriter writer = new PrintWriter(file2);
        int counter = 0;
        int sum = 0;
        while(scanner.hasNextLine()){
            sum += Integer.parseInt(scanner.nextLine());
            counter++;
            if (counter == 20){
                writer.println(sum / 20.0);

                counter = 0;
                sum = 0;
            }


        }
        writer.close();


    }
}
