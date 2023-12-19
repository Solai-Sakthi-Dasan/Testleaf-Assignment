package week2.day2.assignment;

import java.util.Arrays;

public class RemoveDuplicates {
	
	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
		System.out.println(Arrays.toString(words));
        
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = i; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    if (count > 1) {
                        words[j] = "";
                    }
                }
            }
        }
        
        String result = String.join(" ", words);
        System.out.println("String without duplicate words: " + result);
  
	}

}
