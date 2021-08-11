package br.com.enio.teste.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.enio.teste.domain.Animais;
import br.com.enio.teste.exepctions.AnimaisNaoExisteException;
import br.com.enio.teste.model.AnimaisModel;
import br.com.enio.teste.repository.AnimaisRepository;
import br.com.enio.teste.service.AnimaisService;


@Service
public class AnimaisServiceImpl implements AnimaisService {

	@Autowired
	private  AnimaisRepository animaisRepository;
	
	@Override
	public Animais cadastrar(final AnimaisModel model) {
		return  animaisRepository.cadastrar(new  Animais(model.getEspecie(),model.getPeso(),model.getTamanho(),model.getSexo(),model.getQtd()));
	}

	@Override
	public  Animais alterar(final Long id, final  AnimaisModel model) {
		 Animais p = this.consultar(id);
		p.Alterar(model.getEspecie(),model.getPeso(),model.getTamanho(),model.getSexo(),model.getQtd());
		return p;
	}

	@Override
	public  Animais apagar(final Long id) {
		return this. animaisRepository.apagar(this.consultar(id));
	}

	@Override
	public List<Animais> listar() {
		return this. animaisRepository.listar();
	}

	@Override
	public Animais consultar(final Long id) {
		return this.animaisRepository.consultar(id)
				.orElseThrow(() -> new AnimaisNaoExisteException(id));
				}
}

