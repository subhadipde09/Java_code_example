import java.util.Scanner;
class Account{
    int bal;
    Account(int b){
       bal=b;
    }
    Boolean isSufficientBalance(int RS){
        if(bal>RS){
          return true;
        }else{
            return false;
        }
    }
   void Withdraw(int RS,String g1){
       bal=bal-RS;
        System.out.println(g1+" Transaction successful : "+RS);
        System.out.println(g1+" current balance : "+bal);
    }

}
class Customer implements Runnable{
   Account Amt;
   String name;
   Customer(Account j1, String m1){
      Amt=j1;
      name=m1;

   }
   public void run(){
       synchronized (Amt) { // use for synchronized the user
           Scanner s1=new Scanner(System.in);
           System.out.println("Enter your withdraw amount " + name + ":");
           int RS = s1.nextInt();
           if (Amt.isSufficientBalance(RS)) {
               Amt.Withdraw(RS,name);
           } else {
               System.out.println(name+" Insufficient Balance");
           }
       }
   }
}
public class AccountHolder {
    public static void main(String []x)
    {
Account a1=new Account(5000);
Customer c1=new Customer(a1,"Ram");
Customer c2=new Customer(a1,"Sam");
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
t1.start();
t2.start();
    }
}
