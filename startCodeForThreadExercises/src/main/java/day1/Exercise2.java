/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author Pravien
 */
public class Exercise2
{
    public static void main(String[] args)
    {
        Even even  = new Even();
        
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++)
            {
                int k = even.next();
                if(k % 2 !=0){
                    System.out.println("t1 not even"); 
                }
                
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++)
            {
                int k = even.next();
                if(k % 2 !=0){
                   System.out.println("t2 not even"); 
                }
            }
        });
        t1.start();
        t2.start();
    }
}
