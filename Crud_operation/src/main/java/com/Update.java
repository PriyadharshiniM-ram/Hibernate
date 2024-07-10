package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em =emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		User u =em.find(User.class, 3);
		
		
		
		if (u!=null) {
			
			u.setPassword("8910");
			
			et.begin();
			em.merge(u);
			et.commit();
			System.out.println("DATA IS UPDATED......");
			
		}
		else {
			System.out.println("DATA IS NOT FONND");
		}
	}

}
