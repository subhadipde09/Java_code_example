public class ExceptionHandle1 {
    public static void main(String []x)
    {
        int amt=1000;
        int w=500;
        try{
            if(amt<w){
                throw new ArithmeticException("Insufficient Balance");
            }
            else {
                amt = amt - w;
                System.out.println("Transaction successful");
                System.out.println("Current Balance is " + amt);
            }
        }
        catch (ArithmeticException a1){
            System.out.println(a1.getMessage());
            System.out.println("Current Balance is "+ amt);
        }

    }
}
