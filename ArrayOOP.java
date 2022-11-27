
import java.util.Scanner;

class ArrayX
{
    public int Arr[];
    public int iSize;

    public ArrayX(int No)
    {
        this.iSize = No;
        this.Arr = new int[iSize];
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Elements of Array : ");
        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of Array are : ");
        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

    }
    public int Addition()
    {
        int iSum = 0;
        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return iSum;
    }

}

class ArrayOOP
{
    public static void main(String arr[])
    {
        ArrayX aobj = new ArrayX(4);
        aobj.Accept();
        aobj.Display();

        int iRet = aobj.Addition();
        System.out.println("Addition is : " + iRet);

    }
}