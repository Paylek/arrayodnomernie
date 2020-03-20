package by.htp.jdk05.main;

import java.util.Arrays;
import java.util.Random;

public class arrayodnomernie_19 {

	public static void main(String[] args) {

		int[] mas = new int[10];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			mas[i] = rand.nextInt(10);
		}

		System.out.println("Заданный массив: ");

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + "/");
		}

		int[] popular = new int[mas.length];

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas.length; j++) {

				if (mas[i] == mas[j]) {

					popular[i] = popular[i] + 1;
				}
			}
		}

		int num = mas[0];

		int kolSovp = popular[0];

		for (int i = 0; i < popular.length; i++) {

			if (popular[i] > kolSovp) {

				kolSovp = popular[i];

				num = mas[i];
			}
			if ((kolSovp == popular[i]) && (mas[i] < num)) {

				num = mas[i];
			}
		}

		System.out.println("\nЧисло " + num + " повторяется " + kolSovp + " раза ");

	}

}