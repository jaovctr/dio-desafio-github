/**
 * 
 */
package br.com.dio.relacoes;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * @see Funcionario
 * Classe herdeira de funcion�rio
 */
public class Faxineiro extends Funcionario {
	
	@Override
	void sobreFuncionario() {
		System.out.println("Este funcio�rio � um faxineiro");
	}
}
