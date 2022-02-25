/**
 * 
 */
package br.com.dio.repeticao;

import java.util.Scanner;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * Recebe um número e calcula a sua fatorial, a imprimindo no fim do programa
 */
public class Fatorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int fatorial;
		System.out.println("Digite um numero:");
		fatorial = input.nextInt();
		int total=1;
		for(int i=fatorial; i>0;i--) {
			total=total*i;
		}
		System.out.println("Total: " + total);
	}
}
