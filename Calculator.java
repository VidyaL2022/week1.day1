package assignment2week1;

public class Calculator {

	public static void main(String[] args) {

		Calculator obj = new Calculator();
		
		obj.addnum();
		obj.subnum();
		obj.mulnum();
	    obj.divnum();
	    
	}

	public void divnum() {
		int num1 = 8;
		int num2 = 4;
		int div;
		div = num1 * num2;
	System.out.print(div);
		
	}

	public void mulnum() {
		int num1 = 10;
		int num2 = 4;
		int mul;
		mul = num1 * num2;
	System.out.print(mul);
		
	}

	public void subnum() {
		int num1 = 10;
		int num2 = 4;
		int sub;
		sub = num1 - num2;
	System.out.print(sub);
		
	}

	public void addnum() {

		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int sum;
		sum = num1 +num2 + num3;
	System.out.print(sum);
	}
		
		
	
}
