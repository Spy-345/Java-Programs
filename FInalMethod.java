class Base
{
    public void fun()   //Defination
    {
        System.out.println("Inside Base Fun");
    }
    public final void gun()      //Fianal Method (Can not Override This Method, as it is Declared final Here)
    {
        System.out.println("Inside Base Gun");
    }
}

class Derived extends Base
{
    public void fun()      //Overrided Method
    {
        System.out.println("Inside Derived  Fun");
    }
    // public void gun()   //  can't able to write this gun defination as it is declared final in base.
    // {
    //     System.out.println("Inside Derived Gun");
    // }
}


class FinalMethod
{
    public static void main(String arr[])
    {
        Base obj = new Base(); 
        Base obj1 = new Derived();  //Upcasting
        obj1.gun();

    }
}