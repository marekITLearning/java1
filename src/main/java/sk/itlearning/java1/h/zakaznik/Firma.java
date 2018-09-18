package sk.itlearning.java1.h.zakaznik;

public class Firma implements Zakaznik {

	private String ico;
	String nazov;

	public Firma(String ico, String nazov) {
		setIco(ico);
//		nazov = y;
	}

	public String getIco() {
		return ico;
	}

	public void setIco(String ico) {
		this.ico = ico;
	}

	@Override
	public String getId() {
		return null;
	}


}
