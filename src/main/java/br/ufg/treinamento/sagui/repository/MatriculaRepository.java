package br.ufg.treinamento.sagui.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.ufg.treinamento.sagui.entity.Matricula;

/**
 * Repositório de matricula
 */
@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {

}