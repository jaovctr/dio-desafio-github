package br.com.dio.array;



/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * Imprime os elementos de um vetor em ordem inversa
 */
public class OrdemInvesa {
	public static void main(String[] args) {
		int[] vetor = {-5,-6,15,50,8,4};
		int i=vetor.length-1;
		while(i>=0) {
			System.out.println("Vetor: "+vetor[i]);
			i--;
		}
		for(i=vetor.length-1;i>=0;i--) {
			System.out.println("Vetor: "+vetor[i]);
			
		}
	}
}
