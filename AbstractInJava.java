// abstract class is class which contains 0 or more abstract method in it.
// We can't create the object of abstract class.
abstract class Arithmatic
{
    public int Addition(int iNo1, int iNo2)
    {
        return iNo1 + iNo2;
    }
   public abstract int Subtraction(int iNo1, int iNo2);
   //C++ Syntax -> virtual int Subtraction(int iNo1, int iNo2) = 0;
}
class Marvellous extends Arithmatic
{
    public int Subtraction(int iNo1, int iNo2)
    {
        return iNo1 - iNo2;
    }
} 


class AbstractInJava
{
    public static void main(String Arr[])
    {
        // Arithmatic aobj = new Arithmatic();  <- Not allowed we are trying to create object of abstract class
        Arithmatic aobj = new Marvellous();  //Upcasting (Base/Parent  class refering to Derived/Child Class)

        Marvellous mobj = new Marvellous();
        int iRet = 0;
        iRet = mobj.Addition(11,10);
        System.out.println("Addition is : " + iRet);

        iRet = mobj.Subtraction(11,10);
        System.out.println("Subtraction is : " + iRet);
        
    }
}