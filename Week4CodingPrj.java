package com.promineotech;
import java.io.*;
import java.util.*;

public class Week4CodingPrj 
{
	
	public static void main(String[] args) 
	{
	
		// Step 1:
		arrayLengthAndAverage();
		
		//3
		//last element of an array = names[names.length-1];
		
		//4
		//first element of an array = names[0];

		
		double[] firstArr = { 45.3, 67.5, -45.6, 20.55, 33.0, 45.6 };
		double[] secondArr = { 45.3, 67.5, -45.6, 20.80, 33.0, 45.6 };
		boolean a = avgFirstArrGT(firstArr, secondArr);
		System.out.println(a);
		
		double[] firstArr2 = { 45.3, 67.5, -45.6, 20.55, 33.0, 45.6 };
		double a2 = avgDblArr(firstArr2);
		System.out.println(a2);

		int[] firstArr3 = { 2,3,4,5,6,90 };
		boolean a3 = sumGT100(firstArr3);
		System.out.println(a3);
		
		String a4 = fullName("anthony", "gonsalvez");
		System.out.println(a4);
		
		String a1 = wordNtimes("testing", 2);
		System.out.println(a1);
		
		System.out.println(nameLengths());
		
		int s1 = sumArray(nameLengths());
		System.out.println(s1);
	}
		private static void  arrayLengthAndAverage() 
		{
			 //1.a
			 int[] ages = new int[] {3,9,23,64,2,8,28,93};
			
			 int firstElement  = ages[0];
			 int lastElement = ages[ages.length-1];
		
			 System.out.println("Age Diff1="+ (lastElement-firstElement) );
		
			 //	1.b
			 int[] ages2 = new int[] {3, 9, 23, 64, 2, 8, 28, 93, 30,50};
		
			 int firstElement2  = ages2[0];
			 int lastElement2 = ages2[ages2.length-1];
		
			 System.out.println("Age Diff2="+ (lastElement2-firstElement2) );
		
			 double average = 0.0;
			 int total=0;
			 for(int i =0; i<ages2.length; i++ )
			 {
				 total += ages2[i];
			 }
			 average = (double)(total/ages2.length);
			 System.out.println("Average="+average);

		}
	
	/* 5. Create a new array of int called nameLengths. Write a loop to iterate over the 
	 * previously created names array and add the length of each name to the nameLengths array.	
	 */
	private static int[] nameLengths() {
		String[] names = {"Sammy", "Tommy", "Timmy", "Sally", "Buckky", "Bob"};
		int[] lengths = new int[names.length];
		
		System.out.println(names[0]);
        
        for (int i = 0; i < names.length; i++) {
        	System.out.println(names[i].length());
        	lengths[i] = names[i].length();
        }        
        return lengths;
	}

	/* 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the 
	 * elements in the array. Print the result to the console
	 */
	
	private static int sumArray(int[] firstArr) {
        int sum = 0;
	        
        for (int num: firstArr) {
	           sum += num;
	    }
        System.out.println("Sum is"+ sum);
        return sum;
   	
	}
	
	/*7.  Write a method that takes a String, word, and an int, n, as arguments and returns 
	the word concatenated to itself n number of times. 
	(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”). */

	private static String wordNtimes(String word, int num) {
		String str = "";

        for (int i = 1; i <=num; i++) {
            str += word;
         }
		return str;
}
	
	
	
	
	/* 8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
	 * (the full name should be the first and the last name as a String separated by a space).
	 */
	
	private static String fullName(String fName, String lName) {
			return (fName +" "+ lName);
	}
	
	/*Q 9 Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100*/
	private static boolean sumGT100(int[] firstArr) {
        int sum = 0;
        for (int num: firstArr) {
           sum += num;
        }
        System.out.println("Sum is"+ sum);
        if (sum > 100)
        	return true;
        return false;
      	
		}
	
	
	/*Q 10 Write a method that takes an array of double and returns the average of all the elements in the array.*/
	private static double avgDblArr(double[] firstArr) {
        double sum = 0.0;
        for (double num: firstArr) {
           sum += num;
        }
        double avg = sum / firstArr.length;
        return avg;
		}
	
	/* 11. Write a method that takes two arrays of double and returns true if the average of the 
	 * elements in the first array is greater than the average of the elements in 
	 * the second array.*/
	private static boolean avgFirstArrGT(double[] firstArr, double[] secondArr) {
        double sum = 0.0;
        for (double num: firstArr) {
           sum += num;
        }
        double avgFirst = sum / firstArr.length;
        
        sum = 0.0;
        for (double num: secondArr) {
            sum += num;
         }

         double avgSecond = sum / secondArr.length;		
		
		 if (avgFirst > avgSecond)
			return true;
		 return false;
		}
	
	/* 12. Write a method called willBuyDrink that takes a boolean isHotOutside, 
	 * and a double moneyInPocket, 
	 * and returns true if it is hot outside and if moneyInPocket is greater than 10.50*/
		
	private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50)
			return true;
		return false;
	}
	
	
}



