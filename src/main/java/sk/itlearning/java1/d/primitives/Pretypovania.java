package sk.itlearning.java1.d.primitives;

public class Pretypovania {

	public static void main(String[] args) {

		byte b = 127;

		// mensi typ mozme priradit do vecsieho
		int i = b;
		System.out.println(i);

		// vecsi typ nemozno priradit do mensieho
		int i2 = 128;
		// b = i2;

		// ale mozme vecsi typ explicitne pretypovat na mensi typ
		// toto je ale nezmyselne a riskujeme pretecenie premennej, kedy vysledok bude "prekvapujuci"
		b = (byte) i2;
		System.out.println(b);

		float f = 5.0f;
		double d = 10.0;

		d = f;
		System.out.println(d);

		// opet pouzitie explicitneho pretypovania, opet riskantne, nespravne
		f = (float) d;
		System.out.println(f);

		// automaticke pretypovania pri operaciach
		System.out.println(i);
		System.out.println(i + d);
		
		double d2 = new Double(20);
		System.out.println(d2);
		System.out.println( Double.MAX_VALUE );
		Double d3 = 8.7;
		System.out.println(d3.toString());

	}

}
