/*
class Object <- Inbuilt Class 'Object' which compulsory given to every program in java known as Parent class For all classes in program 
{
    //Code(Different Methods,already given by java)
}
# this code has single level inheritance but, by including Object class it is Multi level inheritance.
*/
class Base
{
    public int A,B;
    public Base()    //Default Constructor.
    {
        System.out.println("Inside Base Constructor");
        this.A = 10;
        this.B = 20;

    }
    public void fun()   //Defination
    {
        System.out.println("Inside Base Fun");
    }
    public void gun() //Defination
    {
        System.out.println("Inside Base Gun");
    }
    public void fun(int No) //Over Loaded Defination
    {
        System.out.println("Inside Base Fun with one integer");
    }
}

class Derived extends Base   //In C++ -> Class Derived : public Base.
{
    public int X,Y;

    public Derived()
    {
        System.out.println("Inside Derived Constructor.");
        this.X = 30;
        this.Y = 40;
    }

    public void sun()   //Defination
    {
        System.out.println("Inside Derived Sun");
    }
    public void gun()  // Overrided Defination
    {
        System.out.println("Inside Derived Gun");
    }

}

class Single
{
    public static void main(String Arr[])
    {

        // Base bobj1 = new Base();        //No Casting
        // Derived dobj1 = new Derived();  // No Casting
        Base bobj2 = new Derived();     //Upcasting -> Small object pointing to large object.
        // Derived dobj2 = new Base();     //Downcasting (Not Allowed) -> Large object pointing to small object.

        bobj2.fun();    //Base Fun
        bobj2.fun(11);  //Base Fun
        bobj2.gun();    //?
        bobj2.sun();   //Derived Sun

    }
}