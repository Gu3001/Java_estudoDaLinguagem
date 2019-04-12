package principal3;

import entidade3.Moto;


public class Inicio {
	public static void main(String[] args) {
		Moto moto = new Moto();
		Moto moto2 = new Moto(5);
		
		System.out.println(moto.getMarchaAtual());
		System.out.println(moto2.getMarchaAtual());
	}

}
