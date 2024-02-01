package br.ufg.treinamento.sagui.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufg.treinamento.sagui.entity.Curso;

	/**
	 * Repositório de Curso
	 */
	@Repository
	public interface CursoRepository extends JpaRepository<Curso, Integer> {
						
	}
