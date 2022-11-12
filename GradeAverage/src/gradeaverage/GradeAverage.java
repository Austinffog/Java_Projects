/*
 * Program: GradeAverage
 * Date: 3/4/2019
 * Programmer: Austin Goff 19004941
 * Description: Using for loop
 */
package gradeaverage;
import java.util.Scanner;

public class GradeAverage {

   
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
       
       int intCount;
       double dblAvg, dblGradePoint;
       String strLetter;
       
       dblGradePoint = 0.0;
       
       for (intCount = 0; intCount <5; intCount ++){
           
       System.out.print("Enter letter grade: ");
       strLetter = sc.next();
      
           
           if ("A".equals(strLetter))
               dblGradePoint = dblGradePoint + 4;
                        
           if ("B".equals(strLetter))
               dblGradePoint = dblGradePoint + 3;
             
           if ("C".equals(strLetter))
               dblGradePoint = dblGradePoint + 2;
           
           if ("D".equals(strLetter))
               dblGradePoint = dblGradePoint + 1;
           
           if ("F".equals(strLetter))
               dblGradePoint = dblGradePoint + 0;  
          } 
    
       dblAvg = dblGradePoint / 5;
       System.out.println("The average grade is: " + dblAvg);
   
       
    }
    
}
