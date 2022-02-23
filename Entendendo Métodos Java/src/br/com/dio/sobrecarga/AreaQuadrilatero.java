package br.com.dio.sobrecarga;
/**
 * 
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * 
 * Calcula a �rea de um quadril�tero sem retorno para a classe principal;
 */
public class AreaQuadrilatero {
	
	/**
	 * �rea do quadrado
	 * @param lado do quadrado
	 */
	public static void calcularArea(double lado) {
		System.out.println("�rea do quadrado: " + lado*lado); 
	}
	
	/**
	 * �rea do ret�ngulo
	 * @param lado1 do ret�ngulo
	 * @param lado2 do ret�ngulo
	 */
	public static void calcularArea(double lado1, double lado2) {
		System.out.println("�rea do ret�ngulo: " + lado1*lado2);
	}
	
	/**
	 * �rea do trap�zio
	 * @param baseMaior do trap�zio
	 * @param baseMenor do trap�zio
	 * @param altura do trap�zio
	 */
	public static void calcularArea(double baseMaior, double baseMenor, double altura ) {
		System.out.println("�rea do trap�zio: " + ((baseMaior+baseMenor)*altura)/2);
	}
}
