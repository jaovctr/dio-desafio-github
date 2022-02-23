package br.com.dio.criacao;
import java.util.Scanner;

/**
 * 
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * @see Calculadora Emprestimo Saudacao
 * 
 * Exemplos b�sicos de uso de m�todos;
 */

public class Main {
	public static void main(String[] args) {
		Scanner	input = new Scanner(System.in);
		
		// Problema da calculadora
		System.out.println("Digite 2 n�meros: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		Calculadora.adicao(a, b);
		Calculadora.subtracao(a, b);
		Calculadora.multiplicacao(a, b);
		Calculadora.divisao(a, b);
		
		
		// Problema da sauda��o
		Saudacao.saberHora();
		System.out.println("Digite a hora desejada: ");
		int horas=input.nextInt();
		Saudacao.mensagem(horas);
		
		
		// Problema do empr�stimo
		System.out.println("Digite o valor desejado para o empr�stimo: ");
		double valor = input.nextDouble();
		System.out.println("Digite a quantidade de parcelas do empr�stimo: ");
		int parcelas = input.nextInt();
		Emprestimo.calularTaxa(parcelas, valor);
		
	}
}
