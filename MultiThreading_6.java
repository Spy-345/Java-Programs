//extends Thread

//join() method in Thread

//Priority Of the Threads

class Demo extends Thread
{
    public void run()
    {
        int i = 0;

        try
        {
            for(i = 1;i <= 10 ;i++)
            {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                Thread.sleep(250);
            }
        }
        catch(InterruptedException obj)
        {}
    }
}
class MultiThreading_6
{
    public static void main(String arr[]) throws InterruptedException
    {
        System.out.println("Inside Main method.");

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setName("First");
        t2.setName("Second");

        System.out.println("Priority of The main Thread : " + Thread.currentThread().getPriority());
        System.out.println("Priority of The Thread t1 : " + t1.getPriority());
        System.out.println("Priority of The Thread t2 : " + t2.getPriority());

        t1.setPriority(10);
        t2.setPriority(1);

        System.out.println("Priority of The Thread t1 : " + t1.getPriority());
        System.out.println("Priority of The Thread t2 : " + t2.getPriority());

        t1.start();
        t2.start();

        t1.join();
        t2.join();  //This join() function stops control at this line 

        System.out.println("End of the main");
    }
}