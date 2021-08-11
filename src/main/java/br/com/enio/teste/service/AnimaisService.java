package br.com.enio.teste.service;

import java.util.List;

import br.com.enio.teste.domain.Animais;
import br.com.enio.teste.model.AnimaisModel;

public interface AnimaisService {
	
	Animais cadastrar(AnimaisModel model);
	Animais alterar(Long id, AnimaisModel model);
	Animais apagar(Long id);
	List<Animais> listar();
	Animais consultar(Long id);
}
