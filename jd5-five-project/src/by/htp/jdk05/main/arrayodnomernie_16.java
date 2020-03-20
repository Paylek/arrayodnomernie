package by.htp.jdk05.main;

import java.util.Random;
import java.util.Scanner;

public class arrayodnomernie_16 {

	public static void main(String[] args) {
		
	int n = 10;
	int [] arr;
	
	arr = initArray(n);	
	int max = 0;
	max = getEvenNumbers1(arr, max, n);
	print(max);

}
	
public static void print(int max) {
		
		System.out.println("Максимальное число:  " + max);
		
	}
	
public static int getEvenNumbers1(int [] sourse, int max, int n) {
	
	for (int i = 1; i < n; i++) {
		
		for (int j = n - 1; j >= 1; j--) {
		
		if ((sourse[i - 1] + sourse[j]) < (sourse[i] + sourse[j - 1])) {
			
			max = sourse[i] + sourse[j - 1];
			
		}
		
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