import java.net.*;
import java.io.*;

public class Client
{
    public static void main(String arr[]) throws Exception
    {
        // Step 1 : Connecting Server and Client
        System.out.println("Client Application is Running....");

        Socket s = new Socket("localhost", 2100);
        System.out.println("Client is waiting for server to acccept the request");
        

        //Step 2
        PrintStream ps = new PrintStream(s.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String str1, str2;

        while(!(str1 = br2.readLine()).equals("end"))
        {
            ps.println(str1);
            System.out.println("Enter Message For server : ");
            str2 = br1.readLine();
            System.out.println("Server Says : " + str2);

        }
    }
}