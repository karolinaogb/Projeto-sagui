package br.ufg.treinamento.sagui.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Mapeamento da Entidade de Curso
 */
@Entity
@Table(schema = "public", name = "CURSO")

public class Curso {
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;

		@Column(name="nome_curso")
		private String nomeCurso;
		
		@Column(name="data_inicio")
		private Date dataInicio;
		
		@Column(name="data_final")
		private Date dataFinal;

		@Column(name="carga_horaria")
		private Integer cargaHoraria;

		@Column(name="observacao")
		private String observacao;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNomeCurso() {
			return nomeCurso;
		}

		public void setNomeCurso(String nomeCurso) {
			this.nomeCurso = nomeCurso;
		}

		public Date getDataInicio() {
			return dataInicio;
		}

		public void setDataInicio(Date dataInicio) {
			this.dataInicio = dataInicio;
		}

		public Date getDataFinal() {
			return dataFinal;
		}

		public void setDataFinal(Date dataFinal) {
			this.dataFinal = dataFinal;
		}

		public Integer getCargaHoraria() {
			return cargaHoraria;
		}

		public void setCargaHoraria(Integer cargaHoraria) {
			this.cargaHoraria = cargaHoraria;
		}

		public String getObservacao() {
			return observacao;
		}

		public void setObservacao(String observacao) {
			this.observacao = observacao;
		}		
}
