package May;

import java.io.*;
import java.util.Date;

public class SerialTest {

    public void tryTestSerial() throws IOException {
        FileOutputStream fos=new FileOutputStream(new File("1.txt"));
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeInt(12345);
        oos.writeObject("Today");
        oos.writeObject(new Date());
        System.out.println("finish done work");
        fos.write(9999);
        oos.close();
        fos.close();

    }

    public static void main(String[] args) throws IOException {
        SerialTest serialTest = new SerialTest();
        serialTest.tryTestSerial();
    }
}
