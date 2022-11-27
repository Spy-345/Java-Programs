
class Demo
{
    int Size;
    int Arr[];

    public Demo(int No)
    {
        System.out.println("Inside Constructor");
        Size = No;
        Arr = new int[Size];
    }

    protected void finalize()
    {
        System.out.println("Inside finalize method");
        Arr = null;
    }
}

class FinalizeMethod
{
    public static void main(String arg[])
    {
        Demo obj = new Demo(4);
        obj = null;
        System.gc();   // Explicit call to the garbage collector.
    }
}