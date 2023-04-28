
// Assignment no 2->  09-April-2023

package PackageArithmetic;
import java.util.Scanner;


public class Assignment2Scanner {
	
	//solve ((((x1*x2)-x3)-x4)+x5)/x6)
	
	public int multi(int a, int b) {
		int x= a*b;
		System.out.println("Result of 1st Part of Equation (x1*x2) "+x);
		return x;	
	}
	public int sub(int a, int b) {
		int x =a-b;
		
		System.out.println("Result of 2nd Part of Equation (((x1*x2)-x3)-x4)) "+x);
		return x;	
		}
	
	public int sum(int a, int b) {
		int x= a+b;
		System.out.println("Result of 3rd Part of Equation ((((x1*x2)-x3)-x4)+x5))) "+x);
		return x;	
		}
	public int div(int a, int b) {
		int x= a/b;
		System.out.println("Result of 4th & Final Part of Equation ((((x1*x2)-x3)-x4)+x5)))) "+x);
		return x;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment2Scanner obj = new Assignment2Scanner();
		Scanner s = new Scanner(System.in);
		
		System.out.println(" Enter the Value of A1");
		int x1= s.nextInt();
		System.out.println(" Enter the Value of B1");
		int x2= s.nextInt();
		int y1= obj.multi(x1, x2);
		
		System.out.println("Enter the Value for A2");
		int x3 =s.nextInt();
		int x4= y1-x3;		
		System.out.println("value of x4 " +x4);
		
		System.out.println("Enter the Value for B2");
		int x5 =s.nextInt();
		int y2=obj.sub(x4,x5 );
		
		System.out.println("Enter the Value for A3");
		int x6 = s.nextInt();
		int y3 = obj.sum(y2,x6 );
		
		System.out.println("Enter the Value for A4");
		int x7 = s.nextInt();
		obj.div(y3, x7);
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		

	}

}
