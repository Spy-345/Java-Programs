import java.util.*;

//Composition -> Allocating the one Class object to the Another Class as a Resource. OR
//            -> If an object contains the other object and the contained object cannot exist without the existence of that object, then it is called composition.

class Data
{
    public int Arr[];

    public Data(int size)
    {
        Arr = new int[size];
    }

    protected void finalize()
    {
        Arr = null;
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Numbers : ");
        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
}

class DemoEven extends Thread
{
    public Data dobj;  //Composition -> Creation of Data Class Reference InSide DemoEven.

    public DemoEven(Data obj)   //Data class Reference Receiving Data class Object, For Resources.
    {
        dobj = obj; // Allocating The Resource i.e. Arr through Data object(obj from main).
    }
    public void run()
    {
        for(int i = 0;i < dobj.Arr.length;i++)
        {
            if(dobj.Arr[i] % 2 == 0)
            {
                System.out.println("Even number is : " + dobj.Arr[i]);
            }
        }
    }
}
class DemoOdd extends Thread
{
    public Data dobj;   //Composition-> Creation of Data Class Reference InSide DemoOdd.
    public DemoOdd(Data obj)   //Data class Reference Receiving Data class Object, For Resources.
    {
        dobj = obj;  // Allocating The Resource i.e. Arr through Data object(obj from main).
    }
    public void run()
    {
        for(int i = 0;i < dobj.Arr.length;i++)
        {
            if(dobj.Arr[i] % 2 != 0)
            {
                System.out.println("Odd number is : " + dobj.Arr[i]);
            }
        }
    }
}

class MultiThreading_7
{
    public static void main(String arr[]) throws InterruptedException
    {
        Data obj = new Data(10);
        obj.Accept();

        DemoEven eobj = new DemoEven(obj);  //Passing the Data class Object to The DemoEven Class.
        DemoOdd oobj = new DemoOdd(obj);   //Passing the Data class Object to The DemoOdd Class.

        Thread t1 = new Thread(eobj);   //Passing the DemoEven Object To the Thread Class or Class Object i.e t1, Which accept this object inside reference of DemoEven Class.
        Thread t2 = new Thread(oobj);   //Passing the DemoOdd Object To the Thread Class or Class Object i.e t2, Which accept this object inside reference of DemoOdd Class.

        t1.start();  //Starting The Thread To find Even Numbers In Arr.
        t2.start();  //Starting The Thread To find Odd Numbers In Arr. -> These Two Threads Are Working on Arr Parallely. 

        t1.join();
        t2.join();
        
    }
}