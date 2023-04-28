//

package Package1;
public class Student {

	public Student() {
		// TODO Auto-generated constructor stub
	System.out.println("Default Constructor");
	}
	public Student(int a) {
		// TODO Auto-generated constructor stub
		System.out.println("Single parameterised Constructor");
		System.out.println("Roll No"+" "+a);
	}
	public Student(int a, int b) {
		// TODO Auto-generated constructor stub
		this(22);
		System.out.println("2- parameterised Constructor");
		int c= a+b;
		System.out.println("Addition"+" "+c);
	}
	public Student(int a, int b, int c) {
		// TODO Auto-generated constructor stub
		System.out.println("2- parameterised Constructor");
		int c1= (a+b)*c;
		System.out.println("Equation"+" "+c1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj= new Student();
		Student obj1= new Student(12);
		Student obj2= new Student(12,12);
		Student obj3= new Student(12,12,10);
	}

}
