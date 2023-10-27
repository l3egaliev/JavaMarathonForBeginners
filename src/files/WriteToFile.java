package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("fileToWrite.txt");
        PrintWriter pw =  new PrintWriter(file);
        pw.println("Hello");
        pw.println("World!");

        pw.close();
    }
}
