package br.edu.univas.bd.fut.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class DetalhesTime {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDetalhe;
	
	private String cidade;
	private String mascote;
	private String torcedor;
	private String anoFundacao;
	private Date dtRegistro;
	
	@OneToOne
	@JoinColumn(name = "idTime_fk")
	private Time idTime;
	
	public DetalhesTime () {
		
	}

	public Integer getIdDetalhe() {
		return idDetalhe;
	}

	public void setIdDetalhe(Integer idDetalhes) {
		this.idDetalhe = idDetalhes;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getMascote() {
		return mascote;
	}

	public void setMascote(String mascote) {
		this.mascote = mascote;
	}

	public String getTorcedor() {
		return torcedor;
	}

	public void setTorcedor(String torcedor) {
		this.torcedor = torcedor;
	}

	public String getAnoFundacao() {
		return anoFundacao;
	}

	public void setAnoFundacao(String anoFundacao) {
		this.anoFundacao = anoFundacao;
	}

	public Date getDtRegistro() {
		return dtRegistro;
	}

	public void setDtRegistro(Date dtRegistro) {
		this.dtRegistro = dtRegistro;
	}

	public Time getIdTime() {
		return idTime;
	}

	public void setIdTime(Time detalhesTime) {
		this.idTime = detalhesTime;
	}
	
	@Override
	public String toString() {
		return " \r[ " + this.idDetalhe + " | " + this.torcedor + " | " + this.mascote + " | " + 
					this.anoFundacao + " | " + this.cidade + " ] " ;
	}


}
