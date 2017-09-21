
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
public class Producer extends Thread
{
    ArrayBlockingQueue<Long> s1;
    ArrayBlockingQueue<Long> s2;

    public Producer(ArrayBlockingQueue<Long> s1, ArrayBlockingQueue<Long> s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }
    
   public void run(){
      boolean moreNumbers = true;
      Long number;
      try{
      while(moreNumbers){
          
        number = s1.poll(); 
          
        if(number == null){
            moreNumbers = false;
        }
        else{  
            long fib = fib(number);
            System.out.println("fib number: "+fib);
           s2.put(fib);
        }
      }
      }
      catch(InterruptedException e){
          
      }
   } 
   
   public synchronized long fib(long n){
       if((n == 0) || (n == 1)){
           return n;
       }
       else{
           return fib(n-1) + fib(n-2);
       }
   }
    
}
