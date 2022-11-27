class StaticDemo
{
    
        public static void main(String arg[])
       {
        
        System.out.println("Inside Main Function");
        System.out.println("Value of Static No3 :" + Demo.No3); //C++ Syntax -> Demo::No3
        System.out.println("Value of Static No4 :" + Demo.No4); //C++ Syntax -> Demo::No4
        Demo.gun();  //C++ Syntax -> Demo::gun();

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        obj1.fun();
       }
       static
        {
            System.out.println("Inside Static Block Of Static Demo Which Contains main Function.");
        }
        public StaticDemo()
        {
            System.out.println("Inside the constructor of Static Demo.");
        }
}
class Demo
{
    public int No1;   //Non-Static Characteristic
    public int No2;   //Non-Static Characteristic
    public static int No3;//Static Characteristic
    public static int No4;//Static Characteristic

    public Demo()     //Constructor
    {
        System.out.println("inside Constructor :");
        No1 = 11;
        No2 = 21;
    }
    static      //static Block
    {
        System.out.println("inside Static block :");
        No3 = 51;
        No4 = 101;

    }
    public void fun()
    {
        //This non-static method can access static as well as non-static characteristics.
        System.out.println("Inside Non Static Method fun.");
        System.out.println("Value of No1 :" + this.No1); //C++ Syntax -> this->No1.
        System.out.println("Value of No2 :" + this.No2); //C++ Syntax -> this->No1.
        System.out.println("Value of No3 :" + this.No3);
        System.out.println("Value of No4 :" + this.No4);
    }
    public static void gun()
    {
        //This Static Method can only access Static charcteristics and use of 'this.' keyword is not allowed here.
        System.out.println("Inside static Method gun.");
        // System.out.println("Value of No1 :" + No1); 
        // System.out.println("Value of No2 :" + No2);
        System.out.println("Value of No3 :" + No3);
        System.out.println("Value of No4 :" + No4);
    }
    
}