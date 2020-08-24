package br.com.petz.parceirosapi.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import br.com.petz.parceirosapi.entity.Categoria;

public class CategoriaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 5, max = 80, message = "O tamanho deve ser entre 5 e 80 caracteres")
	private String categoria;

	public CategoriaDTO() {
	}

	public CategoriaDTO(Categoria obj) {

		id = obj.getId();
		categoria = obj.getNome();
	}

	public Long getId() {
		return id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
