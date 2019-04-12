package pessoa2;

import java.util.Scanner;

public class Pessoa{
	public String nome;
	public int idade;
	
	public void perguntar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nome: ");
		nome = scan.nextLine();
		System.out.println("idade: ");
		idade = scan.nextInt();
		
	}
	public void imprimir() {
		 System.out.println("nome é "+nome+" idade: "+idade);
	}
}
	