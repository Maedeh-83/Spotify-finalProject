import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        final int PORT = 8888;
        try {
            Socket s = new Socket("localhost", PORT);
            InputStream instream = s.getInputStream();
            OutputStream outstream = s.getOutputStream();
            Scanner in = new Scanner(instream);
            PrintWriter out = new PrintWriter(outstream);

            // درخواست ها به این شکل باید باشن:
            /*  String command = "DEPOSIT 3 1000";
            System.out.println("Sending: " + command);
            out.print(command + "\n");
            out.flush();
            String response = in.nextLine();
            System.out.println("Receiving: " + response);
            */
        }
        catch (Exception e) {}
    }
}

    
