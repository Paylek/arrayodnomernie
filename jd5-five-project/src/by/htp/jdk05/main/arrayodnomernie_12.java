package by.htp.jdk05.main;

import java.util.Arrays;

public class arrayodnomernie_12 {

	public static void main(String[] args) {
		
	double[] arr = {1, 1.2, 1.4, 1.6, 1.8, 2, 2.2, 2.4, 4, 5, 5.5};
		
	arr = getEvenNumbers(arr);
	String intArrayString = Arrays.toString(arr);
	print(intArrayString);

}
	
public static void print(String intArrayString) {
		
		System.out.println("Массив: " + intArrayString);
		
	}
	
public static double[] getEvenNumbers(double [] source) {
	
	double [] dest = new double [source.length];
	
	double iDest = 0;
	
	for(int i = 0; i < source.length; i++) {
		
		if( source[i] == (int)source[i]) {
			
			dest[(int) iDest++] = source[i];
			
		}
		
	}
	
	if(iDest == 0) {
		
		System.out.println("There is no even numbers at all.");
		
	}
	
	return Arrays.copyOfRange(dest, 0, (int) iDest);	
	
}		
}