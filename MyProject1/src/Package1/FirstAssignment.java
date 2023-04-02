package Package1;

//import PackageArithmetic.FirstAssignment;

//import Package1.MyFirstClass;

public class FirstAssignment {

	int age;
	int roll_no;
	
	public void display1() {
	System.out.println("Welcome everyone!!!");
	
	}
	public void display2() {
		System.out.println("Automation is very Easy.");
		
		}
	
	public static void main(String[] args) {
	FirstAssignment reference_var1=new FirstAssignment();
	reference_var1.display1();
	reference_var1.display2();
	reference_var1.age=10;
	reference_var1.roll_no=02;
	System.out.println("Student Age"+reference_var1.age);
	System.out.println("Student Age"+reference_var1.roll_no);
}
}


