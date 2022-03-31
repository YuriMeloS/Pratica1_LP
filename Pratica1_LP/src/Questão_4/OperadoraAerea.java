package Questão_4;
import java.util.Scanner; 	

	public class OperadoraAerea {
	
	public static void main(String[] args) {	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Selecione as opçoes do menu \n 1 - Cadastrar Passageiro\n 2 -"
					+ " Check in\n 3 - Cancelar Voo\n 4 - Sair");
		short num = entrada.nextShort();
		switch (num) {
		case 1:
			System.out.println(" Insira seu nome");
			String name = entrada.next(); 
			System.out.println(" Insira seu CPF");
			String cpf = entrada.next(); 
			System.out.println(" Qual a data e horario de voo");
			String date = entrada.next(); 
			break;
		case 2:
			System.out.println(" Insira seu cpf");
			String cpf2 = entrada.next(); 
			System.out.println(" Numero do voo");
			int Hovoo  = entrada.nextInt(); 
			System.out.println(" Check in confirmado ");
			break;
	    case 3:
			System.out.println(" Insira seu cpf");
			String CancelarCPf = entrada.next(); 
			System.out.println(" Numero do voo");
			int HovooCancelado  = entrada.nextInt();
			System.out.println(" Voo cancelado 1 ");
			break;
			default :
				System.out.println(" Opção invalida");	
			}	
		}
	     
	}
