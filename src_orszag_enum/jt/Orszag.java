package jt;

public enum Orszag {

	HU("Magyarország", "Budapest"), 
	USA("Amerikai Egyesült Államok", "Washington"),
	GB("Nagy-Britannia", "London");
	
	private String magyarTeljesNev;
	
	private String fovaros;

	private Orszag(String magyarTeljesNev, String fovaros) {
		this.magyarTeljesNev = magyarTeljesNev;
		this.fovaros = fovaros;
	}
	
	@Override
	public String toString() {		
		return magyarTeljesNev + ", fővárosa: " + fovaros;
	}
}
