import java.net.*;
import java.io.*;

public class Server
{
    public static void main(String Arr[]) throws Exception
    {
        // Step 1 : Connecting Server and Client
        System.out.println("Server Application is Running....");
        ServerSocket ss = new ServerSocket(2100); //Assigning port
        System.out.println("Server is running at port No 2100 and waiting for client request");

        Socket s = ss.accept();  //Server accepting request from client at port no 2100.
        System.out.println("Request of Client Get's Accepted.");


        // Step 2
        PrintStream ps = new PrintStream(s.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String str1, str2;

        while((str1 = br1.readLine()) != null)
        {
            System.out.println("Client says : " + str1);
            System.out.print("Enter Message for Client : ");
            str2 = br2.readLine();
            ps.println(str2);
        }
    }

}
