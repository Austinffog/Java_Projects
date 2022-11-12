/*
 * Program: citytheatre
 * Date: 3/21/2019
 * Programmer: Austin Goff 19004941
 * Description: Using if then statements
 */
package citytheatre;
 import java.util.Scanner;

public class Citytheatre {
 
    
    public static void main(String[] args) {
        int intAge;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter age: ");
        intAge = sc.nextInt();
        
        
         if (intAge >= 55) {
         System.out.println("The price is R10"); }     
           else{
             if (intAge >= 21 & intAge <= 54){
              System.out.println("The price is R15");  } 
               else{
                 if (intAge >= 13 & intAge <= 20) {
                 System.out.println("The price is R10"); } 
                   else{ 
                   System.out.println("Free");
                 }
        }
     }
  }
}