import java.net.*;

public class p_10URLclass {

    public static void main(String[] args) throws Exception {
        URL u = new URL("https://sitcoe.ac.in/");
        System.out.println(u.getPort());
        System.out.println(u.getHost());
        System.out.println(u.getFile());
        System.out.println(u.getProtocol());
    }
}
