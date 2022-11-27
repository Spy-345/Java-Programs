class Maths
{
    public int iNo1;   //Characteristics
    public int iNo2;

    public Maths()     //Default Constructor
    {
        System.out.println("Inside Default constructor.");
        iNo1 = 0;
        iNo2 = 0;
    }
    public Maths(int a, int b)   //Parametrised Constructor
    {
        System.out.println("Inside Parameterised constructor.");
        iNo1 = a;
        iNo2 = b;
    }
    public int Addition()    //Behaviour
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;

        return iAns;
    }
    public int Subtraction()
    {
        int iAns = 0;
        iAns = iNo1 - iNo2;

        return iAns;
    }
    
}// End of Maths Class.

class Demo    //class Demo extends Object
{
    public static void main(String arr[])
    {
        System.out.println("Inside the main function.");

        Maths mobj1 = new Maths();
        Maths mobj2;                   //This is called as refernce creation for mobj2 object.
        mobj2 = new Maths(10, 11);     // Actual creation of object of Maths Class.

        int iRet = 0;
        iRet = mobj2.Addition();
        System.out.println("Addition is : " + iRet);

        iRet = mobj2.Subtraction();
        System.out.println("Subtraction is : " + iRet);
    }
}
