/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everydayinfo;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author Diotr
 */
public class NewsForUK {

    String title = "";
   private MainWindow m;
    //MainWindow window = new MainWindow();
    
    public NewsForUK(MainWindow m) {
       this.m = m;   
    }

    
  
   public String getUkNewsTitle() throws IOException{
   ArrayList<String>newsUkArr = new ArrayList<String>();
   
           
   final String url = ("https://news.sky.com/");
        final Document document =  Jsoup.connect(url).get();
        
        for(Element row: document.select("div.sdc-site-tiles__group h3"))
        {
            
         title = row.select(".sdc-site-tile__headline").text();
         newsUkArr.add(title);
            printArray(newsUkArr);
            
            
            //System.out.println("Tu powinno działa");
   }
    m.getArrr(newsUkArr);
       System.out.println("Czy to działa?");
    return title;
       
}
   public void printArray(ArrayList<String>newsUkArrr){
       
        
       for(String temp: newsUkArrr){
       //System.out.println(temp);
           
       }
   }
  
}