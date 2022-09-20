public class Magias {

	
	private String magia1 = "Sem magia";
	private String magia2 = "Sem magia";
	private String magia3 = "Sem magia";
	
	public void setMagias (String magia1, String magia2, String magia3) {
		this.magia1 = magia1;
		this.magia2 = magia2;
		this.magia3 = magia3;
		
	}

	public String getMagia1() {
		System.out.println("Magia 1:");
		return magia1;
	}

	public void setMagia1(String magia1) {
		this.magia1 = magia1;
	}

	public String getMagia2() {
		System.out.println("Magia 2:");
		return magia2;
	}

	public void setMagia2(String magia2) {
		this.magia2 = magia2;
	}

	public String getMagia3() {
		System.out.println("Magia 3:");
		return magia3;
	}

	public void setMagia3(String magia3) {
		this.magia3 = magia3;
	}
	
}
