package br.com.suzana.cadastro_aluno.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

//Prezados, nossa primeira avaliação será como de se imaginar, um projeto.
//Nós desenvolveremos uma cadastro de alunos, com nome, cpf, rg, endereço, e curso.
//Nosso sistema terá, um cadastro do aluno, remoção de aluno, alteração de aluno, pesquisar aluno, por nome e por curso.
//Deve-se usar o banco de dados h2, spring boot, assim como nas aulas e no projeto que trabalhamos em sala.


@Data
@Entity
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String cpf;
	private String rg;
	private String endereco;
	private String curso;

	
}
