//extends Thread

//sleep Method of Thread class.

class Demo extends Thread
{
    public void run()
    {
        int i = 0;

        for(i = 1;i <= 100 ;i++)
        {
            try
            {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                Thread.sleep(500);  //This method get Checked Exception i.e. InterruptedException.
            }
            catch(InterruptedException obj)
            {

            }
        }
    }
}
class MultiThreading_4
{
    public static void main(String arr[])
    {
        System.out.println("Inside Main method.");

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setName("First");
        t2.setName("Second");

        t1.start();
        t2.start();
    }
}