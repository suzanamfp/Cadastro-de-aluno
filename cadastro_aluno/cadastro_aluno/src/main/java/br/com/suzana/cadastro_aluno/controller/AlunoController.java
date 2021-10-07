package br.com.suzana.cadastro_aluno.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.suzana.cadastro_aluno.model.Aluno;
import br.com.suzana.cadastro_aluno.service.AlunoService;
import lombok.AllArgsConstructor;



@AllArgsConstructor
@RestController
@RequestMapping("/api/aluno")
public class AlunoController{
	

	private AlunoService service;
	
		@GetMapping
		public List<Aluno> listaAluno() {
			System.out.println("Listando alunos");
			 return this.service.alunos();
			 
			
		}
		
		@PostMapping
		public String salvaAluno(@RequestBody Aluno aluno) {
			this.service.saveAluno(aluno);
			return "Aluno salvo com sucesso ";
		}
		
	
		@DeleteMapping("/{id}")
		public String delete(@PathVariable("id") Long id) {
			this.service.remove(id);
			return "Demo removido com sucesso";	
		}

		
		@GetMapping("/name")
		public Aluno getByName(@RequestParam("name") String name) {
			return this.service.getByName(name);
			
		}
		
		@GetMapping("/curso")
		public Aluno getByCurso(@RequestParam("curso") String curso) {
			return this.service.getByCurso(curso);
		}
		
	
		@PutMapping
		public Aluno atualizaAluno(@RequestBody Aluno aluno) {
			return this.service.save(aluno);
			
		}
		
}



           


