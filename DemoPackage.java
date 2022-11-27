import java.util.*; //Inbuild Package.

import Marvellous.Arithmatic;  //User Defined Package.

import Marvellous.PPA.LoopForPackage; //User Defined Package.

//We have imported Arithmatic class from Marvellous Package.

class DemoPackage
{
    public static void main(String arr[])
    {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First NUmber :");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number :");
        int iNo2 = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iNo1, iNo2);

        int iResult = aobj.Addition();
        System.out.println("Addition is : " + iResult);

        iResult = aobj.Substraction();
        System.out.println("Substraction is : " + iResult);

        LoopForPackage lobj = new LoopForPackage();
        lobj.Display();

    }


}