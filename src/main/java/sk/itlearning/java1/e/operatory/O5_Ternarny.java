package sk.itlearning.java1.e.operatory;

public class O5_Ternarny {

	private static String s1 = "hello";

	public static void main(String[] args) {

		// ternarny operator pouzivame pre podmienecne priradovanie

		s1 = s1 == null ? "null" : s1.toUpperCase();

		System.out.println(s1);

		// takto sme zjednodusili zapis, ktory by sme inak museli zapisat nasledovne:

		if (s1 == null) {
			s1 = "null";
		} else {
			s1 = s1.toUpperCase();
		}

	}

}
