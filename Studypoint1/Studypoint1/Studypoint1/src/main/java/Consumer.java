
import java.util.concurrent.ArrayBlockingQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pravien
 */
public class Consumer extends Thread
{

    private static long sum = 0;
    private ArrayBlockingQueue<Long> s2;
    private CountNumbers countNumbers;

    public Consumer(ArrayBlockingQueue<Long> s2, CountNumbers countNumbers)
    {
        this.s2 = s2;
        this.countNumbers = countNumbers;
    }

    public void run()
    {
        boolean moreNumbers = true;
        try
        {
            while (moreNumbers)
            {
                Long number = null;
                int numberCount = countNumbers.getAmountOfNumber();
                if (numberCount > 0)
                {
                    System.out.println("before: "+s2.toString());
                    number = s2.take();
                    System.out.println("after: "+s2.toString());
                    System.out.println("fibo: "+number);
                    sum+=number;
                    countNumbers.decrease();
                }else {
                    System.out.println("sum: "+sum);
                    moreNumbers=false;
                }
            }
        } catch (InterruptedException e)
        {

        }
    }

}
