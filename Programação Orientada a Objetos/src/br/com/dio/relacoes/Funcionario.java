/**
 * 
 */
package br.com.dio.relacoes;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * @see Faxineiro, Gerente, Vendedor
 * Classe m�e que possui Gerente, Faxineiro e vendedor como filhas, usada no exemplo de heran�a
 * Tamb�m utilizada para o exemplo de associa��o, tendo o endere�o associado ao funcion�rio
 */
public class Funcionario {
	Endereco endereco;
	void sobreFuncionario() {
		System.out.println("Este � um funcion�rio gen�rico");
	}
}
