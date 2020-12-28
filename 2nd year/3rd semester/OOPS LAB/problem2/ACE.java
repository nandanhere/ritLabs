 
import java.util.*;

class Account
{
 int accno;
 String name;
 int phoneNumber;
 float balance_amt;
 Account()
 {
     accno = 0;
     name = "";
     phoneNumber = 0;
     balance_amt = 0;
 }
 void getinput(){
    Scanner sc = new Scanner(System.in);
   
    System.out.print("Enter Name ");
    name = sc.nextLine();
    System.out.print("Enter Account number ");
    accno = sc.nextInt();
    System.out.print("Enter phone number");
    phoneNumber = sc.nextBigInteger().intValue();
    System.out.print("Enter Balance");
    balance_amt = sc.nextFloat();
    sc.close();
 }

 void deposit(float depositAmount){
    System.out.println("Deposit Complete, Balance was " + balance_amt);
    balance_amt += depositAmount;
    System.out.println("Balance is now " + balance_amt);

 }
 void withdraw(float withdrawamount){
     System.out.print("Enter amount to withdraw :");
     Scanner sc = new Scanner(System.in);
	 float withdrawamount = sc.nextFloat();
     if (withdrawamount > balance_amt) {
        System.out.println("Balance is low , Cannot withdraw :(");
     }
     else {
        
        System.out.println("Withdrew " + withdrawamount + " from account balance");
        balance_amt -= withdrawamount;
        System.out.println("Balance is now " + balance_amt);
     }
 }
 void showDetails(){
     System.out.println("Bank details are:");
     System.out.println("Name : " + name);
     System.out.println("Account Number : " + accno);

     System.out.println("Phone Number : " + phoneNumber);
     System.out.println("Balance available : " + balance_amt);
 }
}
class ACE {
    public static void main(String[] args)
    {
        Account ac = new Account();
        ac.getinput();
        ac.deposit(99);
        ac.withdraw(100);
        ac.showDetails();
    }

}
