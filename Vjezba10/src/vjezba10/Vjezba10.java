package vjezba10;

import java.io.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;


public class Vjezba10 {

    public static void main(String[] args) {

       File file = new File("C:\\Javalearning\\Vjzeba10");
       if(file.exists())
       {
           System.out.println("Absolute path is:" + file.getAbsolutePath());
           System.out.println("File name is: " + file.getName());
           System.out.println("Free space: " + file.getFreeSpace()/1024/1024/1024);
           System.out.println("File size: " + file.length());
           
           Instant instantLastModified = Instant.ofEpochMilli(file.lastModified());
           LocalDateTime dateTimeLastModified = LocalDateTime.ofInstant(instantLastModified, ZoneId.systemDefault());
           System.out.println("Last modified: " + dateTimeLastModified);
       }
        
        
        
        
    }

}
