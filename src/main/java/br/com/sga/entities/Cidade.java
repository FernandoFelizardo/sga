package br.com.sga.entities;
import java.util.Date;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Cidade {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeCidade;
	private String nomeEstado;
	private Date dtCadastro;
	private String nomeUsuarioCadastro;
	
}
