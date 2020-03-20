package by.htp.jdk05.main;

import java.util.Random;

public class arrayodnomernie_03 {

	public static void main(String[] args) {
		
	int n = 10, a = 0;
	int [] arr;
	
	arr = initArray(n);
	
	a = Vivod(arr, n, a);
	print(a);
	
}
	
public static void print(int a) {
	
		if (a == 1) {
			
		System.out.println("Первая цифра положительная");
		
		}
		
		else {
			
			System.out.println("Первая цифра отрицательная");
			
		}
		
	}
	
	public static int Vivod(int [] arr, int n, int a) {
		
		if (arr[0] > 0) {
			
			a = 1;
			
		}
		
		else {
			
			a = 0;
			
		}
		
		return a;
		
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