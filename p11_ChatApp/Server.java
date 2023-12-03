import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());

        String str = (String) dis.readUTF();
        System.out.println("Message from client: " + str);
        System.out.println("You:");
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF(msg);
        dout.flush();
        dout.close();
        ss.close();
        sc.close();

    }
}
