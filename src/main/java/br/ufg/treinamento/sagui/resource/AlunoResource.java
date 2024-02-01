package br.ufg.treinamento.sagui.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.ufg.treinamento.sagui.entity.Aluno;
import br.ufg.treinamento.sagui.service.AlunoService;

/**
 * Implementação do protocolo REST
 */
@RestController
public class AlunoResource {

	@Autowired
	private AlunoService alunoService;
	
	/**
	 * C - CREATE
	 * @param aluno
	 */
	@PostMapping("/aluno")
	public void save(@RequestBody Aluno aluno) {
		this.alunoService.save(aluno);
	}
	
	/**
	 * R - READ
	 * @param id
	 * @return
	 */
	@GetMapping("/aluno/{id}")
	public Aluno findById(@PathVariable Integer id) {
		return this.alunoService.findById(id);
	}
	
	/**
	 * R - READ
	 * @param id
	 * @return
	 */
	@GetMapping("/aluno")
	public List<Aluno> findall() {
		return this.alunoService.findAll();
	}
	
	/**
	 * U - UPDATE
	 * @param aluno
	 */
	@PutMapping("/aluno")
	public void update(@RequestBody Aluno aluno) {
		this.alunoService.save(aluno);
	}
	
	/**
	 * D - DELETE
	 * @param id
	 */
	@DeleteMapping("/aluno/{id}")
	public void delete(@PathVariable Integer id) {
		this.alunoService.delete(id);
	}
	
}
