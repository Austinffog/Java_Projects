/*
 * Program: MrBrown
 * Date: 3/4/2019
 * Programmer: Austin Goff 19004941
 * Description: Using while loop
 */
package mrbrown;
import java.util.Scanner;


public class MrBrown {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int intCount; 
        double dblAvg, dblMarks, dblSum, dblHighest, dblLowest;
        
        intCount = 1;
        dblSum = 0.0;
        dblHighest = 0.0;
        dblLowest = 100;
        
        System.out.print("Enter 111 to stop: ");
        dblMarks = sc.nextDouble();
        
        while (dblMarks != 111) {
            dblSum = dblSum + dblMarks;
            intCount = intCount + 1;
            System.out.print("Enter 111 to stop: ");
            dblMarks = sc.nextDouble();
            
            if (dblMarks > dblHighest & dblMarks != 111)
                dblHighest = dblMarks;
            
            if (dblMarks < dblLowest)
                dblLowest = dblMarks;
        }
         dblAvg = dblSum / (intCount - 1);
            System.out.println("The average marks is " + dblAvg);
        
            
        System.out.println("The Highest mark is " + dblHighest);
        System.out.println("The Lowest mark is " + dblLowest);
    }
}
      

