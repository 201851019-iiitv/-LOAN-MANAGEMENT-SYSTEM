import java.util.ArrayList;
import java.io.*;
public class Customer 
{
   Customer( String s1)
   {
       
       ArrayList<String> al=new ArrayList<String>();
       al.add(s1);
       System.out.println();
       
       try{
         FileOutputStream fos= new FileOutputStream("myfile3");
         ObjectOutputStream oos= new ObjectOutputStream(fos);
         oos.writeObject(al);
         oos.close();
         fos.close();
       }catch(IOException ioe){
            ioe.printStackTrace();
        }                                       
   }
}