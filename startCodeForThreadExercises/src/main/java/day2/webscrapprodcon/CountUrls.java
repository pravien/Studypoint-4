/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2.webscrapprodcon;

/**
 *
 * @author Pravien
 */

// this methos i used to count the number of urls in Q1, so that we dont have to wait 10 seconds everytime.
public class CountUrls
{
    
    private static int numberOfUrls = 0;

    public CountUrls(int numberOfUrls)
    {
        this.numberOfUrls = numberOfUrls;
    }
    
    public synchronized void decrease (){
        numberOfUrls--;
    }

    public static int getNumberOfUrls()
    {
        return numberOfUrls;
    }

    public static void setNumberOfUrls(int numberOfUrls)
    {
        CountUrls.numberOfUrls = numberOfUrls;
    }
    
}
