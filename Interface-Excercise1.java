interface Tax{
    //Implement your code here
    abstract double calculateTax(double price);
}

class PurchaseDetails implements Tax{
    //Implement your code here
    PurchaseDetails(String purchaseId,String paymentType ){
    this.paymentType=paymentType;
    this.purchaseId=purchaseId;
    }
    private String purchaseId;
    private String paymentType;
    private double taxPercentage;
    public String getpurchaseId(){
    return purchaseId;
    }
    public String getpaymentType(){
    return paymentType;
    }
    public double getTaxPercentage(){
    return taxPercentage;
    }
    public void setpurchaseId(String purchaseId){
    this.purchaseId=purchaseId;
    }
    public void setpaymentType(String paymentType){
    this.paymentType=paymentType;
    }
    public void settaxPercentage(double taxPercentage){
    this.taxPercentage=taxPercentage;
    }
    @Override
    public double calculateTax(double price){
    if(paymentType=="Debit Card")
    {settaxPercentage(2);
    return price*1.02;
    }
    else if(paymentType=="Credit Card")
    {settaxPercentage(3);
    return price*1.03;
    }
    else
    {settaxPercentage(4);
    return price*1.04;
    }
    //return price;
    }
}

class Seller implements Tax{
    //Implement your code here
    Seller(String Location){
    this.Location=Location;
    }
    private String Location;
    private double taxPercentage;
    public String getLocation(){
    return Location;
    }
    public double getTaxPercentage(){
    return taxPercentage;
    }
    public void setLocation(String Location){
    this.Location=Location;
    }
    public void settaxPercentage(double taxPercentage){
    this.taxPercentage=taxPercentage;
    }
    @Override
    public double calculateTax(double price){
    if(Location=="Middle east")
    {settaxPercentage(15);
    return price*0.15;
    }
    else if(Location=="Europe")
    {settaxPercentage(25);
    return price*0.25;
    }
    else if(Location=="Canada")
    {settaxPercentage(22);
    return price*0.22;
    }
    else if(Location=="Japan")
    {settaxPercentage(12);
    return price*0.12;
    }
    return price;
    }
    
}

class Tester{
    public static void main(String args[]) {
		System.out.println("Purchase Details\n***************");
		PurchaseDetails purchaseDetails = new PurchaseDetails("P1001","Credit Card");
		System.out.println("Total purchase amount: " + Math.round(purchaseDetails.calculateTax(100)*100)/100.0);
		System.out.println("Tax percentage: "+purchaseDetails.getTaxPercentage());

        System.out.println("Seller Details\n***************");
		Seller seller = new Seller("Canada");
		System.out.println("Tax to be paid by the seller: " + Math.round(seller.calculateTax(100)*100)/100.0);
		System.out.println("Tax percentage: "+seller.getTaxPercentage());
		
		//Create more objects for testing your code
	}
}
