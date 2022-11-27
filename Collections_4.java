import java.util.*;

class Collections_4
{
    public static void main(String arg[])
    {
       ArrayList <Float> aobj = new ArrayList<Float>();

       aobj.add(10.6f);
       aobj.add(20.7f);
       aobj.add(30.6f);
       aobj.add(40.6f);


       Iterator iobj = aobj.iterator();

       while(iobj.hasNext())
       {
        System.out.println(iobj.next());
       }

       System.out.println("Size of ArrayList is : " + aobj.size());

       aobj.clear();


    }
}