/*
 * Program: floralcompany
 * Date: 3/21/2019
 * Programmer: Austin Goff 19004941
 * Description: Using if then statements
 */
package floralcompany;
 import java.util.Scanner;

public class Floralcompany {
 
    
    public static void main(String[] args) {
        double dblAmount, dblResaleNumber;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the purchase amount: R"); 
        dblAmount = sc.nextDouble(); 
        
        dblResaleNumber = 0.0; 
        
        if (dblAmount < 100) {
         dblResaleNumber = dblAmount - (dblAmount * 0.02);
         } else {
           if (dblAmount >= 100 & dblAmount < 500){
               dblResaleNumber = dblAmount - (dblAmount * 0.05);
           } else {
               if (dblAmount >= 500) {
                   dblResaleNumber = dblAmount - (dblAmount * 0.1);
               }
           }
         }
        
        System.out.println("The resale amount is: R" + dblResaleNumber );
        
    }
    
}