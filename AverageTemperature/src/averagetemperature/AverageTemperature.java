/*
 * Program: AverageTemperature
 * Date: 3/4/2019
 * Programmer: Austin Goff 19004941
 * Description: Using while loop
 */
package averagetemperature;
import java.util.Scanner;

public class AverageTemperature {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int intTemperature, intCount, intSum;
        double dblAvg;
        
        intCount = 1;
        intSum = 0;
        System.out.print("Enter 1000 to stop: ");
        intTemperature = sc.nextInt();
        
        while (intTemperature != 1000)
        { intSum = intSum + intTemperature;
            intCount = intCount + 1;
            System.out.print("Enter 1000 to stop: ");
            intTemperature = sc.nextInt();
        }
         dblAvg = intSum / (intCount - 1);
            System.out.println("The average temperature is " + dblAvg);
    
    }
}
