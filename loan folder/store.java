import java.io.*;
import java.util.ArrayList;
public class store 
{
    public static void main(String [] args)
    {
        ArrayList<String> name= new ArrayList<String>();
        ArrayList<String> add= new ArrayList<String>();
        ArrayList<String> mob= new ArrayList<String>();
        ArrayList<String> amount= new ArrayList<String>();
        try
        {
            FileInputStream fis = new FileInputStream("myfile");
            ObjectInputStream ois = new ObjectInputStream(fis);
            name = (ArrayList) ois.readObject();
            add = (ArrayList) ois.readObject();
            mob = (ArrayList) ois.readObject();
            amount = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
         }catch(IOException ioe){
             ioe.printStackTrace();
             return;
          }catch(ClassNotFoundException c){
             System.out.println("Class not found");
             c.printStackTrace();
             return;
          }
        for(String tmp: name){
            System.out.println(tmp);
        }
        for(String tmp: add){
            System.out.println(tmp);
        }
        for(String tmp: mob){
            System.out.println(tmp);
        }
        for(String tmp: amount){
            System.out.println(tmp);
        }


   }
}