package Questão_3;
import java.util.Scanner;

public class Frase {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		char c, i;
		String frase;
		int vogal = 0;
		
		
		System.out.println("Insira uma frase");
		frase = ler.nextLine();
		
		frase = frase.toLowerCase();
		
		for(i=0;i<frase.length(); i++) {
			c = frase.charAt(i);
			if(c == 97 | c ==101 | c == 105 | c == 111 | c == 117) {
				vogal++;
			}
		}
		
		System.out.println("A frase "+frase+" tem "+vogal+" vogais");
	}

}
