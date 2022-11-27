import java.io.*;

class BufferedInput
{
    public static void main(String arg[])
     {
    //     InputStreamReader iobj = new InputStreamReader(System.in);  //Analogy -> Pani pipe ne badlit gheun vaparane 
    //     BufferedReader bobj = new BufferedReader(iobj);             //Badli act as buffer between panyacha null ani user

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        String Name = null;
        int Age = 0;
        float Marks = 0.0f;
       
        //By use of BufferedReader we get CheckedException by the compiler

        try
        {
            System.out.println("Enter your Name : ");
            Name = bobj.readLine();

            System.out.println("Enter Your age : ");
            Age = Integer.parseInt(bobj.readLine());    //Here Integer is Wrapper class and parseInt is static method of Integer class as we are calling it by using class name.

            System.out.println("Enter Your Marks : ");
            Marks = Float.parseFloat(bobj.readLine());  //Here we are accepting string and converting it into float.
        }
        catch(IOException obj)
        {

        }
            System.out.println("Name :" + Name);
            System.out.println("Age :" + Age);
            System.out.println("Marks :" + Marks);
    }
}