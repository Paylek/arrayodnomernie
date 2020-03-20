package by.htp.jdk05.main;

import java.util.Arrays;
import java.util.Random;

public class arrayodnomernie_09 {

	public static void main(String[] args) {
		
	int n = 10;
	int [] arr;
	
	arr = initArray(n);	
	int min = arr[0];
	int max = arr[0];
	int p = max;
	min = getMin(arr, min);
	max = getMax(arr, max);
	arr = getNumber(arr, max, min, p);
	
	String intArrayString = Arrays.toString(arr);
	print(intArrayString);

}
	
	public static int[] getNumber(int [] sourse, int max, int min, int p) {
		
			
			sourse[max] = sourse[min];
			sourse[min] = p;
		return sourse;
			
	}
	
public static void print(String intArrayString) {
		
		System.out.println("Массив: " + intArrayString);
		
	}

public static int getMax(int [] sourse, int max) {
	
	
	for (int i = 1; i < sourse.length; i++) {
		
		if (sourse[i - 1] < sourse[i]) {
			
			max = sourse[i];
			
		}
		
		else {
			
			max = sourse[i - 1];
			
		}
		
	}
	
	return max;
	
}		
	
public static int getMin(int [] sourse, int min) {
	
	
	for (int i = 1; i < sourse.length; i++) {
		
		if (sourse[i - 1] < sourse[i]) {
			
			min = sourse[i - 1];
			
		}
		
		else {
			
			min = sourse[i];
			
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