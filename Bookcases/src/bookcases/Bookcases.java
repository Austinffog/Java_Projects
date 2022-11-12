/*
 * Program: Bookcases
 * Date: 3/7/2019
 * Programmer: Austin Goff 19004941
 * Description: This program demonstrates the calculation of the size of
bookcases given certain measurements
 */

package bookcases;
import java.util.Scanner;

public class Bookcases { 
    static double dblHeight, dblWidth, dblLength, dblFeet;
    static int intNoofBookcases;
   
    public static void main(String[] args) {
        ReadBookcase();
        CalculateDimensions();
        PrintLength();
    }
    
     public static void ReadBookcase() {
         Scanner sc = new Scanner (System.in);
         System.out.print("Enter the height of the bookcase in meters: "); 
         dblHeight = sc.nextDouble();
         
         System.out.print("Enter the width of the bookcase in meters: ");
         dblWidth = sc.nextDouble();
         
         System.out.print("Enter the number of bookcases: ");
         intNoofBookcases = sc.nextInt();
         
     }
     
     public static void CalculateDimensions() {
         dblLength = ((dblHeight * dblWidth) * 5) * intNoofBookcases; //5 is the no of shelves; 3, bottom & top
         dblFeet = dblLength * 3.28; //converting meters to feet
     }
     
     public static void PrintLength() {
         System.out.print("The feet of wideboards required is: " + dblFeet);
     }
}
