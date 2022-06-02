package exercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ManipuladorArquivo {

			public static void leitor(String path) throws IOException {
				BufferedReader buffRead = new BufferedReader(new FileReader(path));
				String linha = "";
				while (true) {
					if (linha != null) {
						System.out.println(linha);

					} else
						break;
					linha = buffRead.readLine();
				}
				buffRead.close();
			}

			public static void escritor(String path) throws IOException {
				BufferedWriter escrever = new BufferedWriter(new FileWriter(path));
				ArrayList<String> itens = new ArrayList();
				
				Scanner in = new Scanner(System.in);
				System.out.println("Digite o titulo: ");
				String titulo = in.nextLine();
				System.out.println("Digite o objetivo: ");
				String objetivo = in.nextLine();
				System.out.println("Digite o endereço: ");
				String endereco = in.nextLine();
				System.out.println("Digite a data de inicio: ");
				String data = in.nextLine();
				System.out.println("Digite o status: ");
				String status = in.nextLine();
				
				itens.add(titulo+ ";" + objetivo + ";" + endereco + ";" + data + ";" + status);
				escrever.append(itens.toString());
				escrever.close();
				System.out.println("Criado com sucesso");
			}
			public static void main(String[] args) throws IOException {

		    	Scanner entrada = new Scanner(System.in);
                String recebearquivo="";
		        int opcao = 0;
		        
		        do{
		            
			        System.out.println("Digite o Número de sua opção!");
			        System.out.println("1- Definir nome do arquivo TXT");
			        System.out.println("2- Cadastrar Projeto");
			        System.out.println("3- Abrir Arquivo do Projeto");
			        System.out.println("4- Sair ");

			        opcao = entrada.nextInt();
		            
			        switch(opcao){
		            case 1:  
				        System.out.println("\nEscreva o nome do arquivo");
				        recebearquivo = entrada.next();        
				        break;
		            case 2:   
				        ManipuladorArquivo.escritor(recebearquivo);
				        break;
		            case 3:
		            	ManipuladorArquivo.leitor(recebearquivo);
		            	break;
		            case 4:
		            	break;
		            
		            default:
		                System.out.println("Opção inválida.");
		            }
		        } while(opcao != 4);
		    }

			private static void menu() {
			}

			}

	
	



