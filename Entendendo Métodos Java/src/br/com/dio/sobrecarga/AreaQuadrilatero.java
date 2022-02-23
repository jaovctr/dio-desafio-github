package br.com.dio.sobrecarga;
/**
 * 
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * 
 * Calcula a área de um quadrilátero sem retorno para a classe principal;
 */
public class AreaQuadrilatero {
	
	/**
	 * Área do quadrado
	 * @param lado do quadrado
	 */
	public static void calcularArea(double lado) {
		System.out.println("Área do quadrado: " + lado*lado); 
	}
	
	/**
	 * Área do retângulo
	 * @param lado1 do retângulo
	 * @param lado2 do retângulo
	 */
	public static void calcularArea(double lado1, double lado2) {
		System.out.println("Área do retângulo: " + lado1*lado2);
	}
	
	/**
	 * Área do trapézio
	 * @param baseMaior do trapézio
	 * @param baseMenor do trapézio
	 * @param altura do trapézio
	 */
	public static void calcularArea(double baseMaior, double baseMenor, double altura ) {
		System.out.println("Área do trapézio: " + ((baseMaior+baseMenor)*altura)/2);
	}
}
