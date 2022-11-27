import java.util.*;

class AgeInvalidException extends Exception
{
    public AgeInvalidException(String str)
    {
        super(str);
    }
}

class UserDefinedException
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int iAge = sobj.nextInt();

        try
        {
            if(iAge < 15)
            {

                AgeInvalidException aobj = new AgeInvalidException("Your Age is Less than 15.");
                throw aobj;
                //throw new AgeInvalidException("Your Age is Less Than 15.")
            }
            else
            {
                System.out.println("Age is valid.");
            }
        }
        catch(AgeInvalidException obj)
        {
            System.out.println(obj);
        }
    }
}