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

import br.ufg.treinamento.sagui.entity.Matricula;
import br.ufg.treinamento.sagui.service.MatriculaService;

/**
 * Implementação do protocolo REST
 */

@RestController
public class MatriculaResource {

	@Autowired
	private MatriculaService matriculaService;
	
	/**
	 * C - CREATE  
	 * * @param matricula
	 */
	@PostMapping("/matricula")
	public void save(@RequestBody Matricula matricula) {
		this.matriculaService.save(matricula);
	}
	
	/**
	 * R - READ
	 * @param id
	 * @return
	 */
	@GetMapping("/matricula/{id}")
	public Matricula findById(@PathVariable Integer id) {
		return this.matriculaService.findById(id);
	}
		/**
	 * R - READ
	 * @param id
	 * @return
	 */
	@GetMapping("/matricula")
	public List<Matricula> findall() {
		return this.matriculaService.findAll();
	}
	
	/**
	 * U - UPDATE
	 * @param matricula
	 */
	@PutMapping("/matricula")
	public void update(@RequestBody Matricula matricula) {
		this.matriculaService.save(matricula);
	}
	
	/**
	 * D - DELETE
	 * @param id
	 */
	@DeleteMapping("/matricula/{id}")
	public void delete(@PathVariable Integer id) {
		this.matriculaService.delete(id);
	}
	
	
	
}
