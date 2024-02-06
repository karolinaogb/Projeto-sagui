package br.ufg.treinamento.sagui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufg.treinamento.sagui.entity.Matricula;
import br.ufg.treinamento.sagui.repository.MatriculaRepository;

@Service
public class MatriculaService {

	@Autowired
	private MatriculaRepository matriculaRepository;
	
	public void save(Matricula matricula) {
		this.matriculaRepository.save(matricula);
		
	}
	
	public void delete(Integer id) {
		Matricula matricula = this.matriculaRepository.findById(id).get();
		
		this.matriculaRepository.delete(matricula);
	}
	
	public Matricula findById(Integer id) {
		return this.matriculaRepository.findById(id).get();
	}
	
	public List<Matricula> findAll() {
		return this.matriculaRepository.findAll();
	}
}