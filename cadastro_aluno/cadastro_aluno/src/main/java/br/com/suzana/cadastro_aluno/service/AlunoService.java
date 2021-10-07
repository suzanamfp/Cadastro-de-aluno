package br.com.suzana.cadastro_aluno.service;

import java.util.List;

import javax.persistence.Table;

import org.springframework.stereotype.Service;

import br.com.suzana.cadastro_aluno.model.Aluno;
import br.com.suzana.cadastro_aluno.repository.AlunoRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Table(name = "Aluno")
public class AlunoService {
	
	private final AlunoRepository repository;
	
	public List<Aluno> alunos() { //Lista os alunos
		return this.repository.findAll();
	}
	
	public void saveAluno(Aluno aluno) { //Adiciona/salva o aluno
		this.repository.save(aluno);
	}
	
	public Aluno save(Aluno aluno) { //Adiciona/salva o aluno
		return this.repository.save(aluno);
	}

	public void remove(Long id) {
		this.repository.deleteById(id);
		
	}

	public Aluno getByName(String name) {
		return this.repository.findByName(name);
		
	}

	public Aluno getByCurso(String curso) {
		return repository.findByCurso(curso);
	}

	public void findById(Long id) {
		this.repository.findById(id);		
	}

  
}