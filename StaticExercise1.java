class Bill{
    //Implement your code here
    private String billId="B",paymentMode;
    private static int counter;
    static{
    counter=9001;
    }
    public String getBillId(){
    billId="B"+Bill.counter++;
    return billId;
    //System.out.print("B"+Bill.counter++);
    }
    Bill(String karoo){
    paymentMode=karoo;
    }
    public String getPaymentMode(){
    return paymentMode;
    }
}

class Tester {
    public static void main(String[] args) {

        Bill bill1 = new Bill("DebitCard");
        Bill bill2 = new Bill("PayPal");
        
        //Create more objects and add them to the bills array for testing your code
              
        Bill[] bills = { bill1, bill2 };
              
        for (Bill bill : bills) {
            System.out.println("Bill Details");
            System.out.println("Bill Id: " + bill.getBillId());
            System.out.println("Payment method: " + bill.getPaymentMode());
            System.out.println();
       }
    }
}

