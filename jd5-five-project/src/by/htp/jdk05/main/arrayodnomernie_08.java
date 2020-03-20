package by.htp.jdk05.main;

import java.util.Random;

public class arrayodnomernie_08 {

	public static void main(String[] args) {
		
	int n = 10, p = 0, q = 0, z = 0;
	int [] arr;
	
	arr = initArray(n);
	
	p = Vivod1(arr, n, p);
	q = Vivod2(arr, n, q);
	z = Vivod3(arr, n, z);
	print(p, q, z);
	
}
	
public static void print(int p, int q, int z) {

	System.out.println("Положительных: " + p + " Отрицательных: " + q + " Нулевых: " + z);
		
	}
	
public static int Vivod2(int [] arr, int n, int q) {
	
	for (int i = 0; i < n; i++) {
		
			if (arr[i] < 0) {
				
				q++;
				
			}
		
	}
	
	return q;
	
}

public static int Vivod3(int [] arr, int n, int z) {
	
	for (int i = 0; i < n; i++) {
		
			if (arr[i] == 0) {
				
				z++;
				
			}
		
	}
	
	return z;
	
}

	public static int Vivod1(int [] arr, int n, int p) {
		
		for (int i = 0; i < n; i++) {
			
				if (arr[i] > 0) {
					
					p++;
					
				}
			
		}
		
		return p;
		
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