package br.com.dio.retornos;

/**
 * 
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * 
 * Calcula a área de um quadrilátero com o retorno do valor para a classe principal;
 */
public class AreaQuadrilatero {
	
	/**
	 * Área do quadrado
	 * @param lado do quadrado
	 */
	public static double calcularArea(double lado) {
		return lado*lado; 
	}
	
	/**
	 * Área do retângulo
	 * @param lado1 do retângulo
	 * @param lado2 do retângulo
	 */
	public static double calcularArea(double lado1, double lado2) {
		return lado1*lado2;
	}
	
	
	/**
	 * Área do trapézio
	 * @param baseMaior do trapézio
	 * @param baseMenor do trapézio
	 * @param altura do trapézio
	 */
	public static double calcularArea(double baseMaior, double baseMenor, double altura ) {
		return ((baseMaior+baseMenor)*altura)/2;
	}
}
