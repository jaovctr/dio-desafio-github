/**
 * 
 */
package br.com.dio.relacoes;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * @see Faxineiro, Gerente, Vendedor
 * Classe mãe que possui Gerente, Faxineiro e vendedor como filhas, usada no exemplo de herança
 * Também utilizada para o exemplo de associação, tendo o endereço associado ao funcionário
 */
public class Funcionario {
	Endereco endereco;
	void sobreFuncionario() {
		System.out.println("Este é um funcionário genérico");
	}
}
