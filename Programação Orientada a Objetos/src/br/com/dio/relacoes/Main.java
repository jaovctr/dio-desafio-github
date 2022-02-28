/**
 * 
 */
package br.com.dio.relacoes;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * @see Funcionario, Gerente, Vendedor, Faxineiro
 * Classe principal que implementa a classe mãe e herdeiras
 */
public class Main {
	public static void main(String[] args) {
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();
		Funcionario funcionario = new Funcionario();
		
		Funcionario[] empregados = {gerente,vendedor,faxineiro,funcionario};
		
		for (Funcionario empregado : empregados) {
			empregado.sobreFuncionario();
			System.out.println();			
		}
		
	}
}
