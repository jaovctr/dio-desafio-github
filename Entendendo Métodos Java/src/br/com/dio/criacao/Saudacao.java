package br.com.dio.criacao;
/**
 * 
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * 
 * Hospeda a verifica��o da hora atual, assim como a sauda��o indicada para cada momento do dia;
 */

import java.util.Date;
public class Saudacao {
	
	/**
	 * Obt�m a hora atual e printa para o usu�rio
	 */
	public static void saberHora() {
		Date data = new Date();
		@SuppressWarnings("deprecation")
		int horaAgora = data.getHours();
		System.out.println("S�o "+ horaAgora +" horas");
		
	}
	
	/**
	 * Calcula a sauda��o correta de acordo como o hor�rio indicado pelo usu�rio
	 * @param horas hora fornecida pelo usu�rio
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
