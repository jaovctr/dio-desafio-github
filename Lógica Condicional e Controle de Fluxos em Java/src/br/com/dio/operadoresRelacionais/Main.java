package br.com.dio.operadoresRelacionais;
/**
 * 
 * @author jaovctr
 * @since 1.0
 * @version 1.0
 * Realizando testes simples com os operadores relacionais.
 */
public class Main {
	public static void main(String[] args) {
		int i1 = 10;
		int i2 =20;
		
		float f1 = 4.5f;
		float f2 = 5.5f;
		
		double d1 = 59.60;
		
		char c1 = 'x';
		char c2 = 'y';
		
		String s1 = "Fulano";
		String s2 = "fulano";
		String s3 = "Cicrano";
		
		boolean b1 = true;
		boolean b2 = false;
		
		long l1 = 1597L;
		long l2 = 2997L;
		
		byte y1 = 1;
		byte h1 = 25;
				
		System.out.println("i1 == i2 " + (i1==i2));
		System.out.println("i1 != i2 " + (i1!=i2));
		System.out.println("i1 > i2 " + (i1>i2));
		System.out.println("i1 < i2 " + (i1<i2));

		System.out.println("f1 == f2 " + (f1==f2));
		System.out.println("f1 != f2 " + (f1!=f2));
		System.out.println("f1 > f2 " + (f1>f2));
		System.out.println("f1 < f2 " + (f1<f2));

		System.out.println("c1 == c2 " + (c1==c2));
		System.out.println("c1 != c2 " + (c1!=c2));
		System.out.println("c1 > c2 " + (c1>c2));
		System.out.println("c1 < c2 " + (c1<c2));

		System.out.println("s1 == s2 " + (s1==s2));
		System.out.println("s1 != s2 " + (s1!=s2));
		//System.out.println("s1 > s2 " + (s1>s2));
		//System.out.println("s1 < s2 " + (s1>s2));
		
		System.out.println("b1 == b2 " + (b1==b2));
		System.out.println("b1 != b2 " + (b1!=b2));
		//System.out.println("b1 > b2 " + (b1>b2));
		//System.out.println("b1 < b2 " + (b1<b2));
		
		System.out.println("i2 > f1 " + (i2>f1));
		System.out.println("d1 == h1 " + (d1==h1));
		System.out.println("d1 == h1 " + (d1==h1));
		
		System.out.println("l1 == l2 " + (l1==l2));
		System.out.println("l2 >= l1 " + (l2>=l1));
		System.out.println("y1 != h1 " + (i1!=h1));
		
		
		
		
	}
}
