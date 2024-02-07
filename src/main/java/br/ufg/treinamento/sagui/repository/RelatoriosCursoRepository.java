package br.ufg.treinamento.sagui.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.ufg.treinamento.sagui.entity.RelatoriosCurso;

/**
 * Repositório de relatoriosCurso
 */
@Repository
public interface RelatoriosCursoRepository extends JpaRepository<RelatoriosCurso, Integer> {

}
