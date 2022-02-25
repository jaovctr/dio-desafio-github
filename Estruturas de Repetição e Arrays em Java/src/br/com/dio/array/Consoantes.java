/**
 * 
 */
package br.com.dio.array;

import java.util.Scanner;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * Recebe 6 letras e informa quantas e quais delas são consoantes através de laços de repetição
 */
public class Consoantes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] consoantes = new String[6];
		int quantidadeConsoantes=0;
		int i=0;
		
		do {
			System.out.println("Digite uma letra:");
			String letra = input.next();
			
			if(!(letra.equalsIgnoreCase("a") |
					letra.equalsIgnoreCase("e") |
					letra.equalsIgnoreCase("i") |
					letra.equalsIgnoreCase("o") |
					letra.equalsIgnoreCase("u"))) {
				consoantes[i]=letra;
				quantidadeConsoantes++;	
			}
			i++;	
		}while(i<consoantes.length);
		
		for (String consoante : consoantes) {
			if(consoante!=null)
				System.out.println(consoante);
		}
		System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
	}
}
