package Questao3;
import java.util.Scanner;

public class OrdenacaoVetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		int[] vetor = new int[10];
		int aux=0;
		for(int i=0; i<10; i++) {
			System.out.printf("\n Digite a posição %d:",i+1);
			vetor[i] = ler.nextInt();
		}
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<9; j++) {
				if(vetor[j] > vetor[j+1]) {
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		System.out.println("Vetor Ordenado");
		for(int i=0; i<10; i++) {
			System.out.printf("%d\t", vetor[i]);
		}
		
	}

}
