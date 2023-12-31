package files.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) throws IOException {
        Person person1 = new Person(1, "Ted");
        Person person2 = new Person(2, "Bob");

        FileOutputStream fos = new FileOutputStream("people.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(person1);
        oos.writeObject(person2);

        oos.close();

    }
}
