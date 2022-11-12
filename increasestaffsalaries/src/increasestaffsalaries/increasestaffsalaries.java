/*
 *Program: increasestaffsalaries
 *Programmer: Austin Goff
 *Date: 5/19/2019
 *Description: A program used to help a local retail store increase the salaries of staff.
 */
package increasestaffsalaries;
import java.util.Scanner; //imports scanner

public class increasestaffsalaries { 
public static double dblEmployeeID, dblSalary, dblNewSalary, dblIncreasedAmount; //declaring all double variables to be used throughout the program
public static String strFirstName, strSurname; //declaring all string variables to be used throughout the program
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //initiates scanner
        
        System.out.print("Enter EmployeeID number: "); //ask for user input
        dblEmployeeID = sc.nextDouble();
        
        System.out.print("Enter first name: ");
        strFirstName = sc.next();
        
        System.out.print("Enter surname: ");
        strSurname = sc.next();
        
        System.out.print("Enter Salary: ");
        dblSalary = sc.nextDouble();
        
        printDetails(); //creating a method
        
        System.out.println("\n" + "View the new salary amount with deductions by pressing [1] otherwise press any other number to exit.");
        int intNumber;
        intNumber = 1;
        System.out.print("Enter key: ");
            intNumber = sc.nextInt();
        if (intNumber == 1){ //continues program if value equals 1
        }
        else{
            System.exit(0); //exits program
        }           
 
        
        salaryDeductions();
    }
    
    public static void printDetails(){
        Details Detail = new Details(dblEmployeeID, strFirstName, strSurname, dblSalary, dblNewSalary, dblIncreasedAmount);
        System.out.println("\n" + "Employee Details Report");
        System.out.println("*****************************");
        System.out.println("EmployeeID number: " + Detail.getIDNumber()); //gets data from other class		
	System.out.println("Name: " + Detail.getName());
        System.out.println("Surname: " + Detail.getLastName());
        System.out.println("Original Salary: R" + Detail.getSalary());
        System.out.println("New Salary amount: R" + Details.getUpdatedSalary());
        System.out.println("Increased amount: R" + Details.getIncreasedAmount());
        System.out.println("*****************************");
        
    }
    
    public static void salaryDeductions(){
        double dblTAX, dblMed, dblCar, dblUIF, dblPay; 
        dblTAX = (dblSalary * 0.18);  //calculations
        dblMed = (dblSalary * 0.125);
        dblCar = (dblSalary * 0.08);
        dblUIF = (dblSalary * 0.02);
        dblPay = dblSalary - dblTAX - dblMed - dblCar - dblUIF;
        
        System.out.println("\n" + "Salary Deductions Report");
        System.out.println("*****************************");
        System.out.println("Salary: R" + dblSalary);
        System.out.println("TAX: R" + dblTAX);
        System.out.println("Medical AID: R" + dblMed);
        System.out.println("Car Allowance: R" + dblCar );
        System.out.println("UIF: R" + dblUIF);
        System.out.println("Take home pay: R" + dblPay);
        System.out.println("*****************************");
    }
    
}
