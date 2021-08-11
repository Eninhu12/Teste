package br.com.enio.teste.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.enio.teste.domain.Animais;
import br.com.enio.teste.repository.AnimaisRepository;

public class AnimaisRepositoryImpl implements AnimaisRepository {

	private final static List<Animais> ANIMAIS = new ArrayList<Animais>();
	
	@Override
	public Animais cadastrar(final Animais domain) {
		ANIMAIS.add(domain);
		return domain;
	}

	@Override
	public Animais apagar(final Animais domain) {
		ANIMAIS.remove(domain);
		return domain;
	}

	@Override
	public List<Animais> listar() {
		return ANIMAIS;
	}

	@Override
	public Optional<Animais> consultar(final Long id) {
		return ANIMAIS.stream().filter(p->id.equals(p.getId())).findFirst();
	}

}
