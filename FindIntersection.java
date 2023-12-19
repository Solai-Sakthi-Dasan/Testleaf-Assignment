package week2.day2.assignment;

public class FindIntersection {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (should match item in both arrays)
		 */
		
		int[] arrayOne = {3,2,11,4,6,7};
		int[] arrayTwo = {1,2,8,4,9,7};
		
		System.out.print("Common values of Both Arrays are : ");
		for(int i=0; i<arrayOne.length; i++) {
			for(int j=0; j<arrayTwo.length; j++) {
				if (arrayOne[i] == arrayTwo[j]) {
					System.out.print(arrayOne[i] + " ");
				}
			}
		}
	}

}
