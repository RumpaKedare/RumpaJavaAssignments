package PackageArithmetic;

public class Arithmetic {
	
	public int sum(int a, int b, int c) {
	int x= a+b;
	int y=x+c;
	System.out.println("Result of Additison"+" = "+y);
	return y;
		
	}
	
	public int sub(int a, int b) {
	int x = a-b;
	System.out.println("Result of Subtraction"+" = "+x);
		return x;
	}
	
	
	public int multi(int a, int b) {
		int x = a*b;
		System.out.println("Result of Multiplication"+" = "+x);
			return x;
		}
	
	public void div(int a, int b) {
		int x = a/b;
		System.out.println("Final Result of Division"+" = "+x);
			//return x;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic ref_var= new Arithmetic();
		
		int var_sum= ref_var.sum(10, 2, 2);
		int var_sub= ref_var.sub(var_sum, 2);
		int var_multi= ref_var.multi(var_sub, 2);
		ref_var.div(var_multi, 2);
		
		
	}

}
