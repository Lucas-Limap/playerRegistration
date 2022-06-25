package br.edu.univas.bd.fut.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.univas.bd.fut.entities.DetalhesTime;
import br.edu.univas.bd.fut.entities.Time;
import br.edu.univas.bd.fut.util.HibernateUtil;

public class maintenanceDetailTeams {
	
		DetalhesTime DetailsTeam = new DetalhesTime();
		Date d = new Date();
		EntityManager em = HibernateUtil.getEntityManager();
	
	public void createDetailTeam (String cidade, String Macote, String torcedor, String anoFundacao, Integer idTime) {
		
		DetailsTeam.setCidade(cidade);
		DetailsTeam.setMascote(Macote);
		DetailsTeam.setTorcedor(torcedor);
		DetailsTeam.setAnoFundacao(anoFundacao);
		DetailsTeam.setDtRegistro(d);
		
		Time team = em.find(Time.class, idTime );
		DetailsTeam.setIdTime(team);

		em.getTransaction().begin();
		em.persist(DetailsTeam);
		em.getTransaction().commit();
	
	}
	
	public void updateDetailTeam(Integer idDetailsTeams, String cidade, String Macote, String torcedor, String anoFundacao){
		DetalhesTime objDetailTeam = em.find(DetalhesTime.class, idDetailsTeams);
		
		objDetailTeam.setCidade(cidade);
		objDetailTeam.setMascote(Macote);
		objDetailTeam.setTorcedor(torcedor);
		objDetailTeam.setAnoFundacao(anoFundacao);
		objDetailTeam.setDtRegistro(d);

		em.getTransaction().begin();
		em.persist(objDetailTeam);
		em.getTransaction().commit();
		
	}
	
	public void removeDetailTeam(Integer idDetailsTeams){
		DetalhesTime objDetailTeam = em.find(DetalhesTime.class, idDetailsTeams);

		em.getTransaction().begin();
		em.remove(objDetailTeam);
		em.getTransaction().commit();
	}
	
	public void queriesPlayer () {
		String q2 = "select dt from DetalhesTime dt";
		TypedQuery<DetalhesTime> query = em.createQuery(q2, DetalhesTime.class);
		List<DetalhesTime> detailsTeams = query.getResultList();
		System.out.println("Detalhes dos Times: " + detailsTeams);
	}

}
