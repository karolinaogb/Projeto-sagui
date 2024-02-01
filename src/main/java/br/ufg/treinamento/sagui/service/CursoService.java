package br.ufg.treinamento.sagui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufg.treinamento.sagui.entity.Curso;
import br.ufg.treinamento.sagui.repository.CursoRepository;



@Service
public class CursoService {

	@Autowired
	private CursoRepository cursoRepository;
	
	public void save(Curso curso) {
		this.cursoRepository.save(curso);
	}
	
	public void delete(Integer id) {
		Curso curso = this.cursoRepository.findById(id).get();
		
		this.cursoRepository.delete(curso);
	}
	
	public Curso findById(Integer id) {
		return this.cursoRepository.findById(id).get();
	}
	
	public List<Curso> findAll() {
		return this.cursoRepository.findAll();
	}
}
