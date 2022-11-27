// Interface is the concept which is used to only hold the static final characteristics and abstract methods in it.
interface Circle
{
    float PI = 3.14f;  //It is Internally Defined as -> public static final float PI = 3.14f;

    float Area(float Radius);          //It is Internally Defined as -> public abstract float Area(float Radius);
    float Circumference(float Radius); //It is Internally Defined as -> public abstract float Circumference(float Radius);
}
class Marvellous implements Circle
{
    public float Area(float Radius)
    {
        return PI * Radius * Radius;
    }
    public float Circumference(float Radius)
    {
        return 2 * PI * Radius;
    }
}

class InterfaceInJava
{
    public static void main(String Arr[])
    {
        System.out.println("Value of PI is : " + Circle.PI);  // To Demonstrate public and Static 
        // Circle.PI = 7.21f;
        

    }
}



