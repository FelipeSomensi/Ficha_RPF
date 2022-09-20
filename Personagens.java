
public class Personagens{


	public static void main(String[] args) {
	
		Ficha Brandom = new Ficha("Brandom StormWind", "Jogador");
		Brandom.setClassePersonagem('R');
		Brandom.Classe(Brandom.getClassePersonagem());
		
		Magias magiasBrandom = new Magias();
		Brandom.magiasPersonagem = magiasBrandom;
		magiasBrandom.setMagia1("Pirokada do mal");
		System.out.println(magiasBrandom.getMagia1());
		
		Brandom.espacamento();
		
//		Ficha Adrian = new Ficha("Adrian Bartiuk");
//		Adrian.setClassePersonagem('M');
//		Adrian.Classe(Adrian.getClassePersonagem());
//	
		 
		
		
	}
	
		

}
