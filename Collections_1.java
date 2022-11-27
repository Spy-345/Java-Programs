import java.util.*;

public class Collections_1 
{
    public static void main(String Arg[])
    {
        LinkedList<Integer> lobj = new LinkedList<Integer>(); //Creation of Linked List.

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);
        lobj.add(111);

        System.out.println("Elements of linked List : " + lobj);

        lobj.addFirst(1);
        System.out.println("Elements of linked List : " + lobj);

        lobj.addLast(121);
        System.out.println("Elements of linked List : " + lobj);

        Iterator iobj = lobj.iterator();
        System.out.println("Data Using Iterator is : ");
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        if(lobj.contains(121))
        {
            System.out.println("121 Is Present In The list");
        }
        else
        {
            System.out.println("121 Is Not Present In The list");

        }

        lobj.remove();
        System.out.println("Elements of linked List : " + lobj);

        lobj.remove(0);
        System.out.println("Elements of linked List : " + lobj);
        
        System.out.println("Number of Elements of linked List : " + lobj.size());

        lobj.set(1, 500);
        System.out.println("Elements of linked List : " + lobj);
        
        lobj.clear();
        System.out.println("Elements of linked List : " + lobj);

    }
    
}
