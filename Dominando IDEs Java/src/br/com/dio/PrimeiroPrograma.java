package br.com.dio;

import br.com.dio.model.Gato;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * @see Gato
 */


public class PrimeiroPrograma {
	
	public static void main(String[] args) {
		
		//Manipulando objetos
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		
		
		// Primeiro exemplo
		/*int a =2;
		int b=3;
				
		System.out.println("Hello World! " + (a+b));
		*/
		
	}

}


//Criando uma classe no mesmo arquivo

class Livros{
	private String nome;
	private String npag;
}
