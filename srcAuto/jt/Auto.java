package jt;

public class Auto {

	private String marka;
	
	private String modell;
	
	private int ev;

	public Auto(String marka, String modell, int ev) throws Exception {
		
		if (marka == null || modell == null || marka.length() < 2 || modell.length() < 2 ) {
			throw new Exception(marka + " " + modell + " " + ev + ": " + "A márka és a modell is legalább 2 hosszú kell legyen");
		}
		
		if (ev < 1880 || 2025 < ev) {
			throw new Exception(marka + " " + modell + " " + ev + ": " + "Az év 1880 és 2025 között kell legyen");

		}
	
		
		this.marka = marka;
		this.modell = modell;
		this.ev = ev;
	}
	
	public int getEv() {
		return ev;
	}
	
		
	public String getMarka() {
		return marka;
	}

	@Override
	public String toString() {
		
		return String.format("%-15s %-15s %d", marka, modell, ev);
	}
}
