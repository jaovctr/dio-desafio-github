/**
 * 
 */
package br.com.dio.repeticao;

import java.util.Scanner;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * Recebe uma quantidade n de números fornecida pelo usuário e mostra quantos são
 * pares e quantos são ímpares
 */
public class ParImpar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quantNumeros;
		int numero;
		int quantPares=0, quantImpares=0;
		
		System.out.println("Quantidade de números:");
		quantNumeros=input.nextInt();
		int i = 0;
		do {
			System.out.println("Digite o número: ");
			numero=input.nextInt();
			if(numero%2==0)
				quantPares++;
			else
				quantImpares++;
			i++;
		}while(i<quantNumeros);
		
		System.out.println("Quantidade de pares: " + quantPares);
		System.out.println("Quantidade de impares: " + quantImpares);
	}
}
