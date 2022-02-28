/**
 * 
 */
package br.com.dio.relacoes;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * @see Funcionario
 * Classe herdeira de funcionário
 */
public class Gerente extends Funcionario {

	@Override
	void sobreFuncionario() {
		System.out.println("Este funcioário é um Gerente");
	}
}
