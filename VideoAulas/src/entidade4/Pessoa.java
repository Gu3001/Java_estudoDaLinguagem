package entidade4;

public class Pessoa {
	private int idade;
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
		if(idade < 18) {
			System.out.println("� menor de idade");
		}else {
			System.out.println("� maior de idade");	
		}
	}
	
	
	public void imprimir(){
		System.out.println(idade);
	}
}
