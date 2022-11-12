/*
 * Programmer: Austin Goff
 * Program: classexercise
 * Date: 2019/07/15
 * Description: Program to ask for user input and display results
 */
package dragonkiller;
import java.util.Scanner;

public class DragonKiller {
    
    public static void main(String[] args) {
       
        int DragToFind;
        int X;
        int KilledDragon;
        int[] Dragon;
        
        dragonMethods Obj = new dragonMethods();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter your name and surname: ");
        String name = sc.next();
        
        X = Obj.empty(name);
        
        Dragon = new int[X];
        Obj.populate(X, Dragon);
        System.out.print("Before the sort \n ...............................");
        
        for (int count = 0; count < Dragon.length; count ++) {
            System.out.print(" " + Dragon[count]);
        }
        System.out.println();
        
        Obj.insertionSort(Dragon);
        System.out.print("After the sort \n ...............................");
        
        for (int count = 0; count < Dragon.length; count ++) {
            System.out.print(" " + Dragon[count]);
        }
        System.out.println();
        
        System.out.print("Please enter the power level from the display array of the dragon to be removed: \n");
        DragToFind = sc.nextInt();
       
        System.out.println("After the kill \n ...............................");
        
         KilledDragon = Obj.FindDragonToKill(DragToFind, Dragon);
        
        for (int counter = 0; counter < Dragon.length; counter ++) {
            if (Dragon[counter] == KilledDragon) {
                Dragon[counter] = 0;
            }
            System.out.println(" " + Dragon[counter]);
        }
        System.out.println();
    }
    
}

