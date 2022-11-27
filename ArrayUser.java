import java.util.Scanner;

class ArrayUser
{
    public static void main(String Arg[])
    {
        int iCnt = 0;
        int iSum = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Size of Array : ");
        int iSize = sobj.nextInt();

        // int Arr[] = (int *)malloc(sizeof(int) * iSize); <- C syntax of dynamic memory allocation of array.
        int Arr[] = new int[iSize];

        System.out.println("Number Of Elements in Array are : " + Arr.length); //length is property gives size of Array.
        
        System.out.println("Enter The Elements of Array : ");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of Array are : ");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        System.out.println("Addition Of Elements of array is : " +iSum);

    }
}