package by.htp.jdk05.main;

import java.util.Random;

public class arrayodnomernie_20 {

public static void main(String[] args) {
		
		int n = 10;

		int[] mas = new int[n];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			mas[i] = rand.nextInt(10);
		}

		System.out.println("Заданный массив: ");

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + "/");
		}
		
		for (int k = 1; k < mas.length - 1; k++) { // сдвиг последующих элементов

				for (int m = k + 2; m < mas.length - 1; m++) {

					mas[m] = mas[m + 1];
				}

			mas[k] = mas[k + 1];

		}
		n = n - (n / 2);//сжатие массива
		
		System.out.println("\nПолученый массив ");
		
		for (int i = 0; i < n; i++) {

			System.out.print(mas[i] + "/");
		}
	}
	
}
