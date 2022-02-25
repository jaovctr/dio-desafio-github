/**
 * 
 */
package br.com.dio.repeticao;

import java.util.Scanner;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * Recebe uma nota de 0 a 10, repetindo a entrada caso 
 * o valor informado seja fora do intervalo.
 */
public class Nota {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nota;
		
		System.out.println("Nota: ");
		nota = input.nextInt();
		
		while(nota<0 || nota>10) {
			System.out.println("Nota inválida! Insira outra nota:");
			nota = input.nextInt();
		}
		System.out.println("Nota ok");
	}
}
