class MultiDArray
{
    public static void main(String Arg[])
    {
        //Arr is Two Dimentional Array Which Contains 3 Single Dimentional Array
        //each containing 4 elements each of type integer.Same in C C++ 

        //Allowed In C & C++
        // int Arr[3][4] = {{10, 20, 30,40},{50, 60, 70, 80},{90, 100, 110, 120}};

        //Aloowed In Only java
        int Arr[][] = {{10, 20, 30,40},{50, 60, 70, 80},{90, 100, 110, 120}};

        System.out.println(Arr.length);     //3 

        System.out.println(Arr[0].length);  //4


    }
}