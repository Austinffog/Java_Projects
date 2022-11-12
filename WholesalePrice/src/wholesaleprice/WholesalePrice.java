/*
 * Program: WholesalePrice
 * Date: 3/4/2019
 * Programmer: Austin Goff 19004941
 * Description: Using for loop
 */
package wholesaleprice;
import java.util.Scanner;

public class WholesalePrice {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        int intCount;
        double dblOriginalPrice, dblSalePrice, dblWholesalePrice;
        
        System.out.print("Enter original price of product: R");
            dblOriginalPrice = sc.nextDouble();
        
        System.out.print("Enter wholesale price of product: R");
        dblWholesalePrice = sc.nextDouble();
         
            for (intCount = 1; intCount <= 5; intCount ++) {
                dblSalePrice = dblOriginalPrice - (dblOriginalPrice * 0.1);
            if (intCount == 2) 
                dblSalePrice = dblOriginalPrice - (dblOriginalPrice * 0.2);
            if (intCount == 3) 
                dblSalePrice = dblOriginalPrice - (dblOriginalPrice * 0.3);
            if (intCount == 4) 
                dblSalePrice = dblOriginalPrice - (dblOriginalPrice * 0.4);
            if (intCount == 5) 
                dblSalePrice = dblOriginalPrice - (dblOriginalPrice * 0.5);
            System.out.println("The sale price is: " + "R" + dblSalePrice + " " + " Day " + intCount);
            
            if (dblSalePrice < dblWholesalePrice)
                System.out.println("The wholesale price is: R" + dblWholesalePrice);}
             
            }
            
            
    }

