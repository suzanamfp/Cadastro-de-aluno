package br.com.suzana.cadastro_aluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.suzana.cadastro_aluno.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

	public Aluno findByName(String name);

	public Aluno findByCurso(String curso);

	
	
	
	
}
