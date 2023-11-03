package files.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadArrays {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("people2.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
//        int counter = ois.readInt();
//        Person [] people = new Person[counter];
//        for (int i = 0; i < counter; i++){
//            people[i] = (Person)ois.readObject();
//        }
        Person [] people = (Person[]) ois.readObject();
        
        System.out.println(Arrays.toString(people));

    }
}
