import java.util.*;

class Collections_6
{
    public static void main(String arg[])
    {
      
        Stack <Character>sobj = new Stack<Character>();  //Creation of Stack

        sobj.push('a');
        sobj.push('b');
        sobj.push('c');
        sobj.push('d');
        sobj.push('e');

        System.out.println("Elements Of Stack : " + sobj);

        System.out.println("Poped Element Of Stack : " + sobj.pop());

        System.out.println("Elements Of Stack : " + sobj);


    }
}