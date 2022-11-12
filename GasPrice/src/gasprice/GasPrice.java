/*
 * Program: GasPrice
 * Date: 3/7/2019
 * Programmer: Austin Goff 19004941
 * Description: This program demonstrates the calculation of gas according 
   to the price of gas intake per miles traveled at a certain distance
 */

package gasprice;
import java.util.Scanner;

public class GasPrice {
    static double dblPrice, dblMiles, dblAverage, dblCost;
   
    public static void main(String[] args) {
       ReadValues();
       CalculateCost();
       PrintCost();
    }
    
    public static void ReadValues(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the average price of gas: R");
        dblPrice = sc.nextDouble();
        
        System.out.print("Enter the average miles per litre for vehicle: ");
        dblMiles = sc.nextDouble();
    }
    
    public static void CalculateCost() {
        dblAverage = 111 / dblMiles; // I converted 180Km to 111miles
        dblCost = dblPrice * dblAverage;
    }
    
    public static void PrintCost() {
        System.out.print("The cost of gas for the trip is: R" + dblCost);
    }
}
