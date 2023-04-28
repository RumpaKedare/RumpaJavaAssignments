
// Assignment no 1->  09-April-2023

package PackageArithmetic;
import java.util.Scanner;

public class AssignmentScanner {
//solve ((((x1+x2)+x3)-x4)*x5)/x6)

	public int sum(int a, int b, int c ) {
		
	System.out.println("First Equation ((x1+x2)+x3)");
	
	int x=a+b;
	int y= x+c;
	return y;
	
	}
	public int sub(int a, int b) {
		
		System.out.println("Second Equation (((x1+x2)+x3)-x4)");
		
		int x=a-b;
		return x;
		
		}
    public int multi(int a, int b) {
		
		System.out.println("Third Equation ((((x1+x2)+x3)-x4)*x5) ");
		
		int x=a*b;
		return x;
		
		}
    public int div(int a, int b) {
		
		System.out.println("Fourth Equation (((((x1+x2)+x3)-x4)*x5)/ x6)");
		
		int x=a/b;
		return x;
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating object for the class
		AssignmentScanner obj = new AssignmentScanner();
		System.out.println(" Calling Scanner class");
		//creating Scanner class Object
		Scanner s= new Scanner(System.in);	
		//calling Addition Method()
		System.out.println("---------------------------------- ");
		System.out.println(" ");
		System.out.println(" Enter the value of A1");
		int a1 = s.nextInt();
		System.out.println(" Enter the value of B1");
		int b1 = s.nextInt();
		System.out.println(" Enter the value of C1");
		int c1 = s.nextInt();
		int x1= obj.sum(a1, b1, c1);
		System.out.println(" Result of First Equation Addition:  " +"" +x1);
		
		//calling Subtraction Method()
		System.out.println("---------------------------------- ");
		System.out.println(" ");
		System.out.println(" Enter the value of A2 ");
		int a2 = s.nextInt();
		int x2= obj.sub(x1, a2);
		System.out.println(" Result of Second Equation Subtraction:  " +"" +x2);
		
		//calling Multiplication Method()
		System.out.println("---------------------------------- ");
		System.out.println(" ");
		System.out.println(" Enter the value of A3 ");
		int a3 = s.nextInt();
		int x3= obj.multi(x2, a3);
		System.out.println(" Result of Third Equation Multiplication:  " +"" +x3);
		
		//calling Division Method()
		System.out.println("---------------------------------- ");
		System.out.println(" ");
		System.out.println(" Enter the value of A4 ");
		int a4 = s.nextInt();
		int x4= obj.div(x3, a4);
		System.out.println(" Result of Fourth Equation Division:  " +"" +x4);
	}

}
