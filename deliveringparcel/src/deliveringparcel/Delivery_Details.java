package deliveringparcel;


public class Delivery_Details {
    private static int intPrice;
    private static String strWeight, strTown, strDeliveryCompany;
    private static double dblTotal, dblVAT;
      
    public String getWeight(){ //gets the users input
    return strWeight; //ends method and sends input back to program when requested
    
}
    
    public int getPrice(){
    return intPrice;
    
}
    
    public String getTown(){
    return strTown;
    
}
    
    public String getCompanyName(){
    return strDeliveryCompany;
    
}
    
    public Delivery_Details (String Weight, int Price, String Town, String CompanyName, double VATPrice, double TotalPrice){
        strWeight = Weight; //creates and intiates variables
        intPrice = Price;
        strTown = Town;
        strDeliveryCompany = CompanyName;
        dblVAT = VATPrice;
        dblTotal = TotalPrice;
        
    }
    
    public double getVATPrice(){ //claculates VAT to be used in main class
        dblVAT = intPrice * 0.14;
        return dblVAT;
    }
    
    public double getTotalPrice(){ //calculates total price to be used in main class
        dblTotal = intPrice + (intPrice * 0.14);
        return dblTotal;
    }

    
}
