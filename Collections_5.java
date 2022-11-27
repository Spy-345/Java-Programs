import java.util.*;

class Collections_5
{
    public static void main(String arg[])
    {
       Vector <Float>aobj = new Vector<Float>();

       aobj.add(10.6f);
       aobj.add(20.7f);
       aobj.add(30.6f);
       aobj.add(40.6f);


       Iterator iobj = aobj.iterator();

       while(iobj.hasNext())
       {
        System.out.println(iobj.next());
       }

       System.out.println("Size of Vector is : " + aobj.size());

       aobj.clear();


    }
}