package br.com.enio.teste.exepctions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class AnimaisNaoExisteException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AnimaisNaoExisteException(final Long id) {
		super("Animais id " + id + " não existe.");
	}
}