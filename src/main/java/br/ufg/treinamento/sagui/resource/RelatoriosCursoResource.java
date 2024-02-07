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

import br.ufg.treinamento.sagui.entity.RelatoriosCurso;
import br.ufg.treinamento.sagui.service.RelatoriosCursoService;

/**
 * Implementação do protocolo REST
 */


@RestController
public class RelatoriosCursoResource {

	@Autowired
		private RelatoriosCursoService relatoriosCursoService;
		
		/**
		 * C - CREATE  
		 * * @param Relatorio
		 */
		@PostMapping("/relatoriosCurso")
		public void save(@RequestBody RelatoriosCurso relatoriosCurso) {
			this.relatoriosCursoService.save(relatoriosCurso);
		}
		
		/**
		 * R - READ
		 * @param id
		 * @return
		 */
		@GetMapping("/relatoriosCurso/{id}")
		public RelatoriosCurso findById(@PathVariable Integer id) {
			return this.relatoriosCursoService.findById(id);
		}
			/**
		 * R - READ
		 * @param id
		 * @return
		 */
		@GetMapping("/relatorioscurso")
		public List<RelatoriosCurso> findall() {
			return this.relatoriosCursoService.findAll();
		}
		
		/**
		 * U - UPDATE
		 * @param Relatorios
		 */
		@PutMapping("/relatoriosCurso")
		public void update(@RequestBody RelatoriosCurso relatoriosCursos) {
			this.relatoriosCursoService.save(relatoriosCursos);
		}
		
		/**
		 * D - DELETE
		 * @param id
		 */
		@DeleteMapping("/relatoriosCursos/{id}")
		public void delete(@PathVariable Integer id) {
			this.relatoriosCursoService.delete(id);
		}
}
