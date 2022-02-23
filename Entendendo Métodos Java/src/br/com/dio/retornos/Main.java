package br.com.dio.retornos;

/**
 * 
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * @see AreaQuadrilatero
 * Cálculo de área de quadriláteros utilizando método com sobrecarga e retorno;
 * 
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado:");
		double lado = input.nextDouble();
		System.out.println("Área do quadrado: " + AreaQuadrilatero.calcularArea(lado));
		
		System.out.println("Digite os lados do retângulo:");
		double lado1 = input.nextDouble();
		double lado2 = input.nextDouble();
		System.out.println("Área do retângulo: " + AreaQuadrilatero.calcularArea(lado1, lado2));
		
		System.out.println("Digite a base maior, base menor e altura do trapézio:");
		double baseMaior = input.nextDouble();
		double baseMenor = input.nextDouble();
		double altura = input.nextDouble();
		System.out.println("Área do trapézio: " + AreaQuadrilatero.calcularArea(baseMaior, baseMenor, altura));
	}
	
	
}
