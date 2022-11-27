
final class Base   //Final Class
{

}
class Derived extends Base  //Generates ERROR we trying to inherit the final class which is not allowed.
{

}


class FinalClass
{
    public static void main(String arr[])
    {
        Derived dobj = new Derived();
    }
}