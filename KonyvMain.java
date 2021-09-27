package jt;

public class KonyvMain {

	public static void main(String[] args) {
		Konyv vuk = new Konyv("Fekete Istvan", "Vuk", 400, true, 4.5);
		System.out.println(vuk);
		
		Konyv kisvakond = new Konyv("Sergej", "Kisvakond", 1200, true, 3.5);
		System.out.println(kisvakond);

	}

}
