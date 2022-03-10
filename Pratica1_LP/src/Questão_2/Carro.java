package Questão_2;
import java.util.Scanner;


public class Carro {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String placa;
		short ano;
		
		System.out.println("Insira a placa do carro");
		placa = ler.nextLine();
		
		System.out.println("Insira o ano de fabricação");
		ano = ler.nextShort();
		
		if(ano<=2010) {
			System.out.println("Carro velho");
		}
		else if(ano<=2021){
			System.out.println("Carro Seminovo");
		}
		else if(ano<=2022) {
			System.out.println("Carro novo");
		}
		else {
			System.out.println("Insira um ano válido");
		}
		
		System.out.println("");
		
		String novaPlaca = placa
						.replace("a","*")
						.replace("e","*")
						.replace("i","*")
						.replace("o", "*")
						.replace("u","*")
						.replace("A","*")
						.replace("E","*")
						.replace("I","*")
						.replace("O", "*")
						.replace("U","*");
		
		System.out.println(novaPlaca);
		
		
		
	}

}
