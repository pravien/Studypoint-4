package day1;


import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Pravien
 */
public class MainDay1
{
    private volatile static boolean  bValue = true;
    public static void main(String[] args) throws InterruptedException
    {
        
        Thread t1 = new Thread(() -> {
            long sum =0;
            for (int i = 1; i <= 1000000000; i++)
            {
                sum++;
                System.out.println(sum);
            }
        });
        Thread t2 = new Thread(() -> {
             for (int i = 1; i <= 5; i++)
            {
                System.out.println(i);
                 try
                 {
                     TimeUnit.SECONDS.sleep(2);
                 } catch (InterruptedException ex)
                 {
                     
                 }
            }
        });
        
        Thread t3 = new Thread(() -> {
            long i =10;
            while(bValue){
                System.out.println(i);
                i++;
                try
                {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException ex)
                {
                }
            }
        });
      
        t1.start();
        t2.start();
        t3.start();
        
        TimeUnit.SECONDS.sleep(10);
        bValue = false;
        
        
    }

}
