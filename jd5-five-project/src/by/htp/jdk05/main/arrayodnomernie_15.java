package by.htp.jdk05.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class arrayodnomernie_15 {

	public static void main(String[] args) {
		
	int n = 10;
	int [] arr;
	int c = scannerInt();
	int d = scannerInt();
	arr = initArray(n);	
	arr = getEvenNumbers(arr, c, d);
	String intArrayString = Arrays.toString(arr);
	print(intArrayString);

}
	
public static void print(String intArrayString) {
		
		System.out.println("Массив: " + intArrayString);
		
	}
	
public static int[] getEvenNumbers(int [] source, int c, int d) {
	
	int [] dest = new int [source.length];
	
	int iDest = 0;
	
	for(int i = 0; i < source.length; i++) {
		
		if(c <= i && i <= d) {
			
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

public static int scannerInt() {
	
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	
	int number;
	
	System.out.println("Введите ограничения: ");
	
	while(!in.hasNextInt()) {
		
		in.next();
		
		System.out.println("Некорректный ввод!\r ");
		System.out.println("Введите число: \r");
	}
	number = in.nextInt();

	return number;
	
}

}