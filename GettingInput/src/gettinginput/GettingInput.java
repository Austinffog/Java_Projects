/*
 
 */
package gettinginput;
import java.util.Scanner;

public class GettingInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
        input.close();
        
        System.out.println("Please enter a number");
        int num1 = input.nextInt();
        System.out.println("Please enter another number");
        int num2 = input.nextInt();
        System.out.println(num1 + " " + num2 + " = " + (num1 + num2));
        input.close();
    }
    
}
