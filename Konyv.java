package jt;

public class Konyv {
	private String szerzo;
	private String cim;
	private int peldanyszam;
	private boolean megfilmesitetteke;
	private double euro;
	
	public Konyv (String szerzo,String cim,int peldanyszam,boolean megfilmesitetteke,double euro){
		this.szerzo = szerzo;
		this.cim = cim;
		this.peldanyszam = peldanyszam;
		this.megfilmesitetteke = megfilmesitetteke;
		this.euro = euro;
		
	}
	
	@Override
	public String toString() {
		return szerzo + " - " + cim + " " + peldanyszam + "db " + "megfilmesitettek: " + megfilmesitetteke + " ara: " + euro + "Euro";
		/*return szerzo;*/
	}
}
