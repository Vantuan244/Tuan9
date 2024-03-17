// Client.java
package chatclient.bai1;

import java.io.ObjectInputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Student student = (Student) ois.readObject();
            System.out.println("Da nhan duoc doi tuong " + student.getName() + " tuoi " + student.getAge());
            ois.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
