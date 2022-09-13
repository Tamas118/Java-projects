package jt;

import java.util.ArrayList;

//	
public class Teka1 {

	private String neve;

	private int alapitasiEv;

	/*private ArrayList<Film> filmLista;*/

	private ArrayList<Film> filmek;

	public Teka1(String neve, int alapitasiEv) {
		super();
		this.neve = neve;
		this.alapitasiEv = alapitasiEv;
		/*this.filmLista = new ArrayList<>();*/
		this.filmek = new ArrayList<>();


	}

	public String getNeve() {
		return neve;
	}

	public int getAlapitasiEv() {
		return alapitasiEv;
	}

	/*public ArrayList<Film> getFilmLista() {
		return filmLista;
	}
	*/
	

	public ArrayList<Film> getFilmek() {
		return filmek;
	}

	public Teka1(ArrayList<Film> filmek) {
		super();
		this.filmek = filmek;
	}

	public void hozzaadFilm(String filmKod, String cim, int ev, FilmTipus filmTipus, boolean kolcsonozhetoe) {
		this.filmek.add(new Film(filmKod, cim, ev, filmTipus, kolcsonozhetoe));
		
		
	}

	@Override
	public String toString() {			
		return "Téka neve: " + neve + " Alapítási év: " + alapitasiEv;
	}
}