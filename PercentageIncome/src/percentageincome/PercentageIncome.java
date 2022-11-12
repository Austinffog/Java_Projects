/*
 * Program: PercentageIncome
 * Date: 3/7/2019
 * Programmer: Austin Goff 19004941
 * Description: This program demonstrates the calculation of the percentage of rent 
that is taken from income
 */

package percentageincome;
import java.util.Scanner;

public class PercentageIncome {
    static double dblRent, dblIncome, dblPercentage;
    
    public static void main(String[] args) {
        ReadAmount();
        CalculatePercentage();
        PrintPercentage();
    }
    
    public static void ReadAmount(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter income: R");
        dblIncome = sc.nextDouble();
        
        System.out.print("Enter Rent: R");
        dblRent = sc.nextDouble();
    }
    
    public static void CalculatePercentage(){
        dblPercentage = dblRent / dblIncome * 100;
    }
    
    public static void PrintPercentage(){
        System.out.println("The percentage of Jacks' income as rent is: " + dblPercentage + "%");
    }
}
