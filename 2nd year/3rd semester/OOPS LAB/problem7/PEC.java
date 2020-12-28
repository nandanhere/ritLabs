import java.util.*;
class Person{
	String name;
	int age;
	String education;
	int salary;
	int yoe;
	int nol;
	int loanAmt;
Person(){
	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name :");  name = sc.nextLine();
        System.out.print("Enter age :");   age = sc.nextInt();
sc.nextLine();  // Consume newline left-over
        System.out.print("Enter education :"); education = sc.nextLine();
        System.out.print("Enter salary :");salary = sc.nextInt();
        System.out.print("Enter Year of entry :");yoe = sc.nextInt();
        System.out.print("Enter Number of loans :");  nol = sc.nextInt();
        System.out.print("Enter Loan amount :"); loanAmt = sc.nextInt();
    
}

void isEligible(){
	if (age >= 18){
		System.out.println("Eligible for loan");	
	}
else{
	System.out.println("Not Eligible for loan");	
}
}
void taxPay(){
	if (age >= 18 && salary >= 10000){
	int tax = salary/10000;
		System.out.println("The tax to be paid is " + tax);	
	}
else{
	System.out.println("Not Eligible");	
}
}
void isEligiblePromotion(){
	if (yoe >= 5){
		System.out.println("Eligible");	
	}
else{
	System.out.println("Not Eligible");	
}
}
void display(){
	System.out.println("Name : " + name);
	System.out.println("Age : " + age);
	System.out.println("Education : " + education);
	System.out.println("Salary : " + salary);
	System.out.println("YOE : " + yoe);
	System.out.println("number of loans : " + nol);
	System.out.println("Loan Amount : " + loanAmt);
}
}
public class PEC{
// need to input n employees
	public static void main(String args[]){
		int input = 0;
		Person employees[];
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of people : ");
		input = sc.nextInt();
		employees = new Person[input];
		for(int i = 0; i < input; i++)
		{
			System.out.println("Enter the Details of person " + (i + 1));
			employees[i] = new Person();
		}

		for(int i = 0; i < input; i++)
		{
			System.out.println("Details of person " + (i + 1));
			employees[i].display();

			employees[i].isEligiblePromotion();
			employees[i].isEligible();

			employees[i].taxPay();
		}
 
}
}
