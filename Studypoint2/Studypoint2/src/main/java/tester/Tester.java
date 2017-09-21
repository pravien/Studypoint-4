package tester;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pravien
 */
public class Tester
{
    
    public Tester (){
        
    }
    
    
    public List<Group> fetchData ()throws InterruptedException, ExecutionException
    {
        List<Future<Document>> furtuelist = new ArrayList();
        List<String> urls = new ArrayList();
        List<Group> groups = new ArrayList();

        urls.add("http://www.alfen.me/CA1/");
        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i = 0; i < urls.size(); i++)
        {
            String url = urls.get(i);
            Callable<Document> k = ()
                    -> 
                    {
                        Document doc = null;
                        return doc = Jsoup.connect(url).get();
            };
            furtuelist.add(es.submit(k));

        }
        es.shutdown();
        for (int j = 0; j < furtuelist.size(); j++)
        {
            String authors = furtuelist.get(j).get().select("div#authors").text();
            String classs = furtuelist.get(j).get().select("div#class").text();
            String group = furtuelist.get(j).get().select("div#group").text();
            groups.add(new Group(authors, classs, group));

        }
        
        return groups;
        
    }

}
