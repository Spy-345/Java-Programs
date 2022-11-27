import java.util.*;

class Book
{
    public String Name;
    public int Price;

    public Book(String s, int i)
    {
        this.Name = s;
        this.Price = i;

    }

    public void Display()
    {
        System.out.println("Book Name :" + this.Name + "  " + "Price :" + this.Price);
    }
}



class Collections_3
{
    public static void main(String arg[])
    {
        LinkedList <Book> lobj = new LinkedList<Book>();

        lobj.add(new Book("Let us C", 400));  //Directly Passing Object.
        lobj.add(new Book("C++ Programming", 580));
        lobj.add(new Book("Data Structure", 980));
        lobj.add(new Book("Angular Web Dev.", 790));

        Iterator iobj = lobj.iterator();
        Book bref = null; //To store the object 

        System.out.println("Elements Of Linked List Are :");
        while(iobj.hasNext())
        {
            bref = (Book)iobj.next();
            bref.Display();
        }

        lobj.clear();
    }
}