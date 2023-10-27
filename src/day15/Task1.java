package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("files/shoes.txt");
        File fileOut = new File("files/out.txt");
        PrintWriter printWriter = new PrintWriter(fileOut);
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            String [] s = scanner.nextLine().split(";");
            if (Integer.parseInt(s[1]) == 0){
                printWriter.println(s[0]+", "+s[1]);
            }

        }
        printWriter.close();



    }
}
