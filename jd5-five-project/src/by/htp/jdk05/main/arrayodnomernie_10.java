package by.htp.jdk05.main;

import java.util.Arrays;
import java.util.Random;

public class arrayodnomernie_10 {

	public static void main(String[] args) {
		
	int n = 10;
	int [] arr;
	
	arr = initArray(n);	
	arr = getEvenNumbers(arr);
	String intArrayString = Arrays.toString(arr);
	print(intArrayString);

}
	
public static void print(String intArrayString) {
		
		System.out.println("Массив: " + intArrayString);
		
	}
	
public static int[] getEvenNumbers(int [] source) {
	
	int [] dest = new int [source.length];
	
	int iDest = 0;
	
	for(int i = 0; i < source.length; i++) {
		
		if( source[i] > i) {
			
			dest[iDest++] = source[i];
			
		}
		
	}
	
	if(iDest == 0) {
		
		System.out.println("There is no even numbers at all.");
		
	}
	
	return Arrays.copyOfRange(dest, 0, iDest);	
	
}		

public static int[] initArray(int n) {

	  int [] arr = new int[n];
		
		Random ran = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(10) ;

		}
		return arr;
	}

}