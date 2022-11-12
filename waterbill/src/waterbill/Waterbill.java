/*
 * Program: waterbill
 * Date: 3/21/2019
 * Programmer: Austin Goff 19004941
 * Description: Using if then statements
 */
package waterbill;
 import java.util.Scanner;

public class Waterbill {

    
    public static void main(String[] args) {
        double dblWaterBill, dblCubicMeter;
        
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Please enter the amount of water used: ");
        dblCubicMeter = sc.nextDouble();
        
        dblWaterBill = 0.0;
         if (dblCubicMeter <= 1000) {
         dblWaterBill = 150; }     
           else{
             if (dblCubicMeter > 1000 & dblCubicMeter <= 2000){
             dblWaterBill = 0.0175 * dblCubicMeter;  } 
               else{
                 if (dblCubicMeter > 2000 & dblCubicMeter <= 3000) {
                 dblWaterBill = 0.02 * dblCubicMeter; } 
                   else{ 
                   dblWaterBill = 700;
                }
            }         
        }System.out.println("The water bill is: R" + dblWaterBill);
    }
}


              
  

            
          
         
    

               
               
               
         
           
         
         
    
    

