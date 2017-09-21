/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Pravien
 */

// this methos i used to count the number of urls in Q1, so that we dont have to wait 10 seconds everytime.
public class CountNumbers
{
    
    private static int amountOfNumber = 0;

    public CountNumbers()
    {
    }

    
    public CountNumbers(int amountOfNumber)
    {
        this.amountOfNumber = amountOfNumber;
    }
    
    public synchronized void decrease (){
        amountOfNumber--;
    }

    public static int getAmountOfNumber()
    {
        return amountOfNumber;
    }

    public static void setAmountOfNumber(int amountOfNumber)
    {
        CountNumbers.amountOfNumber = amountOfNumber;
    }

    
    
}
