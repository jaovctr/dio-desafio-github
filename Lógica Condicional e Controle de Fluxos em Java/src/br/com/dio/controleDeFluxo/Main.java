package br.com.dio.controleDeFluxo;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * Exemplos simples de controle de fluxo
 */
public class Main {

	public static void main(String[] args) {
		ifFlecha();
		ifSemFlecha();
		ifFerias();
		ifMenor();
		
		switchSemana();
		switchNumero();
		switchFerias();
		
	}

	/**
	 * Exemplo de condicional if-else mal projetado com flecha
	 */
	private static void ifFlecha() {
		int mes = 9;
		if(mes == 1) {
			System.out.println("Janeiro");
		}else{
			if(mes==2) {
				System.out.println("Fevereiro");
			}else {
				if(mes==3) {
					System.out.println("Março");
				}else {
					if(mes==4) {
						System.out.println("Abril");
					}else {
						if(mes==5) {
							System.out.println("Maio");
						}else {
							if(mes==6) {
								System.out.println("Junho");
							}else {
								if(mes==7) {
									System.out.println("Julho");
								}else {
									if(mes==8) {
										System.out.println("Agosto");
									}else {
										if(mes==9) {
											System.out.println("Setembro");
										}else {
											if(mes==10) {
												System.out.println("Outubro");
											}else {
												if(mes==11) {
													System.out.println("Novembro");
												}else {
													if(mes==12) {
														System.out.println("Dezembro");
													}else {
														System.out.println("Mês indefinido");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
	}
	
	/**
	 * Exemplo de if-else corretamente projetado, sem flecha e com else if
	 */
	private static void ifSemFlecha() {
		int mes = 9;
		
		if(mes == 1) {
			System.out.println("Janeiro");
		}else if(mes==2) {
			System.out.println("Fevereiro");
		}else if(mes==3) {
			System.out.println("Março");
		}else if(mes==4) {
			System.out.println("Abril");
		}else if(mes==5) {
			System.out.println("Maio");
		}else if(mes==6) {
			System.out.println("Junho");
		}else if(mes==7) {
			System.out.println("Julho");
		}else if(mes==8) {
			System.out.println("Agosto");
		}else if(mes==9) {
			System.out.println("Setembro");
		}else if(mes==10) {
			System.out.println("Outubro");
		}else if(mes==11) {
			System.out.println("Novembro");
		}else if(mes==12) {
			System.out.println("Dezembro");
		}else {
			System.out.println("Mês indefinido");
		}
	}

	/**
	 * Exemplo de if com múltiplas condições, mas que poderia ser implementado
	 * como switch
	 */
	private static void ifFerias() {
		String mes = "julho";
		if (mes== "julho" || mes == "dezembro" || mes == "janeiro") {
			System.out.println("Ferias");
		}
		
	}

	/**
	 * Aprimora o exemplo de auxílio implementado no módulo operações lógicas
	 */
	private static void ifMenor() {
		double salarioMensal = 11893.50d;
		double mediaSalario = 10500d;
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		
		if((salarioMensal<mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
			System.out.println("Funcionario deve receber auxilio");
		}
		
		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
		if((salarioBaixo) && (muitosDependentes)) {
			System.out.println("Funcionario deve receber auxilio");
		}
		
		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		if(recebeAuxilio) {
			
			System.out.println("Funcionario deve receber auxilio");
		}else {
			System.out.println("Funcionario não deve receber auxilio");
		}
		
	}

	/**
	 * Retorna um número da semana de acordo com o dia
	 */
	private static void switchSemana() {
		String dia = "Terça";
		switch (dia) {
			case "Segunda":
				System.out.println(2);
				break;
			case "Terça":
				System.out.println(3);
				break;
			case "Quarta":
				System.out.println(4);
				break;
			case "Quinta":
				System.out.println(5);
				break;
			case "Sexta":
				System.out.println(6);
				break;
			case "Sábado":
				System.out.println(7);
				break;
			case "Domingo":
				System.out.println(1);
				break;
			default:
				System.out.println("Dia inválido");
				break;
		}
		
	}

	/**
	 * Exemplificar que nem todo caso precisa ter o break em um switch
	 */
	private static void switchNumero() {
		int numero = 4;
		switch (numero) {
			case 1:
			case 2:
			case 3:
				System.out.println("Certo");
				break;
			case 4:
				System.out.println("Errado");
				break;
			case 5:
				System.out.println("Talvez");
				break;
			default:
				System.out.println("Valor Indefinido");
				break;
		}
	}

	/**
	 * Exemplo semelhante ao ifFerias, porém com switch
	 */
	private static void switchFerias() {
		String mes="julho";
		switch (mes) {
			case "dezembro":
			case "janeiro":
			case "julho":
				System.out.println("Férias");
				break;
			default:
				System.out.println("Não definido");
				break;
		}	
	}

	
}
