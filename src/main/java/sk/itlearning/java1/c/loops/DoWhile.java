package sk.itlearning.java1.c.loops;

public class DoWhile {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;

		// blok cyklu while sa nemusi vykonat ani raz
		while (i > 0) {
			i++;
		}

		System.out.println(i);

		// s do while sa telo cyklu vzdy vykona min. jeden krat
		do {
			j++;
		} while (j < 0);

		System.out.println(j);
	}

}
