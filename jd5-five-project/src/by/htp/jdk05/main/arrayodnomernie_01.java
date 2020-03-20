package by.htp.jdk05.main;

import java.util.Random;
import java.util.Scanner;

public class arrayodnomernie_01 {

	public static void main(String[] args) {
		
	int k = scannerInt();
	int p = 0;
	int n = 10;
	int [] arr;
	
	arr = initArray(n);
	p = suMma(arr, n, k, p);
	
	print(p);
}
	
	public static void print(int p) {
		
		System.out.println("Сумма P: " + p);
		
	}
	
	public static int suMma(int [] arr, int n, int k, int p) {
		
		for (int i = 0; i < n; i++) {
			
			if (arr[i] % k == 0) {
				
				p += arr[i];
				
			}
			
		}
		
		return p;
		
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