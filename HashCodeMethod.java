
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

class HashCodeMethod
{
    public static void main(String arg[])
    {
        int iNo = 10;
        Demo obj = new Demo(11, 21);

        System.out.println("Hashcode of the obj is : " + obj.hashCode());
        System.out.println("Hashcode of the obj is : " + iNo.integer().hashCode());// <- Generates error int can't be dereferenced.
    }
}