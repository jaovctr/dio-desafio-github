/**
 * 
 */
package br.com.dio.repeticao;

import java.util.Scanner;

/**
 * @author jaovctr
 * @version
 * @since 
 * Recebe 5 números através de um laço de repetição, indica o maior e mostra a média deles
 */
public class MaiorMedia {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int numero;
		int i = 0;
		int maior = 0;
		int soma=0;
		
		do {
			System.out.println("Digite um número:");
			numero=input.nextInt();
			if(numero>maior)
				maior=numero;
			soma=soma+numero;
			i++;
		}while(i<5);
		System.out.println("Maior: " + maior);
		System.out.println("Média: " + (soma/i));
		
	}
}
