package br.ufg.treinamento.sagui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufg.treinamento.sagui.entity.Aluno;
import br.ufg.treinamento.sagui.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;
	
	public void save(Aluno aluno) {
		this.alunoRepository.save(aluno);
	}
	
	public void delete(Integer id) {
		Aluno aluno = this.alunoRepository.findById(id).get();
		
		this.alunoRepository.delete(aluno);
	}
	
	public Aluno findById(Integer id) {
		return this.alunoRepository.findById(id).get();
	}
	
	public List<Aluno> findAll() {
		return this.alunoRepository.findAll();
	}
}
