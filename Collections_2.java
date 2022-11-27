import java.util.*;

public class Collections_2
{
    public static void main(String Arg[])
    {
        LinkedList<String> lobj = new LinkedList<String>(); //Creation of Linked List.

        lobj.add("Hi");
        lobj.add("How");
        lobj.add("Are");
        lobj.add("You");
        lobj.add("?");

        System.out.println("Elements of linked List : " + lobj);

        lobj.addFirst("Shivam");
        System.out.println("Elements of linked List : " + lobj);

        lobj.addLast("I am Fine.");
        System.out.println("Elements of linked List : " + lobj);

        Iterator iobj = lobj.iterator();
        System.out.println("Data Using Iterator is : ");
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        if(lobj.contains("Shivam"))
        {
            System.out.println("Shivam Is Present In The list");
        }
        else
        {
            System.out.println("Shivam Is Not Present In The list");

        }

        lobj.remove();
        System.out.println("Elements of linked List : " + lobj);

        lobj.remove(0);
        System.out.println("Elements of linked List : " + lobj);
        
        System.out.println("Number of Elements of linked List : " + lobj.size());

        lobj.set(1, "Where");
        System.out.println("Elements of linked List : " + lobj);
        
        lobj.clear();
        System.out.println("Elements of linked List : " + lobj);

    }
    
}
