package Questao4;
import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
  Scanner ler = new Scanner(System.in);
  int opc, numVoo;  
  String nome, cpf, data, horario;
  Random gerador = new Random();
  numVoo = gerador.nextInt(100)*10;

  System.out.println("Escolha uma op��o: \n 1 - Cadastrar Passageiro \n 2 -Check in \n 3 - Cancelar Voo \n 4 - Sair");
    opc = ler.nextInt();

    switch(opc)
      {
        case 1:
          System.out.println("Insira seu nome");
          nome = ler.next();
          System.out.println("Insira seu CPF");
          cpf = ler.next();
          System.out.println("Insira a data do voo");
          data = ler.next();
          System.out.println("Insira o hor�rio do voo");
          horario = ler.next();
          System.out.println("O n�mero do seu voo �:       "+numVoo);
        break;

          
        case 2:
          System.out.println("Insira o n�mero do seu CPF");
          cpf = ler.nextLine();
          System.out.println("Insira o n�mero do seu voo");
          numVoo = ler.nextInt();
          System.out.println("Check In realizado com sucesso!");

        break;

        case 3:
        System.out.println("Insira o n�mero do seu CPF");
        cpf = ler.nextLine();
        System.out.println("Insira o n�mero do seu voo");
        numVoo = ler.nextInt();
        System.out.println("Voo cancelado com sucesso!");
        break;

        case 4:
        System.out.println("Fim!");
        break;

        default:
          System.out.println("Op��o inv�lida");
      }
    
    
    
  }
}