/*
 * Program: Boutique
 * Date: 3/4/2019
 * Programmer: Austin Goff 19004941
 * Description: Using for loop
 */
package boutique;
import java.util.Scanner;

public class Boutique {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int intCount;
        double dblOriginalPrice, dblSalePrice;
        
        System.out.print("Enter price of product: R");
            dblOriginalPrice = sc.nextDouble();
         
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
            System.out.println("R" + dblSalePrice + " " + " Day " + intCount); 
            }
    }   
            
}
    

