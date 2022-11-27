class Demo
{
    public int No1;
    public int No2;

    public Demo(int a, int b)
    {
        No1 = a;
        No2 = b;
    }
}

class EqualsMethod
{
    public static void main(String arg[])
    {
        String s1 = "hello";
        String s2 = "hello";

        System.out.println("Hashcode of s1 : " + s1.hashCode());  //Hashcode - 1001

        System.out.println("Hashcode of s2 : " + s2.hashCode());  //Hashcode - 1001

        if(s1.equals(s2))   //if("hello" == "hello") <- It compares data in the objects.
        {
            System.out.println("Objects are Same.");
        }
        else
        {
            System.out.println("Objects are Different.");
        }

        if(s1 == s2) //if(1001 == 1001) <- It compares hashcode of the objects.
        {
            System.out.println("Objects are Same.");
        }
        else
        {
            System.out.println("Objects are Different.");
        }
    }
} 