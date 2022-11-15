package customer_finance;
import javax.swing.JOptionPane;

public class Customer {

    //declaring variables
    public String CustomerName;
    public int ContactNumber;
    public double ProductPrice;
    public int NumberofMonths;
    public double MonthlyRepaymentAmount;

    public Customer() {
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName() {
        CustomerName = JOptionPane.showInputDialog(null, "Please enter the customer name", "Customer Name", JOptionPane.QUESTION_MESSAGE); 
    }

    public int getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber() {
        String strContactNumber;
        strContactNumber = JOptionPane.showInputDialog(null, "Please enter the customer contact name", "Contact Number", JOptionPane.QUESTION_MESSAGE);
        ContactNumber = Integer.parseInt(strContactNumber);
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice() {
        String strProductPrice;
        strProductPrice = JOptionPane.showInputDialog(null, "Please enter the price of the product", "Product Price", JOptionPane.QUESTION_MESSAGE);
        ProductPrice = Double.parseDouble(strProductPrice);
    }

    public int getNumberofMonths() { 
        return NumberofMonths;
    }

    public void setNumberofMonths() {
        String strNumberofMonths;
        strNumberofMonths = JOptionPane.showInputDialog(null, "Please enter the number of repayment months", "Number of Months", JOptionPane.QUESTION_MESSAGE);
        NumberofMonths = Integer.parseInt(strNumberofMonths);
        
        if (NumberofMonths > 12) { //tell user to enter a number less than 13
            JOptionPane.showMessageDialog(null, "Enter month below 13", "Number of Months", JOptionPane.QUESTION_MESSAGE);
        }
    }
    
    public double Calculate_Repayment() {
        MonthlyRepaymentAmount = ProductPrice / NumberofMonths;
        return MonthlyRepaymentAmount;
    }

    public Customer(String strCustName, int intContNumber, double dblProdPrice, int intNumberMonths, double dblMonthlyRepayAmount) {
        CustomerName = strCustName;
        ContactNumber = intContNumber;
        ProductPrice = dblProdPrice;
        NumberofMonths = intNumberMonths;
        MonthlyRepaymentAmount = dblMonthlyRepayAmount;
    }
}
