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
		System.out.println("subtra��o: " +subtracao);
		System.out.println("multiplica��o: " +multiplicacao);
		System.out.println("divis�o: " +divisao);
	}
	/**
	 * Cada m�todo faz sua respectiva oopera��o matem�tica
	 * @param a primeiro n�mero da equa��o 
	 * @param b segundo n�mero da equa��o
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

