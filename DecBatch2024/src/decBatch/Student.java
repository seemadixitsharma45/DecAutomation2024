package decBatch;

public class Student {

	int rollnumber, age;
	
	
	public void display1()
	{
		System.out.println("welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("automation is very easy");
	}
	
	
	
	public static void main(String[] args) {

Student value=new Student();
value.display1();

value.display2();

value.rollnumber=25;
System.out.println(value.rollnumber);

value.age=35;

System.out.println(value.age);




	}

}
