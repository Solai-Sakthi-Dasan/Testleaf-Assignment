package week2.day2.assignment;

public class FibbonacciSeries {

	public static void main(String[] args) {
		
		int limit=11;
		
		// Using Arrays
		System.out.println("USING ARRAYS");
		int[] fibbonacciSeries = new int[limit];
		fibbonacciSeries[0] = 0;
		fibbonacciSeries[1] = 1;
		
		for(int i=2; i<limit; i++) {
			fibbonacciSeries[i] = fibbonacciSeries[i-1] + fibbonacciSeries[i-2];
		}
		
		for(int i=0; i<limit; i++) {
			System.out.print(fibbonacciSeries[i] + " ");
		}
		System.out.println(" ");
		
		//Without using Arrays
		System.out.println("WITHOUT USING ARRAYS");
		int firstNumber = 0;
		int secondNumber = 1;
		int sum = firstNumber + secondNumber;
		System.out.print(firstNumber + " ");
		System.out.print(secondNumber + " ");
		
		for (int i=2; i<limit; i++) {
			sum = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = sum;
			System.out.print(sum + " ");
		}
	}

}
