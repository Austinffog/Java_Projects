package customer_finance;

public class Finance_Period extends Customer { //class extends Customer

    public double MonthlyPrice, dblInterest, Total; //declaring variables
    
    Finance_Period() {
    }

    @Override //override
    public double Calculate_Repayment() { //calculate interest
        dblInterest = ((ProductPrice / NumberofMonths) * 0.25) * NumberofMonths;
        MonthlyPrice = (ProductPrice / NumberofMonths);
        if (NumberofMonths > 3) {
            return dblInterest;
        } else {
            return MonthlyPrice;  
        }  
    }

    public double TotalDue() {  //calculate total
        Total = ((ProductPrice / NumberofMonths) * 0.25) + (ProductPrice);
        if (NumberofMonths > 3) {
            return Total;
        } else {
            return ProductPrice;
        }
    }
}
