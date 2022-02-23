package br.com.dio.retornos;

/**
 * 
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * 
 * Calcula a �rea de um quadril�tero com o retorno do valor para a classe principal;
 */
public class AreaQuadrilatero {
	
	/**
	 * �rea do quadrado
	 * @param lado do quadrado
	 */
	public static double calcularArea(double lado) {
		return lado*lado; 
	}
	
	/**
	 * �rea do ret�ngulo
	 * @param lado1 do ret�ngulo
	 * @param lado2 do ret�ngulo
	 */
	public static double calcularArea(double lado1, double lado2) {
		return lado1*lado2;
	}
	
	
	/**
	 * �rea do trap�zio
	 * @param baseMaior do trap�zio
	 * @param baseMenor do trap�zio
	 * @param altura do trap�zio
	 */
	public static double calcularArea(double baseMaior, double baseMenor, double altura ) {
		return ((baseMaior+baseMenor)*altura)/2;
	}
}
