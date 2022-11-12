/*
 * Program: SalePrice
 * Date: 3/7/2019
 * Programmer: Austin Goff 19004941
 * Description: This program demonstrates the calculation of an items sale price 
given the original price and discount percentage
 */

package saleprice;
import java.util.Scanner;

public class SalePrice {
    static double dblOriginalPrice, dblSalePrice;
    static double dblDiscount;
    
    public static void main(String[] args) {
       ReadOriginalPrice();
       CalculateSalePrice();
       PrintSalePrice();
    }
    
    
    public static void ReadOriginalPrice() {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter original price of sweater: R");
    dblOriginalPrice = sc.nextDouble();
}
    
    public static void CalculateSalePrice() {
    dblDiscount = (dblOriginalPrice * 0.25);
    dblSalePrice = (dblOriginalPrice - dblDiscount);
    }
    
    public static void PrintSalePrice() {
        System.out.println("The sale price of the sweater is: R" + dblSalePrice);
    }
    
    
}
