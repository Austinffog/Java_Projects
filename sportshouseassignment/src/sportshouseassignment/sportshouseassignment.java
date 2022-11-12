/*
 * Program: sportshouseassignment 
 * Programmer: Austin Goff
 * Date: 5/19/2019
 * Description: Program randomly gives individuals a sports team house 
 */
package sportshouseassignment;
import javax.swing.JOptionPane;
import java.util.Random;

public class sportshouseassignment {

   
    public static void main(String[] args) { //asks for each students name to be inputed
        String strNameOne, strNameTwo, strNameThree;
        strNameOne = JOptionPane.showInputDialog(null, "Enter first student name.");
        strNameTwo = JOptionPane.showInputDialog(null, "Enter second student name.");
        strNameThree = JOptionPane.showInputDialog(null, "Enter third student name.");
        
        
        String[] colour = {"red", "white", "blue"}; //selects a random colour for each student
        Random col = new Random();
        String randomcolour1 = colour [col.nextInt(colour.length)];
        String randomcolour2 = colour [col.nextInt(colour.length)];
        String randomcolour3 = colour [col.nextInt(colour.length)];
        
        Random num = new Random(); //selects a random number from 0-9999 as the number can be max of four digits
        int intNumber1 = num.nextInt(10000);
        intNumber1 += 1;
        int intNumber2 = num.nextInt(10000);
        intNumber2 += 1;
        int intNumber3 = num.nextInt(10000);
        intNumber3 += 1;
        
        
        JOptionPane.showMessageDialog(null, "School House Assignment" + "\n" + "**********************" + "\n" +
                strNameOne + " is assigned to the " + randomcolour1 + " house with the student number: " + randomcolour1 + intNumber1 + "\n" +
                strNameTwo + " is assigned to the " + randomcolour2 + " house with the student number: " + randomcolour2 + intNumber2 + "\n" +
                strNameThree + " is assigned to the " + randomcolour3 + " house with the student number: " + randomcolour3 + intNumber3); 
        //creates message dailog to view all the input
    }   

}