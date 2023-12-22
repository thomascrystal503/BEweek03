package week03;

import java.util.Scanner;

public class week03ArraysAndMethodsLab {

	public static void main(String[] args) {
		
					
				//
				// Arrays:
				//
				
				// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
////					
//					int[] val = {1, 5, 2, 8, 13, 6};
//				
				// 2. Print out the first element in the array
//			
//					System.out.println(val[0]);
					
				// 3. Print out the last element in the array without using the number 5
//				
//					System.out.println(val[val.length -1]);
					
				// 4. Print out the element in the array at position 6, what happens?

//					System.out.println(val[val.length]);
//					 out of bounds
					
				// 5. Print out the element in the array at position -1, what happens?
					
//					System.out.println(val[-1]);
//					 out of bounds
					
				// 6. Write a traditional for loop that prints out each element in the array
					
//					for(int i = 0; i < val.length; i++) {
//						System.out.println(val[i]);
//					}
//					
				// 7. Write an enhanced for loop that prints out each element in the array
					
//					for(int n: val) {
//						System.out.println(n);
//					}
				
				// 8. Create a new variable called sum, write a loop that adds 
				//			each element in the array to the sum
						
//					int sum = 0;
//					for(int n: val) {
//						sum += n;
//					}
//					System.out.println(sum);			
					
					
				// 9. Create a new variable called average and assign the average value of the array to it

//					int average = sum / val.length;
//					System.out.println(average);
					
				// 10. Write an enhanced for loop that prints out each number in the array 
				//			only if the number is odd

//						for (int n: val) {
//							if (n % 2 == 1) {
//								System.out.println(n);
//							}
//						}
				
				// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
//		
//						String[] names = {"Sam", "Thomas", "Robert"};

				
				// 12. Calculate the sum of all the letters in the new array
//
//						int sum = 0;
//						
//						for (String name: names) {
//							sum += name.length();
//						}
//						System.out.println(sum);
				//
				// Methods:
				//
				
				// 13. Write and test a method that takes a String name and prints out a greeting. 
				//			This method returns nothing.
						
						
//				Scanner name = new Scanner(System.in);
//				System.out.println("Enter name");
//				
//				String userName = name.nextLine();
//				System.out.println("Howdy " + userName);
		//		
//				greet("Dolly");
//				
				// 14. Write and test a method that takes a String name and  
				//			returns a greeting.  Do not print in the method.
					
//		
//				greet2("Dolly Olly");
//				
					
				
				// Compare method 13 and method 14:  
				//		a. Analyze the difference between these two methods.
				//		b. What do you find? 
				//		c. How are they different?
				
				
				// 15. Write and test a method that takes a String and an int and 
//				//			returns true if the number of letters in the string is greater than the int
//				 
//				System.out.println(countLetters("Dolly", 5));
//				
				// 16. Write and test a method that takes an array of string and a string and 
				//			returns true if the string passed in exists in the array
				
//				System.out.println(isPresent(names, "Sam"));
				
				
				// 17. Write and test a method that takes an array of int and 
				//			returns the smallest number in the array
//			
//				System.out.println(isSmallestNum(val));
//				
				// 18. Write and test a method that takes an array of double and 
				//			returns the average
//					double [] value = {1, 5, 2, 8, 13, 6};
//					System.out.println(isAvg(value));

				// 19. Write and test a method that takes an array of Strings and 
				//			returns an array of int where each element
				//			matches the length of the string at that position

//					String[] names = {"Chappy", "Dan", "Billington"};
//					System.out.println(isWordLength(names));
					
						
				// 20. Write and test a method that takes an array of strings and 
				//			returns true if the sum of letters for all strings with an even amount of letters
				//			is greater than the sum of those with an odd amount of letters.
					
//					String[] names = {"Chappy", "Dan", "Billington", "Gladys"};
//					System.out.println(evenWordLengthIsGreater(names));
				// 21. Write and test a method that takes a string and 
				//			returns true if the string is a palindrome
					
					System.out.println(isPalindrome("racecar"));

				
				
	}	
	

			
			// Method 13:
	
//	public static void greet(String name) {
//	  System.out.println("hello, " + name);
//  }

			// Method 14:
//	
//	public static String greet2(String name) {						
//		return "Hello " + name;
//	}
			
			// Method 15:
//	public static boolean countLetters(String name, int letterNum ) {
//		return name.length() == letterNum;
//			
//		}
	
			
			// Method 16:
	
//	public static boolean isPresent(String[] names, String nameInput) {
//		for ( String name : names ) {
//			return name == nameInput;
//		}
//		return false;
//	}

			
			// Method 17:
	
//	public static int isSmallestNum(int[] array) {
//		int smallestNum = array[0];
//		
//		for (int num : array) {
//			if (smallestNum > num) {
//				smallestNum = num;
//			}
//		}
//		return smallestNum;
//	}

			
			// Method 18:

//	public static double isAvg(double[] num) {
//		
//		double sum = 0;
//		
//		for (double n: num) {
//			sum += n;
//			n++;
//		}
//		return sum;
//	}
			
			// Method 19:

//	public static int isWordLength(String[] names) {
//		for (String name: names) {
//			int lengthWord = name.length();
//			return lengthWord;
//		}
//	}	
	
			// Method 20:
//	public static boolean evenWordLengthIsGreater(String[] names) {
//		int evenWordsLengthTotal = 0;
//		int oddWordsLengthTotal = 0;
//		
//		for (String name : names) {
//			if (name.length() % 2 == 0) {
//				evenWordsLengthTotal += name.length();
//			} else {
//				oddWordsLengthTotal += name.length();
//			}
//			
//		}
//		return evenWordsLengthTotal > oddWordsLengthTotal;
//	}		
			
			// Method 21:
			
	public static boolean isPalindrome(String word) {
		String reverseWord = "";
		int strLength = word.length();
		
		for (int i = (strLength - 1); i > -1; i--) {
			reverseWord += word.charAt(i);
		}
		
		 return word.toLowerCase().equals(reverseWord.toLowerCase());
			
	
		
		
	}
		

	
	

}
