/**
 * 
 */
package br.com.dio.repeticao;

import java.util.Scanner;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 *  Imprime o nome e idade até que o usuário digite 0 para o campo nome.
 */
public class NomeIdade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome;
		int idade;
		while(true) {
			
			System.out.println("Nome: ");
			nome= input.next();
			if(nome.equals("0")) 
				break;
			
			System.out.println("Idade: ");
			idade= input.nextInt();
			
		}
		
		System.out.println("Continuando..");
		
	}

}
