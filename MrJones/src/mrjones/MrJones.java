/*
 * Program: MrJones
 * Date: 3/4/2019
 * Programmer: Austin Goff 19004941
 * Description: Using for loop
 */
package mrjones;
import java.util.Scanner;

public class MrJones {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        int intCount;
        double dblPopulation, dblnewPopulation, dblPercentage;
        
        System.out.print("Enter previous decades population: ");
        dblPopulation = sc.nextDouble();
        
        System.out.print("Enter this decades population size: ");
        dblnewPopulation = sc.nextDouble();
       
        for (intCount = 1; intCount < 1; intCount ++){
            System.out.print("Enter this decades population size: ");
            dblnewPopulation = sc.nextDouble();  
        }
        
        dblPercentage = (dblnewPopulation - dblPopulation) / (dblnewPopulation * 100);
        System.out.println("The percentage increase in population is: " + dblPercentage + "%"); 
                
       }
       
       
    }
    

