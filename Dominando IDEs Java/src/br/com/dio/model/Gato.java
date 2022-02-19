package br.com.dio.model;

import java.util.Objects;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 */

public class Gato {
	private String nome;
	private String cor;
	private Integer idade;

	/**
	 * 
	 * Construtor gerado com atalhos
	 * @param nome nome do gato
	 * @param cor cor do gato
	 * @param idade idade do gato
	 */
	public Gato(String nome, String cor, Integer idade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}
	
	/**
	 * Construtor sem uso
	 */
	public Gato() {
	}

	/**
	 * Getters e setters gerados com atalhos
	 *
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	
	/**
	 * Hascode e Equals gerados com atalhos
	 */
	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}
	
	
	/**
	 * toString gerado com atalho
	 */
	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}

	/**
	 * Construtor criado manualmente
	 */
	/*
	 * public Gato(String nome, String cor, Integer idade){ this.nome=nome;
	 * this.cor=cor; this.idade=idade;
	 * 
	 * }
	 */

}
