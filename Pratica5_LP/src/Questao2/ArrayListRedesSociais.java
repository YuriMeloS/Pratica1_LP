package Questao2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArrayListRedesSociais {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		 int i;
		 
		 ArrayList<String> redeSocial = new ArrayList();
		 
		 do
	     {
	     String menu= JOptionPane.showInputDialog("MENU\n1-Cadastrar\n2-Excluir\n3-Pesquisar\n4-Sair");
	     i = Integer.parseInt(menu);
	     
	     switch (i)
	        {
	             case 1:
	                String nome= JOptionPane.showInputDialog("Digite o Nome: ");
	                String telefone= JOptionPane.showInputDialog("Digite o telefone: ");
	                String userInsta= JOptionPane.showInputDialog("Digite o seu @ do Instagram: ");
	                String email= JOptionPane.showInputDialog("Digite o seu email: ");
	                redeSocial.add(nome+";"+telefone+";"+userInsta+";"+email);
	                JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
	                 break;
	                 
	             case 2:
	            	 String nomeExcluir= JOptionPane.showInputDialog("Digite o Nome: ");
	                 for(int y=0; y<redeSocial.size(); y++ ) {
	                	 if(redeSocial.get(y).contains(nomeExcluir)) {
	                		 redeSocial.remove(y);
	                		 JOptionPane.showMessageDialog(null,"Excluído com sucesso");
	                	 }
	                 }
	                  break;
	    
	             case 3:
	            	 
	            	 int p = redeSocial.size();
	     			 for(int j = 0; j<p ; j++) {
	     				String pesquisar = JOptionPane.showInputDialog("Digite o elemento que deseja pesquisar: ");
	     				if(redeSocial.get(j).contains(pesquisar)) {
	     				redeSocial.get(j);
	     				JOptionPane.showMessageDialog(null,redeSocial.get(j));
	     				}
	     			}
	     
	     		break;
	            	 
	             case 4:
	                 break;
	             default:
	                  JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas");
	        }
	     } while (i!=4);
	}
}
		
	    
		 
