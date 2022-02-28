/**
 * 
 */
package br.com.dio.relacoes;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * @see Setor
 * Classe que implementa a interface Setor, ficando responsável pela parte de vendas
 */
public class SetorVendas implements Setor {

	@Override
	public void sobreSetor() {
		System.out.println("Setor responsável por realizar as vendas!");
		
	}

	@Override
	public void lucro(double receita, double dispesa) {
		System.out.println("Lucro: "+(receita - dispesa));
		
	}

}
