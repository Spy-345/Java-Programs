import java.util.*;

class ExceptionHandeling_1
{
    public static void main(String Arg[])
    {
        Scanner obj = new Scanner(System.in);

        int Arr[] = {10,20,30,40};

        System.out.println("Enter The Size of Array : ");
        int i = obj.nextInt();

        System.out.println("Data at the specified index : " + Arr[i]);
    }
}