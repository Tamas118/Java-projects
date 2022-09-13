package jt;

import java.util.ArrayList;

public class Kereskedes {

	private String varos;

	private ArrayList<Auto> autok;

	public Kereskedes(String varos) {
		super();
		this.varos = varos;
		this.autok = new ArrayList<>();
	}

	public void hozzaad(String marka, String modell, int ev){
		try {
			this.autok.add(new Auto(marka, modell, ev)); // Hogy ne kelljen többszőr try-catch ezért lett így létrehozva
		} catch (Exception e) {
			System.out.println("Hiba: " + e.getMessage());

		}  

	}

	public String keresEv(int minEv, int maxEv) throws Exception {
		if (minEv > maxEv) {
			throw new Exception("Hiba, a kezdő év nem lehet nagyobb a max évnél az év keresésnél: " + minEv + " , " + maxEv);
		}

		StringBuffer sb = new StringBuffer("Év keresés: " + minEv + " , " + maxEv + "\n");
		int talalatok = 0;
		for (Auto auto : autok) {
			if (minEv <= auto.getEv() && auto.getEv() <= maxEv) {
				sb.append(auto + "\n");
				talalatok++;
			}
		}	


		sb.append("Találatok száma: " + talalatok);
		return sb.toString();

	}

	public String keresMarkaSzoveg(String keresettSzoveg) {
		int talalatok = 0;
		StringBuffer sb = new StringBuffer("Autók, ahol a márkában szerepel: " + keresettSzoveg + " \n");
		for (Auto auto : autok) {
			if (auto.getMarka().contains(keresettSzoveg)) {
				sb.append(auto + "\n");
				talalatok++;
			}
		}
		sb.append("Találatok száma: " + talalatok);
		return sb.toString();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("kereskedés: " + varos + "\n");

		for (Auto auto : autok) {
			sb.append(auto + "\n");
		}
		return sb.toString();
	}

}
