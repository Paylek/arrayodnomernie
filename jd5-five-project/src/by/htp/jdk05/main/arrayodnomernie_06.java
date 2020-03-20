package by.htp.jdk05.main;

import java.util.Random;

public class arrayodnomernie_06 {

	public static void main(String[] args) {
		
	int n = 10;
	int [] arr;
	
	arr = initArray(n);	
	int min = arr[0];
	min = getEvenNumbers(arr, min);
	print(min);

}
	
public static void print(int min) {
		
		System.out.println("минимальное расстояние: " + min);
		
	}
	
public static int getEvenNumbers(int [] sourse, int min) {
	
	
	for (int i = 2; i < sourse.length; i++) {
		
		if (Math.abs(sourse[i - 2] - sourse[i - 1]) < Math.abs(sourse[i - 1] - sourse[i])) {
			
			min = Math.abs(sourse[i - 2] - sourse[i - 1]);
			
		}
		
		else {
			
			min = Math.abs(sourse[i - 1] - sourse[i]);
			
		}
		
	}
	
	return min;
	
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