package assignment4;

public class printduplicate {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int [] arr = new int[] {1,2,4,5,6,3,3,2,4};
		System.out.println("Duplicate elements in given array: ");  
		
		for(int i=0; i<arr.length;i++)
		{
			for (int j = i+1;j< arr.length;j++) {
				if( arr[i] == arr[j])
					 System.out.println(arr[j]);
			}
		}

	}

}
