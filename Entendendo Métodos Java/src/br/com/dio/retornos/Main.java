package br.com.dio.retornos;

/**
 * 
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * @see AreaQuadrilatero
 * C�lculo de �rea de quadril�teros utilizando m�todo com sobrecarga e retorno;
 * 
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado:");
		double lado = input.nextDouble();
		System.out.println("�rea do quadrado: " + AreaQuadrilatero.calcularArea(lado));
		
		System.out.println("Digite os lados do ret�ngulo:");
		double lado1 = input.nextDouble();
		double lado2 = input.nextDouble();
		System.out.println("�rea do ret�ngulo: " + AreaQuadrilatero.calcularArea(lado1, lado2));
		
		System.out.println("Digite a base maior, base menor e altura do trap�zio:");
		double baseMaior = input.nextDouble();
		double baseMenor = input.nextDouble();
		double altura = input.nextDouble();
		System.out.println("�rea do trap�zio: " + AreaQuadrilatero.calcularArea(baseMaior, baseMenor, altura));
	}
	
	
}
