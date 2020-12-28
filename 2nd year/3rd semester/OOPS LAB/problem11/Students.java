package StudentPackage;
public interface Student
{
String name;
String branch;
public Student(){}
}
Class CreditLimit extends Exception
{
CreditLimit(int credits)
{
String s = "The credit limit is exceeded by " + (s - 30);
super(s);
}
}
Class RegisterStudent implements Student{
RegisterStudent(String name,String branch, int credits)
{
   try     {
	if(credits > 30)
	{
	throw CreditLimit(credits);
        }
	this.name = name;
	this.branch = branch;
	this.credits = credits;
	}
	catch(CreditLimit c)
	{
		System.out.println("Exception occured! : " + c);
	}
	}

}
