package Marvellous.PPA;

public class LoopForPackage
{
    public void Display()
    {
        int Arr[] = new int[4];  //Creating Array

        Arr[0] = 10;
        Arr[1] = 20;
        Arr[2] = 30;
        Arr[3] = 40;

        System.out.println("Elements of Array are : ");

        for(int iCnt = 0;iCnt < Arr.length;iCnt++)  //Printing the elements of array
        {
            System.out.println(Arr[iCnt]);
        }

    }
}