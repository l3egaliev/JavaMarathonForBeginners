package files.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteArrays {
    public static void main(String[] args) throws IOException {
        Person [] people = {
                new Person(1, "Sara"),
                new Person(2, "Ronald"),
                new Person(3, "Jude")
        };
        FileOutputStream fos = new FileOutputStream("people2.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

//        oos.writeInt(people.length);
//        for(Person person: people){
//            oos.writeObject(person);
//        }
        oos.writeObject(people);
        oos.close();
        fos.close();
    }
}
