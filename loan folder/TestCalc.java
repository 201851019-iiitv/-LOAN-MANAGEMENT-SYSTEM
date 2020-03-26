/*
public class TestCalc {

} */

import javax.swing.*; 




class TestCalc  {
   public static void main(String args[ ] )  // main method header
    {  // begin main method
      System.out.println("Loan Monthly Payment Program \n "); // display program title
      String strAmount, strIRate, strYears;        // declare variables to be entered by user as strings
      double amount, iRate, years, monPay, totalPay;   // declare variables to be used in the formula
      strAmount = 
          JOptionPane.showInputDialog(" Enter the amount of the Loan $: "); // enter amount as a string 
      strIRate = 
          JOptionPane.showInputDialog("Enter the % interest rate: "); // enter % interest as a string 
      strYears = 
          JOptionPane.showInputDialog("Enter the # of years: "); // enter years as a string 
      amount =  Double.parseDouble(strAmount); // convert the input string strAmount to number
      iRate = Double.parseDouble(strIRate); // convert the input string strIRate into a real number 
      years = Double.parseDouble(strYears); // convert the input string strYears into a real number
      System.out.println("Enter the amount of the Loan $: " + amount + "\n"); // echo input
      System.out.println("Enter the % interest rate: " + iRate +"\n");
      System.out.println("Enter the # of years: " + years +"\n"); 
      monPay = (amount * iRate / 1200) / 
                    ( 1 - Math.pow( 1 / ( 1 + iRate / 1200), 12 * years)) ;   // calculate payment                     
      monPay = (int)(monPay * 100 + 0.5 ) / 100.0;  // round distance to the nearest 1/100 
      totalPay = monPay * 12 * years; // calculate the total pay back for the loan
      totalPay = (int)(totalPay * 100 + 0.5 ) / 100.0;  // round total to the nearest 1/100 
      System.out.println("The monthly payment is : $" + monPay +"\n"); // display monthly payment
      System.out.println("The total amount paid is : $" + totalPay +"\n" ); // display total payment
      System.exit( 0 ); // exit the system to close all windows
   }  // end main method
} // end class