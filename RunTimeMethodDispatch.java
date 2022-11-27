class Base
{
    public void fun()   //Defination
    {
        System.out.println("Inside Base Fun");
    }
    public void gun() //Defination
    {
        System.out.println("Inside Base Gun");
    }
    public void sun()
    {
        System.out.println("Inside Base Sun");
    }
}

class Derived extends Base
{
      public void fun()   // Overrided Defination
    {
        System.out.println("Inside Derived fun");
    }
    public void gun()  // Overrided Defination
    {
        System.out.println("Inside Derived Gun");
    }
    public void run()  
    {
        System.out.println("Inside Derived Run");
    }

}

class RunTimeMethodDispatch
{
    public static void main(String arr[])
    {
        Base bobj = new Derived();    //Upcasting -> Base reference refering to the Derived Object.
        bobj.sun();  //Base sun
        bobj.fun();  //Derived fun
        bobj.gun();  //Derived gun
        // bobj.run();  //Error
    }
}
/*
        Base bobj1 = new Base();        //No Casting

        Derived dobj1 = new Derived();  // No Casting

        Base bobj2 = new Derived();     //Upcasting -> Small object pointing to large object.

        Derived dobj2 = new Base();     //Downcasting (Not Allowed) -> Large object pointing to small object.
*/