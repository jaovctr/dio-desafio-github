package br.com.dio.criacao;

/**
 * 
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * 
 * Hospeda um m�todo que calcula a taxa de um empr�stimo com base no valor e parcelas;
 */

public class Emprestimo {
	/**
	 * Retorna uma taxa espec�fica para cada quantidade de parcelas;
	 * @param parcela quantidades de parcelas do empr�stimo
	 * @return valor da taxa a ser considerada
	 */
	private static double getTaxa(int parcela) {
		double taxa=0;
		if(parcela == 1) {
			taxa= 0.2;
		}else if (parcela == 2) {
			taxa= 0.3;
		}else if (parcela>2 && parcela <5) {
			taxa =  0.6;
		}else if(parcela >5) {
			taxa = 1.99;
		}
		return taxa;
	}
	
	/**
	 * Calcula a taxa recebendo os par�metros enviados pelo usu�rio na classe Main
	 * 
	 * @param parcelas quantidade de parcelas do empr�stimo
	 * @param valor valor a ser emprestado
	 */
	public static void calularTaxa(int parcelas, double valor) {
		double taxa= getTaxa(parcelas);
		double valorFinal = valor +(valor*taxa);
		System.out.println("Com " + parcelas + " parcelas, o empr�stimo de R$: " + valor + " tem valor final "
				+ "igual a R$: " + valorFinal);
	}
}
