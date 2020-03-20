package by.htp.jdk05.main;

import java.util.Random;

public class arrayodnomernie_18 {

	public static void main(String[] args) {

		int n = 10;

		int[] mas = new int[n];

		Random rand = new Random();

		int k;
		k = rand.nextInt(7);// произольный номер €чейки с первым кубиком

		int cub1;

		int cub2;
		cub2 = 0;

		int cub3;
		cub3 = 0;

		System.out.println("Ќомер €чейки с первым кубиком: " + k);

		cub1 = rand.nextInt(6) + 1;// произвольное значение первого кубика
		mas[k] = cub1;

		if (cub1 == 6) {

			cub2 = rand.nextInt(3) + 1;

			mas[k + 1] = cub2;

			cub3 = 10 - (mas[k] + mas[k + 1]);

			mas[k + 2] = cub3;
		}

		if (cub1 == 5) {

			cub2 = rand.nextInt(4) + 1;

			mas[k + 1] = cub2;

			cub3 = 10 - (mas[k] + mas[k + 1]);

			mas[k + 2] = cub3;

		}

		if (cub1 == 4) {

			cub2 = rand.nextInt(5) + 1;

			mas[k + 1] = cub2;

			cub3 = 10 - (mas[k] + mas[k + 1]);

			mas[k + 2] = cub3;

		}

		if (cub1 <= 3) {

			cub2 = rand.nextInt(6) + 1;

			mas[k + 1] = cub2;

			cub3 = 10 - (mas[k] + mas[k + 1]);

			mas[k + 2] = cub3;

		}

		System.out.println("≈сли на первом кубике выпало " + cub1 + " а на втором " + cub2 + " то третий кубик равен " + cub3);

		System.out.println("ячейки сейфа с кубиками: ");

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + "/");
		}

	}
	
}
