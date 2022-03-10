package Questão_1;
import java.util.Scanner;

public class Viagem {

	public static void main(String[] args) {
		
		float horaViagem, veloMedia, kmLitro, distancia;
		
		Scanner ler = new Scanner(System.in) ;
		
		System.out.println("Insira sua velocidade média:");
		veloMedia = ler.nextFloat();
		
		System.out.println("Insira a hora gasta:");
		horaViagem = ler.nextFloat();
		
		System.out.println("Insira quantos KM o seu carro faz por litro:");
		kmLitro = ler.nextFloat();
		
		distancia = veloMedia * horaViagem;
		
		System.out.printf("O consumo final de combustível foi de: %.2f", distancia, "Litros");

	}

}
