import java.util.*;

class ExceptionHandelingSolution
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0, iAns = 0;

        System.out.println("Enter First Number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
        iNo2 = sobj.nextInt();

        try
        {
            System.out.println("Inside try block");
            iAns = iNo1/iNo2;
            System.out.println("Division is : " + iAns);
        }

        catch(ArithmeticException obj)
        {
            System.out.println("Inside catch-1 block");
            System.out.println(obj);
        }
        catch(NullPointerException obj)
        {
            System.out.println("Inside catch-2 block");
            System.out.println(obj);
        }
        catch(Exception obj)
        {
            System.out.println("Inside catch-3 block");
            System.out.println(obj);
        }

        finally
        {
            System.out.println("Inside Finally Block.");
            sobj.close();
        }
        
    }
}