package jt;

	// Enum > FilmTípus: név, min életkor (pl.: Horror, 16 | Mese, 0) 

public enum FilmTipus {

	AMERIKAI("Misztikus", 15), 
	NÉMET("Akció", 16),
	MAGYAR("Mese", 0),
	ANGOL("Krimi", 18);
	
	private String filmTipusok;
	
	private int korhatar;

	private FilmTipus(String filmTipusok, int korhatar) {
		this.filmTipusok = filmTipusok;
		this.korhatar = korhatar;
	}
	
	@Override
	public String toString() {
		return filmTipusok + "korhatár: " + korhatar;
	}
	
}
