/*
 * Program: GradePercentage
 * Date: 3/7/2019
 * Programmer: Austin Goff 19004941
 * Description: This program demonstrates the calculation of a marks percentage 
compared to the highest
 */
package gradepercentage;
    import java.util.Scanner;

public class GradePercentage {
    static double dblHighestPerc;
    static double dblMyPerc;
    static double dblGradeperc;

    public static void main(String[] args) {
        ReadMark();
        CalculateMark();
        PrintMark();
    }
    
    public static void ReadMark(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter highest percentage: ");
        dblHighestPerc = sc.nextInt();
        
        System.out.print("Enter your Percentage: ");
        dblMyPerc = sc.nextInt();
                
}
    public static void CalculateMark(){
        dblGradeperc = ((dblMyPerc / dblHighestPerc) * 100);
        
}
    public static void PrintMark(){
        System.out.println("The student has the following: \n" +
                           "their percentage: " + dblMyPerc + "\n" +
                           "the highest percentage in the class: " + dblHighestPerc + "\n" +
                           "and the grade percentage: " + dblGradeperc);
        
}
       
}
