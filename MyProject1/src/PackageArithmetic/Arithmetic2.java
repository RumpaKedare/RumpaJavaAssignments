package PackageArithmetic;

public class Arithmetic2 {
	public int multi_sub(int a, int b, int c) {

		int x= a*b;
		int y= x - c;
		System.out.println("This is the result of ((10*2)-2) = " +" "+y);
			return y;
		}
	
	
	public int sum(int a, int b) {
		
		int x= a+b;
		System.out.println("This is the result of (((10*2)-2)+2) = " +" "+x);
			return x;
		}
	
	public int sub(int a, int b) {
		
		int x= a-b;
		System.out.println("This is the result of ((((10*2)-2)+2)-2) = " +" "+x);
			return x;
		}
	
	public void div(int a, int b) {
		
		int x= a/b;
		System.out.println("This is the final result of (((((10*2)-2)+2)-2)/2) = " +" "+x);
			//return x;
		}

	public static void main(String[] args) {
		
		Arithmetic2 var_val= new Arithmetic2();
		int first_value= var_val.multi_sub(10,2,2);
		
		int second_value= var_val.sum(first_value,2);
		int third_value= var_val.sub(second_value, 2);
		
		var_val.div(third_value,2);

	}

}
