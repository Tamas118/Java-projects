package jt;

import java.nio.file.Files;
import java.nio.file.Paths;

public class AutoKeresMain {

	public static void main(String[] args) {

		Kereskedes ajka = new Kereskedes("Ajka");
		ajka.hozzaad("Audi", "A3", 2015);
		ajka.hozzaad("Audi", "A4", 2017);
		ajka.hozzaad("BMW", "M5", 2015);
		ajka.hozzaad("Fiat", "Punto", 2003);
		ajka.hozzaad("Q", "???", 2008);
		ajka.hozzaad("???", "Y", 2008);
		ajka.hozzaad("X?", "Y?", 1750);
		ajka.hozzaad("Seat", "Leon", 2008);

		StringBuffer sb = new StringBuffer();
		sb.append(ajka + "\n");

		sb.append("-------------------------\n\n");
		
		try {
			sb.append(ajka.keresEv(2015, 2000) + "\n");
		} catch (Exception e) {
			sb.append(e.getMessage() + "\n");
		}

		sb.append("-------------------------\n\n");
		
		try {
			sb.append(ajka.keresEv(2015, 2017) + "\n");
		} catch (Exception e) {
			sb.append(e.getMessage() + "\n");
		}

		sb.append("-------------------------\n\n");
		
		sb.append(ajka.keresMarkaSzoveg("at"));
		

		try {
			Files.write(Paths.get("futas.txt"), sb.toString().getBytes());
		} catch (Exception e) {
			System.out.println(e);
		}



		System.out.println(sb.toString());
	}

}
/*Tároljunk autókat(márka, modell, év) autókereskedésben( város) 
váltsunk ki hibát, ha a márka vagy modell kisebb mint 2 vagy az év nem 
esik 1880(év) és 2025 közé. 
lehessen keresni 2 év között, ami hibára fut, ha a kezdő év nagyobb, mint
a végső. 
HF.20210811
-Lehessen keresni arra, hogy a márka tartalmaz-e egy megadott szövegrészt.
-Minden amit kiíratnánk azt fájlba is írjuk ki, és a keresések után a találatok
számát is jelezzük ki.
 */