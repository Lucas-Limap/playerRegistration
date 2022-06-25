package br.edu.univas.bd.fut.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Time {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer idTime;
	private String nome;
	private String pais;
	private String estadio;
	private Date dtRegistro;
	
	@OneToMany(mappedBy = "time", fetch = FetchType.LAZY)
	private Set<Jogador> jogadores;
	
	@OneToOne(mappedBy = "idTime")
	private DetalhesTime detalhesTime;
	
	public Time () {
		
	}

	public Set<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(Set<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public Integer getIdTime() {
		return idTime;
	}

	public void setIdTime(Integer idTime) {
		this.idTime = idTime;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public Date getDtRegistro() {
		return dtRegistro;
	}

	public void setDtRegistro(Date dtRegistro) {
		this.dtRegistro = dtRegistro;
	}
	
	@Override
	public String toString() {
		return " \r[ " + this.idTime + " | " + this.nome + " | " + this.pais + " | " + this.estadio + " ] " ;
	}

}
