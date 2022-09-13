package jt;

	//	Vegyünk fel Filmeket (Egyedi filmkód, Cím, Év, FilmTípus, Kölcsönözhető-e) egy-egy Tékába. 

public class Film {

	private String filmKod;
	
	private String cim;
	
	private int ev;
	
	private FilmTipus filmTipus;
	
	private boolean kolcsonozhetoe;

	public Film(String filmKod, String cim, int ev, FilmTipus filmTipus, boolean kolcsonozhetoe) {
		super();
		this.filmKod = filmKod;
		this.cim = cim;
		this.ev = ev;
		this.filmTipus = filmTipus;
		this.kolcsonozhetoe = kolcsonozhetoe;
	}
	
	
	
	@Override
		public String toString() {			
			return "Egyedi filmkod: " + filmKod + " Film címe: " + cim + " Év: " + ev + " Film típus: " + filmTipus + " Kölcsönözhető: " + kolcsonozhetoe;
		}
}
