package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query q= em.createQuery("select u from User u ");

//		Query q= em.createQuery("select u from User u where u.phone between 100000 and 900000000");
		
		List<User> l=q.getResultList();
		
		for (User u : l) {
			System.out.println(u);
			
		}
		
	}

}
