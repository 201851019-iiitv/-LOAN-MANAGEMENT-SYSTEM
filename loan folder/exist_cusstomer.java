import java.awt.Container;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class exist_cusstomer {
   private  JLabel l3;
	  private  JLabel l1;
	   private JTextField t2 ;
	 private  JPasswordField p;
	 private Container c; 
	 private JButton b;
	 private JLabel l4; 

	exist_cusstomer(){
	JFrame f = new JFrame("exist customer");
	
		   l1 = new JLabel("username");
	        l1.setBounds(100,100,100,40);
	        f.add(l1);
	         t2 = new JTextField();
	        t2.setBounds(220,100,100,40);
	        f.add(t2);
	        
	        
	        l3 = new JLabel("password");
	        l3.setBounds(100,150,100,40);
	        f.add(l3);
	         p = new JPasswordField();
	        p.setBounds(220,150,100,40);
	        f.add(p);
	        
		
	        b = new JButton("Login");
	        b.setBounds(155,240,80,30);
	        f.add(b);
	        
	        l4 = new JLabel();
	        l4.setBounds(140,280,150,30);
	        f.add(l4);
	        
	        
	        
	        
	        b.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		l4.setText("login succesfully");
	        		//ob.displayObjects();
	        	MyObjectFileStore.validation(t2.getText(),p.getText());
	        	}
	        });
	        
	        
	        
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
		
				
 }
}
