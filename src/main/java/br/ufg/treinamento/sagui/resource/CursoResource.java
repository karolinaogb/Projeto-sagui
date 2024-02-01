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

import br.ufg.treinamento.sagui.entity.Curso;
import br.ufg.treinamento.sagui.service.CursoService;


/**
 * Implementação do protocolo REST
 */
@RestController
public class CursoResource {

	@Autowired
	private CursoService cursoService;
	
	/**
	 * C - CREATE  
	 * * @param curso
	 */
	@PostMapping("/curso")
	public void save(@RequestBody Curso curso) {
		this.cursoService.save(curso);
	}
	
	/**
	 * R - READ
	 * @param id
	 * @return
	 */
	@GetMapping("/curso/{id}")
	public Curso findById(@PathVariable Integer id) {
		return this.cursoService.findById(id);
	}
		/**
	 * R - READ
	 * @param id
	 * @return
	 */
	@GetMapping("/curso")
	public List<Curso> findall() {
		return this.cursoService.findAll();
	}
	
	/**
	 * U - UPDATE
	 * @param curso
	 */
	@PutMapping("/curso")
	public void update(@RequestBody Curso curso) {
		this.cursoService.save(curso);
	}
	
	/**
	 * D - DELETE
	 * @param id
	 */
	@DeleteMapping("/curso/{id}")
	public void delete(@PathVariable Integer id) {
		this.cursoService.delete(id);
	}
	
}
