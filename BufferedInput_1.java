import java.io.*;

class BufferedInput
{
    public static void main(String arg[]) throws IOException // We are telling JVM That it can throws Exception.
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        String Name = null;
        int Age = 0;
        float Marks = 0.0f;

        
            System.out.println("Enter your Name : ");
            Name = bobj.readLine();

            System.out.println("Enter Your age : ");
            Age = Integer.parseInt(bobj.readLine());

            System.out.println("Enter Your Marks : ");
            Marks = Float.parseFloat(bobj.readLine());
        
            System.out.println("Name :" + Name);
            System.out.println("Age :" + Age);
            System.out.println("Marks :" + Marks);
    }
}