class JaggedArray
{
    public static void main(String Arg[])
    {
        int Arr[][] = {{10,20},{30,40,50,60},{70,80,90}};

        System.out.println(Arr.length);     //3
        System.out.println(Arr[0].length);  //2
        System.out.println(Arr[1].length);  //4
        System.out.println(Arr[2].length);  //3
        System.out.println(Arr[0][1]);      //20
        System.out.println(Arr[0][0]);      //10
        System.out.println(Arr[1][2]);      //50
        System.out.println(Arr[2][1]);      //80
        System.out.println(Arr[1][3]);      //60
        System.out.println(Arr[2][2]);      //90

        
    }
}