import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        final Socket clientSocket;
        final BufferedReader in;
        final PrintWriter out;
        final Scanner sc = new Scanner(System.in);

        try {
            clientSocket = new Socket("localhost", 5000);
            out = new PrintWriter(clientSocket.getOutputStream());
            in = new BufferedReader(new java.io.InputStreamReader(clientSocket.getInputStream()));
            Thread sender = new Thread(new Runnable() {
                @Override
                public void run() {
                    while(true){
                        String msg = sc.nextLine();
                        out.println(msg);
                        out.flush();
                    }
                }
            });
            sender.start();

            Thread receiver = new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        String msg = in.readLine();
                        while (msg != null) {
                            System.out.println("Server : " + msg);
                            msg = in.readLine();
                        }
                        
                        System.out.println("Server Out of Service");
                        out.close();
                        clientSocket.close();
                    } catch(IOException e){
                        e.printStackTrace();
                    }
                }
            });
            receiver.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}