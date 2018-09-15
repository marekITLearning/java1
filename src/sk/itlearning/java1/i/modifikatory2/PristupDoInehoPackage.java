package sk.itlearning.java1.i.modifikatory2;

import sk.itlearning.java1.i.modifikatory1.*;

public class PristupDoInehoPackage extends TriedaPublic {

	public static void main(String[] args) {

		// pristup uz nie je povoleny, tato trieda je v inom package ako TriedaPackage,
		// ktora nema pristupovy modifikator a pristup ku nej je obmedzeny na triedy v tom istom package
		// TriedaPackage p1 = new TriedaPackage();

		// pristup povoleny, lebo pristupujeme ku public triede, ktora
		// je viditelna odvsadial
		TriedaPublic p2 = new TriedaPublic();

//		 p2.premennaPrivate = "nemozno pristupovat ku private clenu inej triedy";

//		 p2.premennaPackage = "nemozno pristupovat z ineho package ku clenu triedy, ktoreho pristup je package private";

//		 p2.premennaProtected = "nemozno pristupovat ku protected clenu v inom package, pristup ma iba potomok";

		p2.premennaPublic = "ok"; // ok, ku public clenovi triedy mozno pristupovat odvsadial

		PristupDoInehoPackage ix = new PristupDoInehoPackage();
		System.out.println(ix.premennaProtected);

	}
}
