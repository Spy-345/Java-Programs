

class Loops
{
    public static void main(String Arg[])
    {
        int Arr[] = {10, 20, 30, 40};
        int iCnt = 0;

        System.out.println("Traversal Of Array Using For loop :");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)   //Same In C, C++,Java.
        {
            System.out.println(Arr[iCnt]);
        }

        System.out.println("Traversal Of array using While Loop :");
        iCnt = 0;
        while(iCnt < Arr.length)                //Same In C, C++,Java.
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        }

        System.out.println("Traversal Of Array Using Do While Loop :");
        iCnt = 0;
        do                                  //Same In C, C++,Java.
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        }while(iCnt < Arr.length);

        System.out.println("Traversal Of Array using for-each Loop: ");
        for(int iNo : Arr)                  //Only in Java.
        {
            System.out.println(iNo);
        }
    }
}