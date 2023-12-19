package week2.day2.assignment;

public class IsPrime {

	public static void main(String[] args) {
		
		int number = 10;
		int flag=0;
		
		if (number > 1) {
			for (int i=2; i<(number/2)+1; i++) {
				if(number%i==0) {
					flag+=1;
					System.out.println(number + " is not a Prime number");
					break;
				}
			}
			if (flag == 0) {
				System.out.println(number + " is a Prime number");
			}
		}
		else if (number == 1) {
			System.out.println("1 is neighter prime nor composite number");
		}
	}
}
