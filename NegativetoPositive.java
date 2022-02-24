package assignment3;

public class NegativetoPositive {

	public static void main(String[] args) {
	        int num = -50;
	        if(num<0) {
	    		System.out.println("Given number " + num + " is negative number");
	    		int res = -(num);
	    		System.out.println("The number " + num + " is converted into " + res);
	    	}
	    		else
	    			System.out.println("The number" + num + " is positive number");
	}
}