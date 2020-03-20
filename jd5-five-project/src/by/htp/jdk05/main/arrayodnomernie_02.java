package by.htp.jdk05.main;

import java.util.Arrays;
import java.util.Random;

public class arrayodnomernie_02 {
	
	public static void main(String[] args) {
		
		int n = 10;
		int [] arr;
		
		arr = initArray(n);
		String intArrayString = Arrays.toString(arr);
		print(intArrayString);
		
	}
	
public static void print(String intArrayString) {
		
		System.out.println("Массив: " + intArrayString);
		
	}

public static int[] initArray(int n) {

	  int [] arr = new int[n];
		
		Random ran = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(10);

		}
		for (int i = 0; i < n; i++) {
			
			arr[i] = arr[0];
			
		}
		
		return arr;
	}

}
