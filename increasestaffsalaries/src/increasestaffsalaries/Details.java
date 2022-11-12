package increasestaffsalaries;

public class Details {
    private static double dblEmployeeID, dblSalary, dblNewSalary, dblIncreasedAmount;
    private static String strFirstName, strSurname;
      
    public double getIDNumber(){ //gets the users input
    return dblEmployeeID; //ends method and sends input back to program when requested
    
}
    
    public String getName(){
    return strFirstName;
    
}
    
    public String getLastName(){
    return strSurname;
    
}
    
    public double getSalary(){
    return dblSalary;
    
}
    
    public Details (double IDNumber, String Name, String LastName, double Salary, double UpdatedSalary, double IncreasedAmount){
        dblEmployeeID = IDNumber; //creates and intiates variables
        strFirstName = Name;
        strSurname = LastName;
        dblSalary = Salary;
        dblNewSalary = UpdatedSalary;
        dblIncreasedAmount = IncreasedAmount;
        
    }
 
 public static double getUpdatedSalary(){
     dblNewSalary = dblSalary + (dblSalary * 0.1); 
     return dblNewSalary;
 }
 
 public static double getIncreasedAmount(){
     dblIncreasedAmount = dblNewSalary - dblSalary;
     return dblIncreasedAmount;
 }
}
