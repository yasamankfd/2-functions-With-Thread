class Thread1 implements Runnable {
    Thread t;
    public  Thread1()
    {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run()
    {
        int i = 0;
        while(true)
        {
            try{
                Thread.sleep(120);
                if(i%2==0)
                {
                    System.out.print(0);
                }
            }catch (Exception e) { }

            i++;
        }
    }

}
class Thread2 implements Runnable{
    Thread t;
    public Thread2()
    {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run()
    {
        int i = 0;
        while(true)
        {
            try{
                Thread.sleep(120);
                if(i%2==1)
                {
                    System.out.print(1);
                }
                if(i%30==0)
                {
                    System.out.println("");
                }
            }catch (Exception e) { }
            i++;
        }
    }

}

public class Main  {

    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

    }
}
