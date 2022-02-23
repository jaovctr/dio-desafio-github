package br.com.dio.criacao;
/**
 * 
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * 
 * Hospeda a verificação da hora atual, assim como a saudação indicada para cada momento do dia;
 */

import java.util.Date;
public class Saudacao {
	
	/**
	 * Obtém a hora atual e printa para o usuário
	 */
	public static void saberHora() {
		Date data = new Date();
		@SuppressWarnings("deprecation")
		int horaAgora = data.getHours();
		System.out.println("São "+ horaAgora +" horas");
		
	}
	
	/**
	 * Calcula a saudação correta de acordo como o horário indicado pelo usuário
	 * @param horas hora fornecida pelo usuário
	 */
	public static void mensagem (int horas) {
		if(horas < 12) {
			System.out.println("Bom dia!");
		}else if (horas >12 && horas <19) {
			System.out.println("Boa tarde!");
		}else{
			System.out.println("Boa noite!");
		}
		
	}
	
}
