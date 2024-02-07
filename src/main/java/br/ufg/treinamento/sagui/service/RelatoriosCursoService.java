package br.ufg.treinamento.sagui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufg.treinamento.sagui.entity.RelatoriosCurso;
import br.ufg.treinamento.sagui.repository.RelatoriosCursoRepository;

@Service
public class RelatoriosCursoService {

	@Autowired
	private RelatoriosCursoRepository relatoriosCursoRepository;
	
	public void save(RelatoriosCurso relatoriosCurso) {
		this.relatoriosCursoRepository.save(relatoriosCurso);
		
	}
	
	public void delete(Integer id) {
		RelatoriosCurso relatoriosCurso = this.relatoriosCursoRepository.findById(id).get();
		
		this.relatoriosCursoRepository.delete(relatoriosCurso);
	}
	
	public RelatoriosCurso findById(Integer id) {
		return this.relatoriosCursoRepository.findById(id).get();
	}
	
	public List<RelatoriosCurso> findAll() {
		return this.relatoriosCursoRepository.findAll();
	}
	
}
