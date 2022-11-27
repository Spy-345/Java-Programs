class Base
{
    public int A, B;
    public Base(int iNo1, int iNo2)   //Parameterised Constructor,But While creating object of Derived class compiler will first search 
    {                                 // Default constructor of base class which is not there, that's why we use super keyword in the Derived class constructor,
        this.A = iNo1;                // which transfers the control to this parametrised constructor of base class along with parameters.
        this.B = iNo2;
    }

    public void fun()
    {
        System.out.println("Inside Base Fun.");
        System.out.println("Value of A from fun method : " + this.A);
        System.out.println("Value of A from fun method : " + this.B);
    }
}

class Derived extends Base
{
    public int X, Y;
    public Derived(int iNo1, int iNo2, int iNo3, int iNo4)
    {
        super(iNo3, iNo4);   //(this line should be first) 1 Usecase of super keyword <- Transfers parameters to the parent class constructor
        this.X = iNo1;       // Call goes as Base(iNo3, iNo4)
        this.Y = iNo2;
    }

    public void gun()
    {
        System.out.println("Value of A from gun Method : "+ super.A); // 2 Usecase of super keyword <- This usecase fetch the characteristic of base class.
        super.fun();   // 3 Usecase of super keyword <- This usecase calls the fun() method of base class.
                        //Usecases 2 and 3 required when there is same name characteristics or method in both classes otherwise derived class can directly access the data from
    }
}

class SuperKeyword
{
    public static void main(String arr[])
    {
        Derived dobj = new Derived(11,21,51,101);
        dobj.gun();
    }
}