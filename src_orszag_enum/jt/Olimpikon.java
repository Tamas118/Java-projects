package jt;

public class Olimpikon {

	private String nev;
	
	private Orszag orszag;

	public Olimpikon(String nev, Orszag orszag) {
		super();
		this.nev = nev;
		this.orszag = orszag;
	}
	
	@Override
	public String toString() {		
		return nev + " (" + orszag + ")";
	}
}
