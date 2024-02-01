package br.ufg.treinamento.sagui.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufg.treinamento.sagui.entity.Aluno;

/**
 * Repositório de aluno
 */
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}
