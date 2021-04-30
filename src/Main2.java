class Func1{
    public void run()
    {
        int i = 0;
        while(i<30)
        {
            try{
                Thread.sleep(63);
                if(i%2==0)
                {
                    System.out.print(0);
                }
            }catch (Exception e) { }
            i++;
        }
    }

}

class Func2{

    public void run()
    {
        int i = 0;
        while(i<30)
        {
            try{
                Thread.sleep(63);
                if(i%2==1)
                {
                    System.out.print(1);
                }
            }catch (Exception e) { }
            i++;
        }
        System.out.println("");
    }
}

public class Main2 {
    public static void main(String[] args) {

        Func1 f1 = new Func1();
        Func2 f2 = new Func2();
        int i = 0;
        while (true)
        {
            f1.run();
            f2.run();
        }
    }
}
