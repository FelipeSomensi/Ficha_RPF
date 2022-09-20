public class Ficha {

	protected String nomePersonagem;
	private int vidasDoPersonagem;
	private char classePersonagem;
	private static int totalFichas;
	Magias magiasPersonagem;
	
	
	
	// não pode ser void pois retorna totalFichas
	//Cria os dados principais da classe
	public Ficha (String nomePersonagem) {
		Ficha.totalFichas++;
		this.nomePersonagem = nomePersonagem;
		//this.classePersonagem = classePersonagem; // foi para o IF das classes
		System.out.println("%%%%%%%%%%%%");
		System.out.println("O nome do personagem eh: "+ this.nomePersonagem );
		System.out.println(totalFichas+"° personagem criado");
		
	}
	
	//informa a classe do personagem - necessita de setClassePersonagem
	public char getClassePersonagem() {
		//System.out.println("Classe do personagem: "+ this.classePersonagem);
		return classePersonagem;
	}
	//atribui a classe do personagem
	public void setClassePersonagem(char classePersonagem) {
		this.classePersonagem = classePersonagem;
	}


	//Define os atributos classe do personagem
	public void Classe (char classePersonagem) {
		if (this.classePersonagem == 'M') {
			this.vidasDoPersonagem += 10;
			System.out.println(this.nomePersonagem + " tem " + this.vidasDoPersonagem + " pontos de vida");
			System.out.println("Pertencente a classe M = Mago");
			System.out.println("----");
			
		} else {
			if (this.classePersonagem == 'R') {
				this.vidasDoPersonagem += 20;
				System.out.println(this.nomePersonagem + " tem " + this.vidasDoPersonagem + " pontos de vida");
				System.out.println("Pertencente a classe  = Rogue");
				System.out.println("----");
			} else {
				System.out.println("Seu personagem possui uma classe invalida.");
			}
			
		}
	
	}
	//define espaçamento
	public void espacamento(){
		System.out.println("\n\n\n\n");
	}
	
	
}
