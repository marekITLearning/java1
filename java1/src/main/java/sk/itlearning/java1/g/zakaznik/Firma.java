package sk.itlearning.java1.g.zakaznik;

public class Firma implements Zakaznik {

	private String ico;
	
	private String nazov;
	
	public Firma(String ico, String nazov) {
		setIco(ico);
		setNazov(nazov);
	}

	public String getIco() {
		return ico;
	}

	public void setIco(String ico) {
		this.ico = ico;
	}

	public String getNazov() {
		return nazov;
	}

	public void setNazov(String nazov) {
		this.nazov = nazov;
	}
	
	@Override
	public String getId() {
		return getIco();
	}
	
}
