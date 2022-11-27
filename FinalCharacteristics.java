//Same As Constant Characteristics in C++.

class Demo
{
    public int iNo1;
    public final int iNo2 = 11;  // C++ Syntax -> const int iNo2;  //<- Allowed in JAVA & Not Allowed in C and C++.
    public final int iNo3;       // C++ Syntax -> const int iNo3;                                  //<- Allowed in JAVA & Not Allowed in C++.

    public Demo()
    {
        iNo1 = 0;
        iNo3 = 21; 
    }

}


class FinalCharacteristics
{
    public static void main()
    {
        final int i = 51;       //Final Variable like constant variable in C++. C++ syntax-> const int i = 51;
        Demo obj = new Demo();
        obj.iNo1++;
        //obj.iNo2++;
        //obj.iNo3++;   //Generates ERROR ,because we can't change the value of final characteristics.
    }
}