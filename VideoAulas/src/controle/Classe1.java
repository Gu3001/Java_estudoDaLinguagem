package controle;

import java.util.Scanner;

public class Classe1 {
	public int num1;
	public int num2;
	public int total;
	
	public void somar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo número:");
		num2 = scan.nextInt();
		
		total = num1 + num2;
		System.out.println("A soma é"+ total);
	}
}
