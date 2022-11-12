/*
 * Program: paper
 * Date: 3/21/2019
 * Programmer: Austin Goff 19004941
 * Description: Using if then statements
 */
package paper;
 import java.util.Scanner;

public class Paper {

    
    public static void main(String[] args) {
        int intSheets;
        double dblPrice;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of paper sheets needed: ");
        intSheets = sc.nextInt();
        
        dblPrice = 0.0;
        if (intSheets < 100) {
          dblPrice = intSheets * 0.1;}     
           else{
             if (intSheets == 100){
              dblPrice = intSheets * 0.055;  } 
             else{
                 if (intSheets == 500){
                 dblPrice = intSheets * 0.04; }
                 else {
                     if (intSheets == 1000){
                         dblPrice = intSheets * 0.03;}
                     }
                 }
            
        
} System.out.println("The price is: R" + dblPrice + " for " + intSheets + " sheets of paper");
    }

}

