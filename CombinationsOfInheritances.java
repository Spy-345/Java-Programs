//Case 1 - Single Level
class Demo
{

}

class Hello extends Demo
{

}

//Case 2 - Multi Level
class Demo
{

}
class Hello extends Demo
{

}
class marvellous extends Hello
{

}

//Case 3 - Hierarchial

class Demo
{

}
class Hello extends Demo
{

}
class Marvellous extends Demo
{

}

//Case 4 - Multiple (Not Allowed in Java to avoid ambiguity of same name characteristics and methods)


class Demo
{

    int i;
    fun();
}
class Hello 
{
    int i;
    fun();  //This can cause problem.
}
class Marvellous extends Demo, Hello
{

}

//Case 5 - One Class Can Implement one  Interfaces


interface Hello 
{

}
class Marvellous implements Hello
{

}

//Case 6 - One class Can Implements Multiple Interfaces

interface Demo
{

}
interface Hello 
{

}
class Marvellous implements Demo, Hello
{

}

//Case 7 - One Class can extends one class only and multiple interfaces

interface Demo
{
}
interface Hello 
{
}
class Demo1
{
}
class Marvellous extends Demo1 implements Demo, Hello
{
}

//Case 8 - One Interface Can Extends the another Interface(only one)

interface Demo
{

}
interface Hello extends Demo
{
    
}