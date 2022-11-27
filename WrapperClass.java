//Analogy ->  Chochlate and Wrapper(Eclairs)

class WrapperClass
{
    public static void main(String arg[])
    {
        int iNo = 11;

        Integer iobj = new Integer(iNo);   // Boxing - Converting Primitive to Wrapper 

        System.out.println(iNo);
        System.out.println(iobj);

        int x = iobj;            // Unboxing - Converting Wrapper to Primitive
        System.out.println(x);
    }
}