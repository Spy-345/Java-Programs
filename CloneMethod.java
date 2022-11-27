class Employee implements Cloneable
{
    public int Eid;
    public String Name;
    public int Salary;

    public Employee(int No, String str, int Value)
    {
        this.Eid = No;
        this.Name = str;
        this.Salary = Value;
    }

    public Object clone() throws CloneNotSupportedException 
    {
        return super.clone();  //call for clone method of Object class using super keyword.
    }

}

class CloneMethod
{
    public static void main(String arr[])
    {
        try
        {
                Employee eobj1 = new Employee(101, "Rahul", 11000);
                Employee eobj2 = (Employee)eobj1.clone();

                System.out.println("Name Of first Employee : " + eobj1.Name);
                System.out.println("Name Of second Employee : " + eobj2.Name);

                System.out.println("Salary of First employee : " + eobj1.Salary);
                System.out.println("Salary of second employee : " + eobj2.Salary);

                eobj1.Name = "Sagar";

                System.out.println("Name Of first Employee : " + eobj1.Name);
                System.out.println("Name Of second Employee : " + eobj2.Name);
        }
        catch(CloneNotSupportedException obj)
        {}
    }
}