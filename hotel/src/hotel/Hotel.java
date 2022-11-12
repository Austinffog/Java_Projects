/*
 * Program: hotel
 * Date: 3/21/2019
 * Programmer: Austin Goff 19004941
 * Description: Using if then statements
 */
package hotel;
 import java.util.Scanner;

public class Hotel {

   
    public static void main(String[] args) {
        int intAmountPeople;
        double dblPrice;
                
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of people: ");
        intAmountPeople = sc.nextInt();
        
         if (intAmountPeople == 2) {
         System.out.println("The price is R85"); }     
           else{
             if (intAmountPeople == 3){
              System.out.println("The price is R90");  } 
               else{
                 if (intAmountPeople == 4) {
                 System.out.println("The price is R95"); } 
                   else{ 
                     if (intAmountPeople >= 5){
                     System.out.println("R6 per additional person"); 
                      }
        
                 }
                 
             }
         }
        String strPurpose;
        System.out.print("Please enter purpose of stay: ");
        strPurpose = sc.next();
        
        int intAge;
        System.out.print("Please enter age: ");
        intAge = sc.nextInt();
        
        if ("Business".equals(strPurpose)){
        System.out.println("Discount is 20%");
        }else{
        if (intAge > 60){
        System.out.println("Discount is 15%");
        }
                }
    }
}
