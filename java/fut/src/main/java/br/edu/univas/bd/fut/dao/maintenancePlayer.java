package br.edu.univas.bd.fut.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.univas.bd.fut.entities.Jogador;
import br.edu.univas.bd.fut.entities.Time;
import br.edu.univas.bd.fut.util.HibernateUtil;

public class maintenancePlayer {
	
		Jogador player = new Jogador();
		Date d = new Date();
		EntityManager em = HibernateUtil.getEntityManager();
	
	public void createPlayer (String nome, String Nacionalidade, String Cidade, String anoNascimento, Integer time) {
		
		player.setNome(nome);
		player.setNacionalidade(Nacionalidade);
		player.setCidade(Cidade);
		player.setAnoNascimento(anoNascimento);
		player.setDtRegistro(d);
		
		Time team = em.find(Time.class, time);
		player.setTime(team);

		em.getTransaction().begin();
		em.persist(player);
		em.getTransaction().commit();
	
	}
	
	public void updatePlayer(Integer idJogador,String nome, String Nacionalidade, String Cidade, String anoNascimento,  Integer idTime){
		Jogador objPlayer = em.find(Jogador.class, idJogador);
		
		objPlayer.setNome(nome);
		objPlayer.setNacionalidade(Nacionalidade);
		objPlayer.setCidade(Cidade);
		objPlayer.setAnoNascimento(anoNascimento);
		objPlayer.setDtRegistro(d);
		
		Time team = em.find(Time.class, idTime);
		objPlayer.setTime(team);

		em.getTransaction().begin();
		em.merge(objPlayer);
		em.getTransaction().commit();
		
	}
	
	public void removePlayer(Integer idJogador){
		Jogador objPlayer = em.find(Jogador.class,  idJogador);

		em.getTransaction().begin();
		em.remove(objPlayer);
		em.getTransaction().commit();
	}
	
	public void queriesPlayer () {
//		String ql = "select j.nome, t.nome from Jogador j join Time t on t.idTime = j.time";
		String q2 = "select j from Jogador j";
		TypedQuery<Jogador> query = em.createQuery(q2, Jogador.class);
		List<Jogador> players = query.getResultList();
		System.out.println("Jogadores:" + players);
	}

}
