
package br.com.dio.poo;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * Objeto carro, com atributos cor, modelo e capacidade do tanque.
 */
public class Carro {
	String cor;
	String modelo;
	int capacidadeTanque;
	
	Carro(){
		
	}
	
	Carro(String cor, String modelo, int capacidadeTanque){
		this.cor=cor;
		this.modelo=modelo;
		this.capacidadeTanque=capacidadeTanque;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	/**
	 * Calcula o valor para encher o tanque do veículo
	 * @param valorCombustivel preço em litros do combustível
	 * @return valor total
	 */
	double valorTotalTanque (double valorCombustivel) {
		return capacidadeTanque * valorCombustivel;
	}

}
