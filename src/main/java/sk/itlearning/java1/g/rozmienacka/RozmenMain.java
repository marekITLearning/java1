package sk.itlearning.java1.g.rozmienacka;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class RozmenMain {

	public static void main(String[] args) {

		// inicializacia poctu vydanych bankoviek na 0
		int[] vydavok = new int[15];

		// uvedena inicializacia pola vydavok je ekvivalentna nasledovnemu:
		// int[] vydavok = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		// inicializacia jednotlivych typov bankoviek
		double[] nominal = new double[] { 500.00, 200.00f, 100.00f, 50.00f, 20.00f, 10.00f,
				5.00f, 2.00f, 1.00f, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };

		System.out.print("Zadaj sumu na vydanie: ");

		// prevzatie hodnoty zadanej do konzoly
		Scanner sc = new Scanner(System.in);
		BigDecimal suma = new BigDecimal(sc.nextFloat());
		sc.close();

		// vypocet vydavkov
		for (int i = 0; i < nominal.length; i++) {
			while (suma.doubleValue() >= nominal[i]) {
				vydavok[i]++;
				suma = suma.subtract(new BigDecimal(nominal[i]));
				suma = suma.setScale(2, RoundingMode.HALF_UP);
				System.out.println(suma);
			}
		}

		// vypisanie vysledku
		for (int i = 0; i < nominal.length; i++) {
			System.out.println(nominal[i] + " - " + vydavok[i]);
		}

	}

}
