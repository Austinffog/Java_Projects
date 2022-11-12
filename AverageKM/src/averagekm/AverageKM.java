/*
 * Program: AverageKM
 * Date: 3/4/2019
 * Programmer: Austin Goff 19004941
 * Description: Using for loop
 */
package averagekm;
import java.util.Scanner;

public class AverageKM {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int intCount;
        double dblKM, dblLitres, dblAvg;
        
        System.out.print("Enter the amount of kilometers driven: ");
        dblKM = sc.nextDouble();
        
        System.out.print("Enter the litres of fuel for trip to garage:");
        dblLitres = sc.nextDouble();
        
        for (intCount = 1; intCount <= 5; intCount ++) {
            
        System.out.print("Enter the amount of kilometers driven: ");
        dblKM = sc.nextDouble();
        
        System.out.print("Enter the litres of fuel for trip to garage:");
        dblLitres = sc.nextDouble();
           
        } 
        
        dblAvg = (dblKM) / (dblLitres);
        System.out.println("The average kilometers per litre is: " + dblAvg); 
        
    }
    
}
/* Questin 8) The for loop was used to loop through asking for the values
              and then calculate the total at the end.
*/ 