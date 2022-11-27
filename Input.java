import java.util.*; //<- Scanner function is defined in util class inside system class of java class
// import java.util.Scanner; <- only imports Scanner function from util
class Input
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0;
        int iNo2 = 0;
        int iAns = 0;
        String str = " adjdfkjf asdf faf";

        System.out.println("Enter First Number : ");
        iNo1 = sobj.nextInt();  

        System.out.println("Enter Second Number : ");
        iNo2 = sobj.nextInt();

        iAns = iNo1 + iNo2;

        System.out.println("Enter The String.");
        str = sobj.nextLine();

        System.out.println("Addition is : " + iAns);
        System.out.println("You hava Entered : " + str);


    }
}