import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 6666);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        System.out.println("You:");
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();

        dout.writeUTF(msg);

        DataInputStream dis = new DataInputStream(s.getInputStream());
        String str = (String) dis.readUTF();
        System.out.println("Message from Server: " + str);

        dis.close();
        dout.flush();
        dout.close();
        s.close();
        sc.close();

    }
}
