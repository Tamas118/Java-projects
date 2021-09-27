package jt;

public class AlkoholMain {

	public static void main(String[] args) {
		
		Alkohol baileys = new Alkohol("Bailey's", 22.5, 5500, false);
			System.out.println(baileys);
			
			System.out.println("Bailey's foka: "+baileys.getFok());
			
			baileys.setFok(17.0);
			System.out.println("Bailey's foka: "+baileys.getFok());
			
			System.out.println(baileys);
			
			Alkohol gin = new Alkohol("Gin", 37.5, 3500, true);
			System.out.println(gin);
			
			baileys.kiirKategoria();
			gin.kiirKategoria();
			
			baileys.kiirMegfizetheto(4000);
			gin.kiirMegfizetheto(10000);
			
			String baileysArSzoveg = baileys.visszaadarszoveg();
			System.out.println("Bailey's: " + baileysArSzoveg);
			
			System.out.println("Gin: " + gin.visszaadarszoveg());
			
			System.out.println("Hány üveg Bailey's jön ki 15000 Ft-ból:" + baileys.mennyiuveggelvehetunk(15000));
			
			System.out.println("Hány üveg Gin jön ki 20000 Ft-ból:" + gin.mennyiuveggelvehetunk(20000));
	}

}
