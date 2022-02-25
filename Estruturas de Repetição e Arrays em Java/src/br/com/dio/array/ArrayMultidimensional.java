/**
 * 
 */
package br.com.dio.array;

import java.util.Random;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * Preenche uma matriz com n�meros inteiros aleat�rios entre 1 e 9, em seguida imprime a tabela utilizando la�o for
 */
public class ArrayMultidimensional {
	public static void main(String[] args) {
		Random random = new Random();
		
		int [][] M = new int[4][4];
		
		for(int i=0; i<M.length;i++) {
			for(int j=0;j<M[i].length;j++) {
				M[i][j]=random.nextInt(9);
			}
		}
		
		for (int[] linha : M) {
			for (int coluna : linha) {
				System.out.print(coluna + " ");
			}
			System.out.println();
		}
	}
	
}
