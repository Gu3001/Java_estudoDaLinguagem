package principal4;

import entidade4.Pessoa;

public class Inicio {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		int t = 20;
		pessoa.setIdade(t);
		System.out.println(pessoa.getIdade());
		pessoa.imprimir();
	}
}
