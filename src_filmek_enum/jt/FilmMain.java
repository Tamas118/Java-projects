package jt;

public class FilmMain {

	//	Film pl.: ("SP-AZ-001", "Az", 1985, HORROR) 

	public static void main(String[] args) {

		Teka1 teka1 = new Teka1("Center", 2015);
		System.out.println(teka1);

		 
		Teka2 teka2 = new Teka2("Outeka", 2018);
		System.out.println(teka2);

		teka1.hozzaadFilm("ak", "dkhf", 2002, "dfs", true);
		teka1.hozzaadFilm(filmKod, cim, ev, filmTipus, kolcsonozhetoe);
	}
}
