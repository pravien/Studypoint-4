
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pravien
 */
public class tester
{
    
    
    public static void main(String[] args)
    {
      ArrayBlockingQueue<Long> s1 = new ArrayBlockingQueue(8);
      ArrayBlockingQueue<Long> s2 = new ArrayBlockingQueue(40);
      s1.add(4l);
      s1.add(5l);
      s1.add(8l);
      s1.add(12l);
      s1.add(21l);
      s1.add(22l);
      s1.add(34l);
      s1.add(35l);
      CountNumbers countNumbers = new CountNumbers();
      countNumbers.setAmountOfNumber(s1.size());
      ExecutorService es = Executors.newCachedThreadPool();
      es.execute(new Producer(s1, s2));
      es.execute(new Producer(s1, s2));
      es.execute(new Producer(s1, s2));
      es.execute(new Producer(s1, s2));
      //consumer
      es.execute(new Consumer(s2,countNumbers));
      es.shutdown();
      
    }
    
}
