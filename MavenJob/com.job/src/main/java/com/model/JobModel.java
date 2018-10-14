package com.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.jpa.jobportal;

public class JobModel {
	
	public void registerUser(int candidateID, String candidateName , String skills ,int Exp) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		 EntityManager em=emf.createEntityManager();
	        jobportal p=new jobportal();
	        p.setUserDetails(candidateID, candidateName, skills, Exp);
	        em.getTransaction().begin();
	        em.persist(p);
	        em.getTransaction().commit();
}

}
