import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.SwingUtilities;
public class MyObjectFileStore 
 {
	
 

  static  void p(String name,String mob,String add,String amount,String username,String password)
  { 
    Employee e1 = new Employee(name,mob,add,amount,username,password);
   storeObject(e1);
     // displayObjects();
    }
	public static  void storeObject(Employee emp){
		
		OutputStream ops = null;
		ObjectOutputStream objOps = null;
		try {
			ops = new FileOutputStream("MyEmpFile.txt");
			objOps = new ObjectOutputStream(ops);
			objOps.writeObject(emp);
			objOps.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try{
				if(objOps != null) objOps.close();
			} catch (Exception ex){
				
			}
		}
		
	}
	
	public  static void  displayObjects(){
		InputStream fileIs = null;
		ObjectInputStream objIs = null;
		try {
			fileIs = new FileInputStream("MyEmpFile.txt");
			objIs = new ObjectInputStream(fileIs);
			Employee emp = (Employee) objIs.readObject();
			System.out.println(emp);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(objIs != null) objIs.close();
			} catch (Exception ex){
				
			}
		}
		
	}
	public  static void validation(String username,String password)
	{
		InputStream fileIs = null;
		ObjectInputStream objIs = null;
		try {
			fileIs = new FileInputStream("MyEmpFile.txt");
			objIs = new ObjectInputStream(fileIs);
			Employee emp = (Employee) objIs.readObject();
			if(emp.getusername().equals(username) && emp.getpassword().equals(password))
			{
			System.out.println(emp);
			
			}
			Loans obj=new Loans();
			SwingUtilities.invokeLater(new Runnable() {
			            public void run() {
			                obj.createAndShowGUI();
			            }
			        }
			        );
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(objIs != null) objIs.close();
			} catch (Exception ex){
				
			}
		}
		
	}

	
}


class Employee implements Serializable{
	
	private String name;
	private String add;
	private String amount;
	private String mob;
	private String username;
	private String password;
	
	public Employee(String name,String mob, String add,String amount,String username,String password){
		this.name = name;
		this.add=add;
		this.amount=amount;
		this.mob=mob;
		this.username=mob;
		this.password=mob;
	}
	
	
	public String toString(){
		return "name :"+" "+name+"  "+"address"+" "+add+" "+"Loan_amount"+"  "+amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getadd() {
		return add;
	}

	public void setadd(String add) {
		this.add=add;
	}
	
	public String getamount() {
		return amount;
	}

	public void setamount(String amount) {
		this.amount = amount;
	}

	public String getmob() {
		return mob;
	}

	public void setmob(String mob) {
		this.mob = mob;
	}
	
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password= password;
	}
	
}