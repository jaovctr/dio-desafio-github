/**
 * 
 */
package br.com.dio.array;

import java.util.Random;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * Adiciona números aleatórios em um array, exibindo-os com os seus sucessores em seguida
 */
public class NumerosAleatorios {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] aleatorios = new int [20];
		
		for(int i = 0; i< aleatorios.length;i++) {
			int numero= random.nextInt(100);
			aleatorios[i]=numero;
		}
		
		System.out.print("Numeros aleatorios: ");
		for (int num : aleatorios) {
			System.out.print(num + " ");
		}
		
		System.out.print("\nSucessores: ");
		for (int num : aleatorios) {
			System.out.print(num+1 + " ");
		}
	}
}
