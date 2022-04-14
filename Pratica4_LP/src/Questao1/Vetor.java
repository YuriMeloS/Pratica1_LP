package Questao1;
import java.util.Scanner;


public class Vetor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int[] notas = new int[10];
		int soma = 0, media= 0, aux = 0;		
		for(int i=0;i<10;i++){
			System.out.printf("Insira sua nota",i+1);
			notas[i]= ler.nextInt();	
			soma = soma +notas[i];
		}
		for(int i=0; i < 10; i++) {
			for(int j=0; j<9; j++) {
				if(notas[j] > notas[j+1]) {
					aux = notas[j];
					notas[j] = notas[j+1];
					notas[j+1]=aux;
					
				}
			}
		}
		
		System.out.println("A média é de "+soma/10);
		System.out.println("A maior nota é de "+notas[9]);
		System.out.println("A 2ª maior nota é de:  "+notas[8]);
		System.out.println("A 3ª maior nota é de:  "+notas[7]);
		System.out.println("A menor nota é de:  "+notas[1]);
		
		
	}

}
