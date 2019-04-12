package controle;

import java.util.Scanner;

public class Subtrair1 {
	public int num1;
	public int num2;
	public int total;
	public void subtrair() {
		Scanner scan = new Scanner(System.in);
		System.out.println("insira num1: ");
		num1 = scan.nextInt();
		System.out.println("insira num2: ");
		num2 = scan.nextInt();
		total = num1 - num2;
		System.out.println("A subtração é igual a"+total);
	}
}
