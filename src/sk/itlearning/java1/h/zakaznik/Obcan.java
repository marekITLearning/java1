package sk.itlearning.java1.h.zakaznik;

import java.math.BigDecimal;

public class Obcan {

	String rc;
	String meno;
	private BigDecimal kredit;

	public Obcan(String rc, String meno) {
		this.rc = rc;
		this.meno = meno;
	}

	public BigDecimal getKredit() {
		return kredit;
	}

	public void setKredit(BigDecimal kredit) {
		this.kredit = kredit;
	}

}
