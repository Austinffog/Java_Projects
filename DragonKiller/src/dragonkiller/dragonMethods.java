/*
 * Programmer: Austin Goff
 * Program: classexercise
 * Date: 2019/07/15
 * Description: Program to ask for user input and display results
 */
package dragonkiller;
import java.util.Random;

public class dragonMethods {
   
    public dragonMethods() {
        
    }
    
    public int empty(String name) {
        name = name.replaceAll("\\s", "");
        int size = name.length();
        return size;
    }
    
    public void populate(int size, int[] arr){
        Random rd = new Random();
        for (int count = 0; count < arr.length; count ++){
            arr[count] = 10 + rd.nextInt();
        }
    }

    public int FindDragonToKill(int DragToFind, int []Dragon) {
        return DragToFind;
                 
    }
           
    


    void insertionSort(int[] Dragon) {
        Random rd = new Random();
        for (int count = 0; count < Dragon.length; count ++){
            Dragon[count] = 10 + rd.nextInt();
    }
    }
}
