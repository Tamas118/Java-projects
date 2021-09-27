package jt;

public class Alkohol {

	private String nev;
	private double fok;
	private int ar;
	private boolean magyare;

	// alt+shift+s Generate Constructor using Fields...
	public Alkohol(String nev, double fok, int ar, boolean magyare) {
		super();
		this.nev = nev;
		this.fok = fok;
		this.ar = ar;
		this.magyare = magyare;
	}

	@Override
	public String toString() {
		return "Alkohol [nev=" + nev + ", fok=" + fok + ", ar=" + ar + ", magyare=" + magyare + "]";
	}

	public double getFok() { // Methodus csinál valamit 
		return fok;
	}

	public void setFok(double fok) {
		this.fok = fok;
	}

	public void kiirKategoria(){
		if (fok >= 35) {
			System.out.println(nev + ": " + "tömény");
		}else if (fok >= 15) {
			System.out.println(nev + ": " + "likör");
		}else {
			System.out.println(nev + ": " + "long drink");
		}
	}

	public void kiirMegfizetheto(int maxOsszeg){
		String valasz = "Megvehető";
		if (ar > maxOsszeg) {
			valasz = "Túl drága";
		}

		System.out.println(nev + " alkohol ennyi pénzből: " + maxOsszeg  + " Ft megfizethető-e: " + valasz);
	}

	public String visszaadarszoveg() {
		String valasz;
		if (ar < 5000) {
			valasz = "Olcsó";
		} else {
			valasz = "Drága";
		}
		return valasz;		
	}

	public int mennyiuveggelvehetunk(int penz) {
		return penz/ar;
	}

}
