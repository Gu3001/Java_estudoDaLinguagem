package entidade3;

public class Moto {
	private int marchaAtual;
	//get set
	   
	public int getMarchaAtual() {
		return marchaAtual;
	}
	public void setMarchaAtual(int marchaAtual) {
		this.marchaAtual = marchaAtual;
	}
	
	//construtor sem par�metro
	public Moto() {
		marchaAtual = 0;
	}
	//construtor com par�metro
	public Moto(int marcha) {
		marchaAtual = marcha;
	}
	

}
