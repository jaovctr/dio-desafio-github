package br.com.dio;

import java.util.Scanner;
/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * Classe que desempenha o papel de uma calculadora
 */
public class Calculadora {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		System.out.println("Digite o primeiro valor:");
		a=scan.nextInt();
		System.out.println("Digite o segundo valor:");
		b=scan.nextInt();
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a, b);
		int divisao = divisao(a, b);
		
		System.out.println("soma: "+soma);
		System.out.println("subtração: " +subtracao);
		System.out.println("multiplicação: " +multiplicacao);
		System.out.println("divisão: " +divisao);
	}
	/**
	 * Cada método faz sua respectiva ooperação matemática
	 * @param a primeiro número da equação 
	 * @param b segundo número da equação
	 * 
	 */
	public static int soma(int a,int b) {
		return a+b;
	}
	public static int subtracao(int a,int b) {
		return a-b;
	}
	public static int divisao(int a,int b) {
		return a/b;
	}
	public static int multiplicacao(int a,int b) {
		return a*b;
	}
}

