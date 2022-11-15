/*
 * Programmer: Austin Goff 19004941
 * Program: Customer_Finance
 * Date: 8/28/2019
 * Description: Inheritance java program with user input
 */
package customer_finance;
import javax.swing.JOptionPane;

public class Customer_Finance {

    
    public static void main(String[] args) {
       Customer obj = new Customer(); //customer class
       obj.setCustomerName();
       obj.setContactNumber();
       obj.setProductPrice();
       obj.setNumberofMonths();
       
       Finance_Period object = new Finance_Period();  //Finane_Period class
       object.Calculate_Repayment();
       object.TotalDue();
    
       //display output
       JOptionPane.showMessageDialog(null, "Customer Name: " + obj.getCustomerName() + "\n" 
       + "Customer Contact: " + obj.getContactNumber() + "\n" + 
               "Product Amount: R" + obj.getProductPrice() + "\n" +
               "Repayment Months: " + obj.getNumberofMonths() + "\n" +
               "Monthly Repayment: R" + object.Calculate_Repayment() + "\n" +
               "Total Due: R" + object.TotalDue());
    }   
}
