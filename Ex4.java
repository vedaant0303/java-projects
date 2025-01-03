// Name:Vedaant Ambolkar
// Roll no:5
// Exp no:04



import java.util.*;

 class Ex4
{
	public static void main(String args[])
	{
		Student S1 = new Student("Vedaant", 18, "jogeshwary (E)");
        Student S2 = new Student("Pradnya", 19, "jogeshwary (W)");
        Student S3 = new Student("Shubham", 19, "andheri");
        Student S4 = new Student("Sumeet", 18, "andhri");
        Student S5= new Student("Ashwin", 19, "bhaindar");
        Student S6= new Student("Tejas", 19, "nalasopara");
        Student S7 = new Student("Akhila", 19, "bhiwandi");
        Student S8= new Student("Harsh", 20);
        Student S9 = new Student("Sahil", 20, "santacruz");
        Student S10 = new Student();
		S1.Student();
		S2.Student();
		S3.Student();
		S4.Student();
		S5.Student();
		S6.Student();
		S7.Student();
		S8.Student();
		S9.Student();
		S10.Student();
	}
}
class Student
{
	private String name;
	private	int age;
	private String address;
	
	Student()
	{
		name = "unknown";
		age = 0;
		address =" not available";
	}
	Student(String name,int age)
	{
		this.name = name;
		this.age = age;
		address = "not available";	
	}
	Student(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	void Student()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
	}
}