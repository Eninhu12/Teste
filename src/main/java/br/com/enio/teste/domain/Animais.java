package br.com.enio.teste.domain;

import java.math.BigDecimal;

import lombok.Getter;
@Getter
public class Animais {
	private String especie;
	private BigDecimal peso;
	private BigDecimal tamanho;
	private char sexo;
	private int qtd;
	private Long id;
	private static Long gerador = Long.valueOf(0);
	
	
	public Animais(String especie,BigDecimal peso,BigDecimal tamanho,char sexo,int qtd) {
		this.id=++gerador;
		this.especie=especie;
		this.peso=peso;
		this.tamanho=tamanho;
		this.sexo=sexo;
		this.qtd=qtd;
	}

	public void Alterar(String especie, BigDecimal peso, BigDecimal tamanho, char sexo, int qtd) {
		this.especie=especie;
		this.peso=peso;
		this.tamanho=tamanho;
		this.sexo=sexo;
		this.qtd=qtd;
		
	}

}
