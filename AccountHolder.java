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
   void Withdraw(int amt,String g1){
        bal=bal-amt;
        System.out.println(g1+" Transaction successful : "+amt);
        System.out.println(g1+" current balance : "+bal);
    }

}
class Customer implements Runnable{
   Account r1;
   String v1;
   Customer(Account j1, String m1){
      r1=j1;
      v1=m1;

   }
   public void run(){
       synchronized (r1) { //this keyword use for
           Scanner s1=new Scanner(System.in);
           System.out.println("Enter your withdraw amount " + v1 + ":");
           int RS = s1.nextInt();
           if (r1.isSufficientBalance(RS)) {
               r1.Withdraw(RS, v1);
           } else {
               System.out.println("Insufficient Balance");
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
