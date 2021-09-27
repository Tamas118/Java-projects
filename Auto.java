package jt;

public class Auto {

	private String marka;
	
	private String modell;
	
	private int gyartasiEv;
	
	public Auto(String marka,String modell,int gyartasiEv){
		this.marka = marka;
		this.modell = modell;
		this.gyartasiEv = gyartasiEv;
			 
	}
	
	@Override
	public String toString() {
		
		return marka + " " + modell + ", " + gyartasiEv;
	}
}
