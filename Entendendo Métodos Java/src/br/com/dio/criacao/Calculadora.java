package br.com.dio.criacao;

/**
 * 
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * 
 * Calculadora com operações aritméticas básicas
 */
public class Calculadora {
	
	// Soma dos elementos
	public static void adicao(double a, double b) {
		double resultado = a+b;
		System.out.println(a + " + " + b + " = " + resultado);;
	}
	
	// Subtração dos elementos
	public static void subtracao(double a, double b) {
		double resultado = a-b;
		System.out.println(a + " - " + b + " = " + resultado);;
	}
	
	// Multiplicação dos elementos
	public static void multiplicacao(double a, double b) {
		double resultado = a*b;
		System.out.println(a + " * " + b + " = " + resultado);;
	}
	
	// Divisão dos elementos
	public static void divisao(double a, double b) {
		if (b==0) {
			System.out.println("Impossível dividir " + a + " por 0!");
		}else {
			double resultado = a/b;
			System.out.println(a + " / " + b + " = " + resultado);;
		}
	}
	

	
	
}
