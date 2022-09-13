package jt;

//	Teka nev, alapitás éve

public class Teka2 {

	private String tekaNev;
	
	private int alapitasiEv;
	
	

	public Teka2(String tekaNev, int alapitasiEv) {
		super();
		this.tekaNev = tekaNev;
		this.alapitasiEv = alapitasiEv;
	}
	
	@Override
		public String toString() {
			return "Téka neve: " + tekaNev + " Alapítás éve: " + alapitasiEv;
		}
	
	
}
