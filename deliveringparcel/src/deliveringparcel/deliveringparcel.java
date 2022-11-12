/*
 * Program: deliveringparcel
 * Programmer: Austin Goff
 * Date: 5/19/2019
 * Description: Program to calculate parcel delivery for Fast and Secure Logistics
 */
package deliveringparcel;
import javax.swing.JOptionPane;

public class deliveringparcel {
public static String strTown, strWeight, strDeliveryCompany; //declaring all string variables to be used throughout the program
public static int intPrice; //declaring int varaible to be used throughout program
public static double dblTotal, dblVAT; //declaring double variiable to be used throughout program
    
    public static void main(String[] args) {
        String strAnswer1;
            strAnswer1 = JOptionPane.showInputDialog(null, "Select town for parcel delivery: " //creates input dialog
                + "\n" + 1 + ") Cape Town" + "\n" + 2 + ") Pretoria" + "\n" + 3 + ") Durban");
            
        if (strAnswer1.equals("1")) //if statement for users decision
        strTown = "Cape Town";
         if (strAnswer1.equals("2"))
            strTown = "Pretoria";
          if (strAnswer1.equals("3"))
            strTown = "Durban";
    
          String strAnswer2;
        strAnswer2 = JOptionPane.showInputDialog(null, "Select the weight category for delivery to " + strTown + ": "
        + "\n" + 1 + ") 0Kg - 4Kg" + "\n" + 2 + ") 5Kg - 9Kg" + "\n" + 3 + ") Over 10Kg");
        
        if (strAnswer2.equals("1"))
        strWeight = "0Kg - 4Kg";
         if (strAnswer2.equals("2"))
            strWeight = "5Kg - 9Kg";
          if (strAnswer2.equals("3"))
            strWeight = "Over 10Kg";
            
          String strAnswer3;
        strAnswer3 = JOptionPane.showInputDialog(null, "Select which company will deliver the parcel of weight " + strWeight + " to " + strTown
        + "\n" + 1 + ") ABC Couriers" + "\n" + 2 + ") Fast Track" + "\n" + 3 + ") Rest Assured");
        
        if (strAnswer3.equals("1"))
        strDeliveryCompany = "ABC Couriers";
         if (strAnswer3.equals("2"))
            strDeliveryCompany = "Fast Track";
          if (strAnswer3.equals("3"))
            strDeliveryCompany = "Rest Assured";
       
        if (strAnswer2.equals("1")) //price based on weight
        intPrice = 300;
         if (strAnswer2.equals("2"))
            intPrice = 500;
          if (strAnswer2.equals("3"))
            intPrice = 700;     
          
          
        deliveryreport(); //create method
    }
    
    public static void deliveryreport(){
        Delivery_Details Detail = new Delivery_Details(strWeight, intPrice, strTown, strDeliveryCompany, dblVAT, dblTotal);
        System.out.println("\n" + "Delivery Details Report");
        System.out.println("*****************************");
        System.out.println("Town: " + Detail.getTown());
        System.out.println("Weight: " + Detail.getWeight()); //gets data from other class		
	System.out.println("Price: R" + Detail.getPrice());
        System.out.println("VAT (14%): R" + Detail.getVATPrice());
        System.out.println("Total Price: R" + Detail.getTotalPrice());
        System.out.println("Courier: " + Detail.getCompanyName());
        System.out.println("*****************************");
    }
    
}
