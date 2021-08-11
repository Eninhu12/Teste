
package br.com.enio.teste.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.enio.teste.model.AnimaisModel;
import br.com.enio.teste.service.AnimaisService;


@RestController
@RequestMapping("/perfume")
public class AnimaisController {

	@Autowired
	private AnimaisService perfumeService;
	
	@PostMapping("/cadastrar")
	public AnimaisModel cadastrar(@Valid @RequestBody AnimaisModel model, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
            throw new RuntimeException("Parametros inválidos");
        }
		return new AnimaisModel(perfumeService.cadastrar(model));
	}
	
	@PutMapping("/alterar/{id}")
	public AnimaisModel alterar(@PathVariable Long id, @Valid @RequestBody AnimaisModel model, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
            throw new RuntimeException("Parametros inválidos");
        }
		return new AnimaisModel(perfumeService.alterar(id, model));
	}
	
	@DeleteMapping("/apagar/{id}")
	public AnimaisModel apagar(@PathVariable Long id) {
		return new AnimaisModel(perfumeService.apagar(id));
	}
	
	@GetMapping("/listar")
	public List<AnimaisModel> listar() {
		return perfumeService.listar().stream().map(AnimaisModel::new).collect(Collectors.toList());
	}
}
