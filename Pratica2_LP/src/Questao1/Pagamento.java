package Questao1;
import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double valTotal, valPrest2, valPrest3x;
		int opc, numParc;
		double valVista;
		
		System.out.println("Insira o valor total gasto");
		valTotal = ler.nextDouble();
		
		System.out.println("Insira o método de pagamento: \n 1 - À Vista \n 2 - Em 2 vezes \n 3 - Entre três e seis parcelas");
		opc = ler.nextInt();
		
		switch(opc) {
		case 1:
			valVista = valTotal * 0.9;
			System.out.printf("O valor à vista é de R$ %.2f",valVista);
			break;
		case 2:
			valPrest2 = valTotal/2;
			System.out.printf("O valor das prestações é de: R$ %.2f",valPrest2);
			break;
		case 3: 
			System.out.println("Digite em quantas parcelas você deseja pagar entre 3x e 6x");
			numParc = ler.nextInt();
			
			if(valTotal>=500) {
				
					valPrest3x = (valTotal/numParc) * 1.03;
					
				}

			
			}
		}
		
		
	}


