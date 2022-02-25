/**
 * 
 */
package br.com.dio.repeticao;

import java.util.Scanner;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * Recebe um número e imprime toda sua tabuada utilizando um laço for
 */
public class Tabuada {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número para a tabuada:");
		numero = input.nextInt();
		System.out.println("Tabuada de " + numero);
		for (int i=1;i<=10;i++) {
			System.out.println(numero + " x " + i + " = " + (numero*i));
			
		}
	}
}
