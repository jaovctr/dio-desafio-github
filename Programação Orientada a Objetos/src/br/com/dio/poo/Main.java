/**
 * 
 */
package br.com.dio.poo;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * Instancia o objeto carro e realiza operações simples com ele
 * 
 */
public class Main {
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.setCor("Preto");
		carro1.setModelo("Chevrolet Celta");
		carro1.setCapacidadeTanque(54);
		
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Capacidade (L): " + carro1.getCapacidadeTanque());
		System.out.println("Valor abastecimento: R$: " + carro1.valorTotalTanque(7.25));
		
		Carro carro2 = new Carro("Branco", "Wokswagen Gol", 55);
		
		System.out.println("Modelo: " + carro2.getModelo());
		System.out.println("Cor: " + carro2.getCor());
		System.out.println("Capacidade (L): " + carro2.getCapacidadeTanque());
		System.out.println("Valor abastecimento: R$: " + carro2.valorTotalTanque(7.25));
	}
}
