package com.revature.eval.java.core;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class EvaluationService {

	/**
	 * 1.A Speed Converter - Convert to MilesPerHour
	 * 
	 * Write a method called toMilesPerHour that has 1 parameter of type double with
	 * the name kilometersPerHour. This method needs to return the rounded value of
	 * the calculation of type long.
	 * 
	 * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour
	 * needs to return -1 to indicate an invalid value.
	 * 
	 * Otherwise if it is positive, calculate the value of miles per hour, round it
	 * and return it. For conversion and rounding use Math.round().
	 */
	static class SpeedConverter {

		public static long toMilesPerHour(double kilometersPerHour) {
			// DONE Write an implementation for this method declaration
			if (kilometersPerHour < 0) {
				return -1;
			} else {
				long milesPerHour = Math.round(0.62 * kilometersPerHour);
				return  milesPerHour;
			}
//			return 0;
		}

		/**
		 * 1.B Speed Converter - Print Conversion
		 * 
		 * Write another method called printConversion with 1 parameter of type double
		 * with the name kilometersPerHour. This method needs to return a String and
		 * needs to calculate milesPerHour from the kilometersPerHour parameter.
		 * 
		 * The String should print in the format: "XX km/h = YY mi/h"
		 * 
		 * XX represents the original value kilometersPerHour. YY represents the rounded
		 * milesPerHour from the kilometersPerHour parameter.
		 * 
		 * If the parameter kilometersPerHour is < 0, then print the text "Invalid
		 * Value"
		 */
		public static String printConversion(double kilometersPerHour) {
			// DONE Write an implementation for this method declaration
			String result = "Pending" ;
			if (kilometersPerHour < 0) {
				result = "Invalid Value" ;
			} else {
//				double mPH = (kilometersPerHour / 1.609);
				int milesPerHour = (int) Math.round(kilometersPerHour / 1.609);
				result = (kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
			}
			return result;
		}
	}

	/**
	 * 2. MegaBytes and KiloBytes
	 * 
	 * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type
	 * int with the name kiloBytes.
	 * 
	 * The method should return a String and it needs to calculate the megabytes and
	 * remaining kilobytes from the kilobytes parameter.
	 * 
	 * Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
	 * 
	 * XX represents the original value kiloBytes. YY represents the calculated
	 * megabytes. ZZ represents the calculated remaining kilobytes.
	 * 
	 * For examples, when the parameter kiloBytes is 2500 it needs to print "2500 KB
	 * = 2 MB and 452 KB"
	 * 
	 * If the parameter kiloBytes is less than 0 then print the text "Invalid
	 * Value".
	 */
	public String printMegaBytesAndKiloBytes(int XX) {
		String answer = "Pending" ;
		if (XX < 0) { 
				answer = ("Invalid Value") ;
		} else { 
				int meg = (XX / 1024) ;
				int kil = (XX % 1024) ;
				answer = (XX + " KB = " + meg + " MB and " + kil + " KB");
		}
		
		// DONE Write an implementation for this method declaration
		return answer;
	}

	/**
	 * 3. Barking Dog
	 * 
	 * We have a dog that loves to bark. We need to wake up if the dog is barking at
	 * night!
	 * 
	 * Write a method shouldWakeUp that has 2 parameters.
	 * 
	 * 1st parameter should be of type boolean and be named "barking". It represents
	 * if our dog is currently barking. 2nd parameter represents the hour of the day
	 * and is of type int with the name hourOfDay and has a valid range of 0-23.
	 * 
	 * We have to wake up if the dog is barking before 8 or after 22 hours, so in
	 * that case return true.
	 * 
	 * In all other cases return false.
	 * 
	 * If the hourOfDay parameter is less than 0 or greater than 23, return false.
	 */
	public boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
		if (hourOfDay < 0 || hourOfDay > 23) {
			return false;
		} else {
		if (isBarking == true) {
			if (hourOfDay < 8 || hourOfDay > 22) {
			return true;
			} else {
				return false ;
			}
		} else {
			return false ;
		}
		}
		// DONE Write an implementation for this method declaration
}
		

	/**
	 * 4. DecimalComparator
	 * 
	 * Write a method areEqualByThreeDecimalPlaces with two parameters of type
	 * double.
	 * 
	 * The method should return boolean and it needs to return true if two double
	 * numbers are the same up to three decimal places.
	 * 
	 * Otherwise, return false;
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
		// DONE Write an implementation for this method declarationDecimalFormat.setRoundingMode(RoundingMode.FLOOR(
		
		firstNum = firstNum * 1000;
		secondNum = secondNum * 1000;
		int first = (int) firstNum ;
		int second = (int) secondNum ;
		
//		System.out.println(first);
//		System.out.println(second);

		if (first == second) {
			return true;
	} else {
		return false;
	}
	}

	/**
	 * 5. Teen Number Checker
	 * 
	 * We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
	 * Write a method named hasTeen with 3 parameters of type int.
	 * 
	 * The method should return boolean and it needs to return true if ONE of the
	 * parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return
	 * false.
	 */
	static class TeenNumberChecker {

		public static boolean hasTeen(int x, int y, int z) {
//			if ((x >= 13 && x <= 19) || (y >= 13 && y <= 19) || (z >= 13 && z <= 19)) {
//			return true;
			if (( isTeen(x) || isTeen(y) || isTeen(z) )) {
				return true;
			} else {
			// DONE Write an implementation for this method declaration
			return false;
		}
		}
	}

		// We can initialize isTeen method first
		// Then pass the parameter to hasTeen method

		public static boolean isTeen(int number) {
			
			if ((number >= 13) && (number <= 19)) {
			
			return true;
			
		} else {		
			
			// DONE Write an implementation for this method declaration
			return false;
		}
	}

	/**
	 * 6. Minutes To Years and Days Calculator
	 * 
	 * Write a method printYearsAndDays with parameter of type long named minutes.
	 * The method should not return anything (void) and it needs to calculate the
	 * years and days from the minutes parameter.
	 * 
	 * If the parameter is less than 0, print text "Invalid Value".
	 * 
	 * Otherwise, if the parameter is valid then it needs to print a message in the
	 * format "XX min = YY y and ZZ d".
	 * 
	 * XX represents the original value minutes. YY represents the calculated years.
	 * ZZ represents the calculated days.
	 */
	public String printYearsAndDays(long minutes) {
		String answer = ("Pending");
		if (minutes < 0) {
			System.out.println("Invalid Value");
		} else { 
			long years = (minutes / 525600);
			long leftovers = (minutes % 525600);
			long days = (leftovers / 1440);
			answer = (minutes + " min = " + years + " y and " + days + " d");
			System.out.println(answer);
		}
		// DONE Write an implementation for this method declaration
		return answer;
	}

	/**
	 * 7. Number In Word
	 * 
	 * Write a method called printNumberInWord. The method has one parameter number
	 * which is the whole number. The method needs to print "ZERO", "ONE", "TWO",
	 * ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other
	 * for any other number including negative numbers. You can use if-else
	 * statement or switch statement whatever is easier for you.
	 */
	public String printNumberInWord(int number) {
		// DONE Write an implementation for this method declaration
		if ((number % 1) != 0) {
			String error = ("OTHER");
			return error;
		}
		String prefix = ("");
		String word = ("pending");
		if (number<0) {
			prefix = "NEGATIVE ";
		}
		number = Math.abs(number);
		switch (number) {
		case 0: 
			word=("ZERO");
			break;
		case 1: 
			word=("ONE");
			break;
		case 2: 
			word=("TWO");
			break;
		case 3: 
			word=("THREE");
			break;
		case 4: 
			word=("FOUR");
			break;
		case 5: 
			word=("FIVE");
			break;
		case 6: 
			word=("SIX");
			break;
		case 7: 
			word=("SEVEN");
			break;
		case 8: 
			word=("EIGHT");
			break;
		case 9: 
			word=("NINE");
			break;
		default: 
			word=("OTHER");
			break;
		}
		System.out.println(prefix + word);
		String answer = (prefix + word);
		return answer;
		
		}
		

	/**
	 * 8. Greatest Common Divisor
	 * 
	 * Write a method named getGreatestCommonDivisor with two parameters of type int
	 * named first and second.
	 * 
	 * If one of the parameters is < 10, the method should return -1 to indicate an
	 * invalid value. The method should return the greatest common divisor of the
	 * two numbers (int).
	 * 
	 * The greatest common divisor is the largest positive integer that can fully
	 * divide each of the integers (i.e. without leaving a remainder).
	 * 
	 * For example 12 and 30: 12 can be divided by 1, 2, 3, 4, 6, 12 30 can be
	 * divided by 1, 2, 3, 5, 6, 10, 15, 30
	 * 
	 * The greatest common divisor is 6 since both 12 and 30 can be divided by 6,
	 * and there is no resulting remainder.
	 */
	public int getGreatestCommonDivisor(int first, int second) {
		if ((first < 10) || (second < 10)) {
			return -1;
		} else {
			int divisor = (first);
			while (divisor > 0) {
				if ((first % divisor) == 0) {
					System.out.println("Testing: " + divisor);
					if ((second % divisor) == 0) {
						System.out.println(divisor + " is the greatest common divisor.");
						return divisor;
					}
					--divisor;
				} else {
					System.out.println(divisor + " is not a divisor of the first number.");
					--divisor;
				}
			}
		}		
		// DONE Write an implementation for this method declaration
		return 0;
	}

	/**
	 * 9. First and Last Digit Sum
	 * 
	 * Write a method named sumFirstAndLastDigit with one parameter of type int
	 * called number.
	 * 
	 * The method needs to find the first and the last digit of the parameter number
	 * passed to the method, using a loop and return the sum of the first and the
	 * last digit of that number.
	 * 
	 * If the number is negative then the method needs to return -1 to indicate an
	 * invalid value.
	 */
	public int sumFirstAndLastDigit(int num) {
		if (num < 0) {
			return -1;
		} else {
			int count = 1;
			int digOne = 0;
			int digTwo = 0;
//				LinkedList<Integer> stack = new LinkedList<Integer>();
				while((num % 10) > 0) {
					System.out.println(num % 10);
					int digit = (num%10);
					if (count > 0) {
						digOne = digit;
						--count;
					} else {
						if (num < 10) {
							digTwo = digit;
						}
					}
					num /= 10;
				}
				return (digOne + digTwo);
		
		}
		// DONE Write an implementation for this method declaration
//		return 0;
	}

	/**
	 * 10. Reverse String
	 * 
	 * Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 */
	public String reverse(String string) {
		// DONE Write an implementation for this method declaration
		String answer = "";
		char[] split = string.toCharArray();
		int count = (split.length - 1);
		while (count >= 0) {
			answer = (answer + split[count]);
			--count;
		}
		return answer;
	}

	/**
	 * 11. Acronyms
	 * 
	 * Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 */
	public String acronym(String phrase) {
		String answer = "";
		String[] chopped = phrase.split("[ !@#$%^&*\\-]");
		for (String word : chopped) {
			char[] split = word.toCharArray();
			answer = (answer + split[0]);	
			answer = answer.toUpperCase();
		}
		// DONE Write an implementation for this method declaration
		return answer;
	}

	/**
	 * 12. Triangles
	 * 
	 * Determine if a triangle is equilateral, isosceles, or scalene. An equilateral
	 * triangle has all three sides the same length. An isosceles triangle has at
	 * least two sides the same length.
	 * 
	 * (It is sometimes specified as having exactly two sides the same length, but
	 * for the purposes of this exercise we'll say at least two.) A scalene triangle
	 * has all sides of different lengths.
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			if (( sideOne == sideTwo) && (sideOne == sideThree)) {
			return true;
		} else {
			// DONE Write an implementation for this method declaration
			return false;
		}
		}
		public boolean isIsosceles() {
			if (( sideOne == sideTwo) || ( sideOne == sideThree) || ( sideTwo == sideThree)) {	
			// DONE Write an implementation for this method declaration
			return true;
		} else {
			return false;
		}
		}
		public boolean isScalene() {
			if ((sideOne != sideTwo ) && (sideTwo != sideThree)) {
			// DONE Write an implementation for this method declaration
			return true;
		} else {
			return false;
		}

	}
	}
	/**
	 * 13. Scrabble Score
	 * 
	 * Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 */
	public int getScrabbleScore(String string) {
//		System.out.println(string);
		string = string.toLowerCase();
//		System.out.println(string);
		int answer = 0;
//		System.out.println(string.length());
		
		for (int i = 0 ; i < string.length() ; i++){
//			System.out.println(i);
			String snippet = string.substring(i,i+1);
//			System.out.println(snippet);
			if ( snippet.matches("z|q")) {
				answer += 10;
			} else if ( snippet.matches("j|x")) {
				answer += 8;
			} else if ( snippet.matches("k")) {
				answer += 5;
			} else if ( snippet.matches("f|h|v|w|y")){
				answer += 4;
			} else if ( snippet.matches("b|c|m|p")) {
				answer += 3;
			} else if ( snippet.matches("d|g")) {
				answer += 2;
			} else if ( snippet.matches("a|e|i|o|u|l|n|r|s|t")) {
				answer += 1;
			} else {System.out.println("oops"); //return 0;
//		System.out.println(answer);
	}
		}
//		System.out.println(answer);		
		return answer;
	}
		// DONE Write an implementation for this method declaration
	
	/**
	 * 14. Clean the Phone Number
	 * 
	 * Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {

		String answer = "";

		for (int i = 0 ; i < string.length() ; i++){
			String toClean = string.substring(i,i+1);
			//			System.out.println(toClean);
			if ( toClean.matches("0|1|2|3|4|5|6|7|8|9")) {
				answer = answer + toClean;
			} else { System.out.println("Filtering " + toClean);
			}
		}
		if ((answer.charAt(0) == 1) || (answer.charAt(3)) == 1){
			return "Error";
		}

		if ((answer.length() > 10) || (answer.length() < 10)) {
			throw new IllegalArgumentException("Incorrect number of digits.");
		}

		//		System.out.println(answer);
			return answer;
	}
	/**
	 * 15. Recurring Word Counter
	 * 
	 * Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 */
	public Map<String, Integer> wordCount(String string) {
		// DONE Write an implementation for this method declaration
			Map<String, Integer> nameAndCount = new HashMap<String, Integer>();
			string = string.replaceAll("\\n", "");
			System.out.println(string);
			String[] words = string.split(" |,");
			for(String word : words) {
				Integer count = nameAndCount.get(word);
				if ( count == null ) {
					nameAndCount.put(word, 1);
				} else {
					nameAndCount.put(word, ++count);
				}
				
		
	}
			System.out.println(nameAndCount);

			return nameAndCount;
	}
	/**
	 * 16. Armstrong Number
	 * 
	 * An Armstrong number is a number that is the sum of its own digits each raised
	 * to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 */
	public boolean isArmstrongNumber(int input) {
		int eval = 0;
		int workNumber = input;
//				System.out.println(input);
//		String getDigits = int.toString(input);
		int length = String.valueOf(workNumber).length();
//		System.out.println(length);
		int[] digitArray = new int[length];
		for(int i = 0 ; i < length ; i++) {
			digitArray[i] = workNumber % 10;
			workNumber /= 10;
		}
//		System.out.println(digitArray[1]);
		for(int i = 0 ; i < length ; i++) {
			eval = (int) (eval + Math.pow(digitArray[i], length));
		}
		
//		System.out.println(eval);
		if (eval == input ) {
			System.out.println( eval + " equals " + input);
			return true;
		} else {
			System.out.println( eval + " does not equal " + input);

		return false;
		}
	}
	// DONE Write an implementation for this method declaration

	/**
	 * 17. Prime Factors
	 * 
	 * Compute the prime factors of a given natural number. A prime number is only
	 * evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 */	

	public List<Long> calculatePrimeFactorsOf(long l) {
		List<Long> factorSet = new CopyOnWriteArrayList<Long>();
		// DONE Write an implementation for this method declaration
			while (l % 2 == 0) {
				long dumbLong = 2;
				factorSet.add(dumbLong);
				l /= 2;
			}	
			for ( long i = 3 ; i < l / 2 ; i++ ) {
//				System.out.println(l/2);
//				System.out.println(i);
				while ( l % i == 0 ) {
					System.out.println(l + " / " + i + " = " + l/i);
					factorSet.add(i);
					l /= i;
					
				}
				
			}
			if(l>2) {
				factorSet.add(l);
		}
			System.out.println(factorSet);
			return factorSet;
	}
			

	

	/**
	 * 18. Calculate Nth Prime
	 * 
	 * Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 */
	public int calculateNthPrime(int k) {
		// DONE Write an implementation for this method declaration
		System.out.println(k);
		if (k == 0) {
			throw new IllegalArgumentException("Number must be positive");		}
		if (k == 1) {
			return 2;
		}		
		if (k == 2 ) {
			return 3;
		}
		int primeCount = 3;
		int candidate = 4;
		int divisor = 2;
		while (divisor < candidate) {
			if (divisor == (candidate - 1 )) {
				System.out.println(candidate + " is prime.");
				if (primeCount == k) {
					break;
				}	
				primeCount ++;
				candidate++;
				divisor = 2;
			} else if ((candidate % divisor ) != 0) {
//				System.out.println(candidate + " / " + divisor + " continuing");
				divisor++;			
			} else if (( candidate % divisor ) == 0) {
//				System.out.println(candidate + " is not prime.");
				candidate++;
				divisor = 2;
		}
	}
		return candidate;
	}

	/**
	 * 19. Pangram
	 * 
	 * Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 */
	public boolean isPangram(String string) {
		// DONE Write an implementation for this method declaration
		string = string.toLowerCase();
		int count = 0;
//		System.out.println(string);
		String[] testArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
//		System.out.println(testArray[0]);

		for ( int i = 0 ; i < 26 ; i++ ) {
//			System.out.println(i);
			if ( string.contains(testArray[i])) {
//				System.out.println(i);
				System.out.println(testArray[i] + " matched.");
				count++;
			}
		}
				if (count == 26) {
					return true;
				} else {
					return false;
				}
				
	}
		
	
	/**
	 * 20. Sum of Multiples 
	 * 
	 * Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 */
	public int getSumOfMultiples(int i, int[] set) {
//		System.out.println(i);
//		System.out.println(set[0]);
//		System.out.println(set[1]);
		int answer = 0;
//		System.out.println(set.length);
		Set<Integer> multSet = new HashSet<Integer>();
		int count = 1;
		for (int j = 0 ; j < set.length ; j++) {
//			System.out.println(j);
		while ((set[j] * count) < i) {
			Integer nextMult = (set[j] * count);
//			System.out.println(nextMult);
			multSet.add(nextMult);
			count++;
		} count = 1;
		}
//		System.out.println(multSet);
		
		for (Integer e : multSet) answer += e ;
		System.out.println(answer);
		return answer;
	}


	
	/**
	 * 21. Three Magic Numbers
	 * 
	 * You work at a casino in Las Vegas.  Your job is to program a slot machine to
	 * return 3 random numbers using the java.util.Random class.
	 * 
	 * Write a method to return an int array of 3 random numbers between 1 - 100.
	 * Generate the 3 random numbers (1 - 100 inclusive) using the java.util.Random class.
	 */
	
	public int[] threeLuckyNumbers() {
		int[] wheels = new int[3];
		wheels[0] = (int)(Math.random() * (100 - 1) + 1);
		wheels[1] = (int)(Math.random() * (100 - 1) + 1);
		wheels[2] = (int)(Math.random() * (100 - 1) + 1);


		return wheels;
	}
	
	/*
	 * 22. Easy Guessing Game
	 * 
	 * Create a program to generate a number between the given range:
	 * int x = minimum
	 * iny y = maximum (inclusive)
	 * 
	 * You must use the Math.random class to generate a random number between x and y.
	 */
	
	public int guessingGame(int x, int y) {
		int rando = (int)(Math.random() * (x - y) + y);
		return rando;
	}
}
