package by.htp.jdk05.main;

import java.util.Random;
import java.util.Scanner;

public class arrayodnomernie_13 {

	public static void main(String[] args) {
		
	int n = 10;
	int M = scannerInt(), L = 2;
	int [] arr;
	
	arr = initArray(n);	
	int min = 0, max = 0;
	min = getEvenNumbers1(arr, min, M);
	max = getEvenNumbers(arr, max, L, n);
	print(min, max);

}
	
public static void print(int min, int max) {
		
		System.out.println("Повторяемость кратности М " + min + " Повторяемость в диапозоне " + max);
		
	}
	
public static int getEvenNumbers1(int [] sourse, int min, int M) {
	
	for (int i = 0; i < sourse.length; i++) {
		
		if (sourse[i] % M == 0) {
			
			min++;
			
		}
		
	}
	
	return min;
	
}		

public static int getEvenNumbers(int [] sourse, int max, int L, int n) {
	
	for (int i = 0; i < sourse.length; i++) {
		
		if (sourse[i] > L && sourse[i] < n) {
			
			max++;
			
		}
		
	}
	
	return max;
	
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
	
	System.out.println("Введите кратное число К: ");
	
	while(!in.hasNextInt()) {
		
		in.next();
		
		System.out.println("Некорректный ввод!\r ");
		System.out.println("Введите число: \r");
	}
	number = in.nextInt();

	return number;
	
}


}