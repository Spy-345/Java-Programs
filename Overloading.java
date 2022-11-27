import java.lang.*;  //Default package for every program of java (No need to import)
// This java package is by default for every java program, it need not be imported in program.
class Demo 
{
    public void fun()
    {
        System.out.println("Inside Fun Without Parameters.");
    }
    public void fun(int iNo)
    {
        System.out.println("Inside Fun With One Parameter.");
    }
    public void fun(int iNo1, int iNo2)
    {
        System.out.println("Inside Fun With Two integer Parameters.");
    }
    public void fun(double d)
    {
        System.out.println("Inside Fun with one Double Parameter.");
    }
}
class Overloading
{
    public static void main(String arr[])
    {
        Demo obj = new Demo();
        obj.fun();
        obj.fun(11);
        obj.fun(10,20);
        obj.fun(3.14);

    }
}