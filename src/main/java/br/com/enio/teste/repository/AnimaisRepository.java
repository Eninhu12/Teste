package br.com.enio.teste.repository;

import java.util.List;
import java.util.Optional;

import br.com.enio.teste.domain.Animais;

public interface AnimaisRepository {
	Animais cadastrar(Animais domain);
	Animais apagar(Animais domain);
	List<Animais> listar();
	Optional<Animais> consultar (Long id);
}
