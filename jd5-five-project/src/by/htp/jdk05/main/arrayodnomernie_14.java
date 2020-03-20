package by.htp.jdk05.main;

import java.util.Random;
import java.util.Scanner;

public class arrayodnomernie_14 {

	public static void main(String[] args) {
		
	int n = 10;
	int [] arr;
	
	arr = initArray(n);	
	int min = 0, max = 0;
	min = getEvenNumbers1(arr, min);
	max = getEvenNumbers(arr, max);
	int z = max + min;
	print(z);

}
	
public static void print(int z) {
		
		System.out.println("Сумма:  " + z);
		
	}
	
public static int getEvenNumbers1(int [] sourse, int min) {
	
	for (int i = 2; i < sourse.length; i++) {
		
		if (i % 2 == 1 && sourse[i - 2] < sourse[i]) {
			
			min = sourse[i - 2];
			
		}
		else {
			min = sourse[i];
		}
		
	}
	
	return min;
	
}		

public static int getEvenNumbers(int [] sourse, int max) {
	
for (int i = 2; i < sourse.length; i++) {
		
		if (i % 2 == 0 && sourse[i - 2] < sourse[i]) {
			
			max = sourse[i];
			
		}
		
		else {
			max = sourse[i - 2];
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