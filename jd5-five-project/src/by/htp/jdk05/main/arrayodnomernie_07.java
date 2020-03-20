package by.htp.jdk05.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class arrayodnomernie_07 {

	public static void main(String[] args) {
		
	int k = scannerInt();
	int p = 0;
	int n = 10;
	int [] arr;
	
	arr = initArray(n);
	p = getEvenNumbers1(arr, k, p);
	arr = getEvenNumbers(arr, k, p);

	
	String intArrayString = Arrays.toString(arr);
	print(intArrayString, p);

}
	
public static void print(String intArrayString, int p) {
		
		System.out.println("Массив: " + intArrayString);
		System.out.println("Повторяемость замен: " + p);
		
	}
	
public static int getEvenNumbers1(int [] arr, int k, int p) {
	
	
	for(int i = 0; i < arr.length; i++) {
		
		if( arr[i] > k) {
			
			p++;
			
		}
		
	}
	
	
	return p;	
	
}		

	public static int[] getEvenNumbers(int [] arr, int k, int p) {
		
		
		for(int i = 0; i < arr.length; i++) {
			
			if( arr[i] > k) {
				
				arr[i] = k;
				p++;
				
			}
			
		}
		
		
		return arr;	
		
	}		

public static int[] initArray(int n) {

	  int [] arr = new int[n];
		
		Random ran = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(10);

		}
		return arr;
	}

public static int scannerInt() {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int number;
		
		System.out.println("Введите число К: ");
		
		while(!in.hasNextInt()) {
			
			in.next();
			
			System.out.println("Некорректный ввод!\r ");
			System.out.println("Введите число: \r");
		}
		number = in.nextInt();
	
		return number;
		
	}


}