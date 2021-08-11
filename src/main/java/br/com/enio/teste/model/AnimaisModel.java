package br.com.enio.teste.model;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.enio.teste.domain.Animais;
import lombok.Getter;
@Getter
public class AnimaisModel {
	@NotNull
	@NotBlank
	private String especie;
	@NotNull
	private BigDecimal peso;
	@NotNull
	private BigDecimal tamanho;
	@NotNull
	private char sexo;
	@NotNull
	private int qtd;
	private Long id;
	public AnimaisModel(Animais domain) {
		this.id=domain.getId();
		this.especie=domain.getEspecie();
		this.peso=domain.getPeso();
		this.tamanho=domain.getTamanho();
		this.sexo=domain.getSexo();
		this.qtd=domain.getQtd();
	}
}
